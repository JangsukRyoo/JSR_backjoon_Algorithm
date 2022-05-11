package While_Problem;

import java.util.Scanner;

public class PlusCycle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
// 더하기 사이클 #1110

        String num = sc.nextLine();
        int a,b;
        int ct = 0;
        int ini = 0;
        int sum = 0;
        if(num.length() == 1){
            a = 0;
            b = (int)num.charAt(0)-'0';
        }else{
          a = (int)num.charAt(0)-'0';
          b = (int)num.charAt(1)-'0';
        }
        ini = (a*10)+b;
        while(true){
            sum = a+b;
            a=b;
            b=(sum%10);
            int newNum = (a*10)+b;
            ct ++;
            if(ini == newNum){
               break;
            }
        }
        System.out.println(ct);

    }
}
