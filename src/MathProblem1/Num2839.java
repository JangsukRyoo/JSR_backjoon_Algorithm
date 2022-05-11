package MathProblem1;

import java.io.IOException;
import java.util.Scanner;

public class Num2839 {
    public static void main(String args[]) throws IOException {
        //#2839

        Scanner sc = new Scanner(System.in);
        int ct = sc.nextInt();

        if (ct == 4 || ct == 7) {
            System.out.println(-1);
        }
        else if (ct % 5 == 0) {
            System.out.println(ct / 5);
        }
        else if (ct % 5 == 1 || ct % 5 == 3) {
            System.out.println((ct / 5) + 1);
        }
        else if (ct % 5 == 2 || ct % 5 == 4) {
            System.out.println((ct / 5) + 2);
        }

   }
}
