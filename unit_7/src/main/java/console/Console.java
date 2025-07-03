package console;

import commandprocessor.BasicCommandProcessor;
import commandprocessor.CommandData;
import commandprocessor.CommandProcessor;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Console {
    public static void main(String[] args) throws
            InvocationTargetException,
            NoSuchMethodException,
            InstantiationException,
            IllegalAccessException,
            IOException,
            ClassNotFoundException {
        Invoker invoker = new Invoker("commands");

        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("> ");
            String user_command = in.nextLine();
            CommandProcessor commandProcessor = new BasicCommandProcessor();
            CommandData formattedCommand = commandProcessor.formatCommand(user_command);
            if (formattedCommand == null) {
                System.out.println("Некорректная команда");
                continue;
            }
            invoker.execute(formattedCommand);
            System.out.println();
        }
    }
}