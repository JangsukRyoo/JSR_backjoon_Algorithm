package MathProblem1;

import java.util.Scanner;

public class SugarDeli {
    public static void main(String args[]) {
        // #2839 설탕배달

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = -1;

        for(int i = 0; i<5; i++){
            int now = n - (3*i);

            if(now >= 0 && now % 5 ==0){
                res = (now/5) + i;
                break;
            }
        }
        System.out.println(res);
    }
}
