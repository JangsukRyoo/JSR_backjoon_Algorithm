package MathProblem1;

import java.util.Scanner;

public class FactorialIsZero {
    public static void main(String args[]) {
        // #1676 팩토리얼 0의 개수

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ct5 = 0;

        for(int i =1; i<n+1; i++){
            int x = i;

            while ( x % 5 == 0){
                x = x/5;
                ct5 ++;
            }
        }
        System.out.println(ct5);
    }
}
