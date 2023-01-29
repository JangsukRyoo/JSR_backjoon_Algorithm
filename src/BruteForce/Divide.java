package BruteForce;

import java.util.Scanner;

public class Divide {
    public static void main(String args[]) throws Exception {
//        #1075 나누기

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long f = sc.nextLong();
        int res = 0;

        n = n/100;
        n = n*100;

        for(int i = 0; i<100; i++){
            if((n+i)%f == 0){
                res = i;
                break;
            }
        }
        if(res <10){
            System.out.println("0" + res);
        }else {
            System.out.println(res);
        }
    }
}


