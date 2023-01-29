package Simulator;

import java.util.Scanner;

public class Sequence3n1 {
    public static void main(String[] args) {
//    #14920 3n+1 수열

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ct = 1;

        while(num >1){
            if(num %2 == 0){
                num = num/2;
            }else if(num % 2 != 0){
                num = 3*num+1;
            }
            ct ++;
        }
        System.out.println(ct);
    }
}
