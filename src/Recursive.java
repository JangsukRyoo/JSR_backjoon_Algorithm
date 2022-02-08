
import java.util.Scanner;
public class Recursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        //10872 팩토리얼
//
//        int n = sc.nextInt();
//        System.out.println(factorial(n));

        //#10870 피보나치

        int n = sc.nextInt();

        int[] fibonacci = new int[n + 1];

        for(int i = 0; i < fibonacci.length; i++) {
            // F(0) 과 F(1) 은 각각 0 과 1 로 초기화
            if(i == 0) fibonacci[0] = 0;
            else if(i == 1) fibonacci[1] = 1;
            else fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println(fibonacci[n);


    }
//    public static int factorial(int n){
//        if (n <= 1) {
//            return 1;
//        } else {
//            return n * factorial(n - 1);
//        }
//    }
}
