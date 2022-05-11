package MathProblem2;
import java.util.Scanner;

public class Num3053 {
    public static boolean prime[];

    public static void main(String args[]){

//        #3053
        Scanner sc = new Scanner(System.in);
        double R = sc.nextDouble();
        sc.close();

        System.out.println(R * R * Math.PI);
        System.out.println(2 * R * R);
    }
}

