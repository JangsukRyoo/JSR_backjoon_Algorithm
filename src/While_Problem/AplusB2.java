package While_Problem;

import java.util.Scanner;

public class AplusB2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

 //         A + B +4
        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}
