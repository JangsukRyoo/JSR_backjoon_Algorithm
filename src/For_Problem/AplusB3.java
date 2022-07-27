package For_Problem;

import java.util.Scanner;

public class AplusB3 {
    public static void main(String args[]) throws Exception {
        // A+B -3 # 10950
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++){
            int a = sc.nextInt();
            int b= sc.nextInt();
            System.out.println(a+b);
         }
    }
}
