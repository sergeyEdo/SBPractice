package shell;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Console {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, IOException {
        Invoker invoker = new Invoker("shell.commands");

        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("> ");
            String user_command = in.nextLine();
            invoker.execute(user_command);
            System.out.println();
        }
    }
}
