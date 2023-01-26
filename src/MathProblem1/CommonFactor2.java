package MathProblem1;

import java.util.Scanner;

public class CommonFactor2 {
    public static void main(String args[]) {
        // #2609 최소공배수
        Scanner sc = new Scanner(System.in);
        int ct = sc.nextInt();

        for(int i = 0; i < ct; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a * b /gdc(a,b));
        }
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
}
