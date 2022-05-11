package MathProblem1;

import java.io.IOException;
import java.util.Scanner;

public class Num1193 {
    public static void main(String args[]) {
        // #1193
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int crossCt = 1;
        int prev_sum = 0;

        while (true) {

            if (X <= prev_sum + crossCt) {

                if (crossCt % 2 == 1) {
                    System.out.print((crossCt - (X - prev_sum - 1)) + "/" + (X - prev_sum));
                    break;
                }
                else {
                    System.out.print((X - prev_sum) + "/" + (crossCt - (X - prev_sum - 1)));
                    break;
                }
            } else {
                prev_sum += crossCt;
                crossCt++;
            }
        }
    }
}