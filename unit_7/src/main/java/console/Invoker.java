package console;

import commandprocessor.CommandData;
import commands.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/**
 * Класс хранящий в себе все доступные команды из пользовательского пакета, вызывающий и обрабатывающий команды пользователя.
 */
public final class Invoker {
    static public ArrayList<Command> commandList = new ArrayList<>();

    /**
     * Выполняет загрузку всех команд из пакета.
     * @param packageName пакет откуда надо загрузить все команды.
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws IOException
     * @throws ClassNotFoundException
     */
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

    /**
     * Регистрация команды в классе.
     * @param command команда.
     */
    public void register(Command command) {
        commandList.add(command);
    }

    /**
     * Выполнение программы
     * @param formattedCommand команда.
     */
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