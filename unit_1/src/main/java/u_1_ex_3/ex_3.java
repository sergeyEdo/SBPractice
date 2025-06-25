package u_1_ex_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ex_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp_number = scanner.nextInt();

        List<Integer> inp_number_to_list = new ArrayList<>();
        while(inp_number != 0){
            inp_number_to_list.add(inp_number % 10);
            inp_number /= 10;
        }

        int inp_number_size = inp_number_to_list.size();
        for(int i = 0;i < inp_number_size / 2;i++){
            System.out.println(inp_number_to_list.get(i));
            System.out.println(inp_number_to_list.get(inp_number_size-i-1));
            if(inp_number_to_list.get(i) != inp_number_to_list.get(inp_number_size-i-1)){
                System.out.println("НЕ ПАЛИНДРОМ!");
                return;
            }
        }
        System.out.println("ПАЛИНДРОМ!");
        return;
    }
}
