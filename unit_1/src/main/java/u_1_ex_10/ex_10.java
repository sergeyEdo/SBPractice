package u_1_ex_10;

import java.util.Scanner;

public class ex_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();

        if (number < 1 || number > 100) {
            return;
        }

        String answer = "";

        // Сотня - C
        if (number >= 100) {
            answer += "C";
            number -= 100;
        }

        // Девяносто - XC
        if (number >= 90) {
            answer += "XC";
            number -= 90;
        }

        // Пятьдесят - L
        if (number >= 50) {
            answer += "L";
            number -= 50;
        }

        // Сорок - XL
        if (number >= 40) {
            answer += "XL";
            number -= 40;
        }

        // Десятки - X
        while (number >= 10) {
            answer += "X";
            number -= 10;
        }

        // Девять - IX
        if (number == 9) {
            answer += "IX";
            number -= 9;
        }

        // Пять - V
        if (number >= 5) {
            answer += "V";
            number -= 5;
        }

        // Четыре - IV
        if (number == 4) {
            answer += "IV";
            number -= 4;
        }

        // Единицы - I
        while (number >= 1) {
            answer += "I";
            number -= 1;
        }

        System.out.println("Римская запись: " + answer);
    }
}
