package shell;

import shell.commands.Command;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public final class Invoker {
    static public ArrayList<Command> commandList = new ArrayList<>();

    public Invoker() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?>[] clazzes = new Class<?>[]{
                shell.commands.DateCommand.class,
                shell.commands.TimeCommand.class,
                shell.commands.PWDCommand.class,
                shell.commands.ExitCommand.class,
                shell.commands.HelpCommand.class
        };

        for (Class<?> clazz : clazzes) {
            if (clazz.isAnnotationPresent(CommandAnnotation.class)) {
                CommandAnnotation annotation = clazz.getAnnotation(CommandAnnotation.class);
                Command command = (Command) clazz.getDeclaredConstructor(String.class, String.class).newInstance(annotation.commandName(), annotation.commandDescription());
                commandList.add(command);
            }
        }
    }

    public void register(Command command) {
        commandList.add(command);
    }

    public void execute(String commandName) {
        Command command = null;
        for(Command cmd: commandList){
            if(cmd.commandName.equals(commandName)){
                command = cmd;
            }
        }
        if(command == null){
            System.out.println("Ошибка: неизвестная команда '" + commandName + "'");
            return;
        }
        command.execute();
    }
}