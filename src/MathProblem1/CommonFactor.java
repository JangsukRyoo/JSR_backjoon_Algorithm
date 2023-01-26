package MathProblem1;

import java.util.Scanner;

public class CommonFactor {
    public static void main(String args[]) {
        // #2609 최대공약수 최소공배수
        // 뉴클리드 호제법
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(gdc(a,b));
        System.out.println(lcm(a,b));
   }

   static int gdc(int a , int b){
        if(a>b){
            int tmp = a;
            a = b;
            a = tmp;
        }
        while(b!=0){
            int r = a%b;
            a = b;
            b = r;
        }
        return a;
   }

   static int lcm(int a, int b){
        return a*b / gdc(a,b);
   }
}
