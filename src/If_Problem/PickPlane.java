package If_Problem;

import java.util.Scanner;

public class PickPlane {

    public static void main(String args[]) {
        // 사분면 고르기 #14681
//         (+, +) = 1
//         (-, +) = 2
//         (-, -) =3
//        (+, -) = 4

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > 0 && b > 0) {
            System.out.println("1");
        } else if (a < 0 && b > 0) {
            System.out.println("2");
        } else if (a < 0 && b < 00) {
            System.out.println("3");
        } else {
            System.out.println("4");
        }
    }
}
