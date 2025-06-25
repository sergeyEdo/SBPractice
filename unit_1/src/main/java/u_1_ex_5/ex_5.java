package u_1_ex_5;

import java.util.Scanner;

public class ex_5 {
    public static void main(String[] args) {
        double COEF = 0.17;

        Scanner scanner = new Scanner(System.in);
        double inp_earth_weight = scanner.nextInt();

        double out_moon_weight = inp_earth_weight * COEF;
        System.out.println(out_moon_weight);
    }
}
