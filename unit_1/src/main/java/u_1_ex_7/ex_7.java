package u_1_ex_7;

import java.math.BigInteger;
import java.util.Scanner;

public class ex_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fib_num = scanner.nextInt();

        fibonachi(fib_num);

        /*
        (for(int i = 0;i < 101;i++) {
            System.out.println(i + " : " + fibonachi(i));
        }
        */
    }

    public static BigInteger fibonachi(int fib_num){
        BigInteger past = new BigInteger("0");
        BigInteger current = new BigInteger("1");
        BigInteger future = new BigInteger("0");

        if(fib_num == 0) {
            return past;
        } if(fib_num == 1) {
            return current;
        }

        for(int i = 1;i < fib_num;i++) {
            future = current.add(past);
            past = current;
            current = future;
        }
        return future;
    }
}
