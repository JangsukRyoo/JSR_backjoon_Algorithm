package Simulator;

import java.util.Scanner;

public class HailStone {
    public static void main(String[] args) {
//    #3943 헤일스톤수열
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i<t; i++){
            int n = sc.nextInt();
            int max = n;
            while (n>1){
                if(n % 2 == 0){
                    n = n/2;
                }else{
                    n = 3 * n + 1;
                    max = Math.max(max,n);
                }
            }
            System.out.println(max);
        }
    }
}
