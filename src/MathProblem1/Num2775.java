package MathProblem1;

import java.io.IOException;
import java.util.Scanner;

public class Num2775 {
    public static void main(String args[]) {

//      #2775

        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int[][] apt = new int[15][15];

        apt[0][0] = 1;

        for (int i = 0; i < apt.length; i++) {
            apt[0][i] = i + 1;
            apt[i][0] = 1;
        }

        for (int i = 1; i < apt.length; i++) {
            for (int j = 1; j < apt.length; j++) {
                apt[i][j] = apt[i - 1][j] + apt[i][j - 1];
            }
        }

        while (testCase-- > 0) {
            int floor = sc.nextInt();
            int roomNum = sc.nextInt();
            System.out.println(apt[floor][roomNum - 1]);

        }
    }
}

