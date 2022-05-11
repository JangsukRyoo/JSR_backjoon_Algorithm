package For_Problem;

import java.util.Scanner;

public class AplusB8 {
    public static void main(String args[]) throws Exception {
        // A + B 8 #11022

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a + b));
        }
    }
}
