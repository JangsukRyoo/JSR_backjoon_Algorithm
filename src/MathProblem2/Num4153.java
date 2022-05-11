package MathProblem2;
import java.util.Scanner;

public class Num4153 {
    public static boolean prime[];

    public static void main(String args[]){

//        #4153
        Scanner sc = new Scanner(System.in);

        while (true) {

            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            if (x == 0 && y == 0 && z == 0) break;

            if ((x * x + y * y) == z * z) {
                System.out.println("right");
            } else if (x * x == (y * y + z * z)) {
                System.out.println("right");
            } else if (y * y == (z * z + x * x)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }

        }
    }
}

