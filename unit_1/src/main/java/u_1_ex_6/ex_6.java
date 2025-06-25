package u_1_ex_6;

import java.lang.Math;
import java.util.Scanner;

public class ex_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp_number = scanner.nextInt();

        for(int i = 2;i <=  Math.sqrt(inp_number);i++) {
            if(inp_number % i == 0) {
                System.out.println("ЧИСЛО НЕ ПРОСТОЕ!");
                return;
            }
        }
        System.out.println("ЧИСЛО ПРОСТОЕ!");
    }
}