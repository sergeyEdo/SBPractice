package u_1_ex_8;

import java.util.Scanner;

public class ex_8 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        char SYMBOL = 'C'; // Загадонное число

        while(true) {
            // A = 10, Z = 35; Character.getNumericValue(symbol)

            System.out.print("Введите букву! (латиница) ");
            String temp_line = scanner.nextLine();
            char symbol = temp_line.charAt(0);

            if(Character.getNumericValue(symbol) < 10 | Character.getNumericValue(symbol) > 35){
                System.out.println("Некорректное значение!");
                continue;
            }

            if(symbol == SYMBOL) {
                System.out.println("Right");
                return;
            } if (symbol > SYMBOL) {
                System.out.println("You're too high");
            } if (symbol < SYMBOL) {
                System.out.println("You're too low");
            }
        }
    }
}
