package MathProblem1;

import java.util.Scanner;

public class HoneyComb {
    public static void main(String args[]) {
        //  #2292 벌집
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ct = 1;
        int range = 2;

        if (n ==1) {
            System.out.println(1);
        }else{
            while(range <= n){
                range = range + (6 *ct);
                ct ++;
            }
            System.out.println(ct);
        }

   }
}
