package While_Problem;

import java.util.Scanner;

public class AplusB1 {
    public static void main(String args[]) {
        //  A + B -5 10952

        Scanner sc = new Scanner(System.in);
        do {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if ((a + b) == 0) {
                break;
            }
            System.out.println(a + b);
        } while (true);

    }
}
