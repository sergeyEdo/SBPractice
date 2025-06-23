package shell;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Console {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Invoker invoker = new Invoker();

        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("> ");
            String user_command = in.nextLine();
            invoker.execute(user_command);
            System.out.println();
        }
    }
}
