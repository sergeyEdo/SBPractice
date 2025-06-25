package u_1_ex_9;

import java.util.Scanner;
import java.lang.Math;

public class ex_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a == 0) {
            return;
        }

        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            System.out.println("Корней нет");
        } else if (discriminant == 0) {
            System.out.println("Один корень: " + (-b) / (2 * a));
        } else {
            double sqrtD = Math.sqrt(discriminant);
            System.out.println("Два корня: " + (-b + sqrtD) / (2 * a) + " и " + (-b - sqrtD) / (2 * a));
        }
    }
}
