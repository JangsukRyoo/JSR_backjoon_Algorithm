package MathProblem2;
import java.util.Scanner;

public class Num1978 {
    public static boolean prime[];

    public static void main(String args[]){

//        #1978
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ct = 0;

        for (int i = 0; i < n; i++) {
            boolean isPrime = true;
            int num = sc.nextInt();

            if (num == 1) {
                continue;
            }
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                ct++;
            }
        }
        System.out.println(ct);
    }
}
