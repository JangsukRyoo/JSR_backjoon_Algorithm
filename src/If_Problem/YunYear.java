package If_Problem;

import java.util.Scanner;

public class YunYear {

    public static void main(String args[]) {

        //윤년 #2753
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (((a % 4) == 0) && (((a % 100) != 0) || ((a % 400) == 0))) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

    }
}
