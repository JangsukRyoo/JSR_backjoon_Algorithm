package If_Problem;

import java.util.*;

public class VerifierNumber {

    public static void main(String args[]) {
        // 검증수 #2475
        Scanner sc = new Scanner(System.in);
        String[] rs = sc.nextLine().split(" ");
        int sum = 0;

        for(String i : rs){
            int num = Integer.parseInt(i);
            sum += num * num;
        }
        System.out.println(sum % 10);
    }
}
