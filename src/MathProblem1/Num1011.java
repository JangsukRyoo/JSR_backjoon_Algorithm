package MathProblem1;
import java.util.Scanner;


public class Num1011 {
    public static void main(String args[]) {
//      1011 Math 마지막

        Scanner sc = new Scanner(System.in);

        int ct = sc.nextInt();

        for(int i = 0; i < ct; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            int distance = Y - X;
            int max = (int)Math.sqrt(distance);

            if(max == Math.sqrt(distance)) {
                System.out.println(max * 2 - 1);
            }
            else if(distance <= max * max + max) {
                System.out.println(max * 2);
            }
            else {
                System.out.println(max * 2 + 1);
            }
        }
   }
}
