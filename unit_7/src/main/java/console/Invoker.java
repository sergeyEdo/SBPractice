package console;

import commandprocessor.CommandData;
import commands.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public final class Invoker {
    static public ArrayList<Command> commandList = new ArrayList<>();

    public Invoker(String packageName) throws
            NoSuchMethodException,
            InvocationTargetException,
            InstantiationException,
            IllegalAccessException,
            IOException,
            ClassNotFoundException {

        Class<?>[] clazzes = PackageScannerUtil.getClasses(packageName);

        for (Class<?> clazz : clazzes) {
            if (clazz.isAnnotationPresent(CommandAnnotation.class)) {
                CommandAnnotation annotation = clazz.getAnnotation(CommandAnnotation.class);
                Command command = (Command) clazz.getDeclaredConstructor(String.class, String.class)
                        .newInstance(annotation.commandName(), annotation.commandDescription());
                register(command);
            }
        }
    }

    public void register(Command command) {
        commandList.add(command);
    }

    public void execute(CommandData formattedCommand) {
        String commandName = formattedCommand.commandName;
        String commandParam = formattedCommand.commandParam;

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

        if (command instanceof OutputCommand) {
            ((OutputCommand) command).execute();
        }
        if (command instanceof InputCommand) {
            ((InputCommand) command).execute(commandParam);
        }
    }
}