package u_1_ex_4;

public class ex_4 {
    public static void main(String[] args) {
        int n = 340;
        int sum = 0;

        while(n != 0){
            sum += n % 10;
            n /= 10;
        }

        System.out.println(sum);
    }
}
