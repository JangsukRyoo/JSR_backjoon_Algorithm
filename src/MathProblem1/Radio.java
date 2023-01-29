package MathProblem1;

import java.util.Scanner;

public class Radio {
    public static void main(String args[]) {
        // #3135 라디오

        Scanner sc = new Scanner(System.in);
        int st = sc.nextInt();
        int goal = sc.nextInt();
        int ct = sc.nextInt();
        int res = Math.abs(goal -st);

        for(int i = 0; i<ct; i++){
            int x = sc.nextInt();
            int now = Math.abs(goal - x) +1;
            res = Math.min(res, now);
        }
        System.out.println(res);
    }
}
