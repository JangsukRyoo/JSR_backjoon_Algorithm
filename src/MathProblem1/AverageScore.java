package MathProblem1;

import java.util.Scanner;

public class AverageScore {
    public static void main(String args[]) {
        // #10039 평균 점수
        Scanner sc = new Scanner(System.in);
        int res =0;
        for(int i = 0; i<5; i++){

            int a = sc.nextInt();
            res += Math.max(a,40);
        }
        System.out.println(res/5);
    }
}
