package Simulator;

import java.util.Scanner;

public class Transparent {
    public static void main(String[] args) {
//    #1531 투명
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] pic = new int[101][101];
        int ct =0;

        for(int i =0; i <n; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for(int j =x1; j<x2+1; j++){
                for(int k = y1; k<y2+1; k++){
                    pic[j][k] += 1;
                }
            }
        }
        for(int i =1; i<101; i++){
            for(int j = 1; j<101; j++){
                if(pic[i][j] > m){
                    ct +=1;
                }
            }
        }
        System.out.println(ct);
    }
}
