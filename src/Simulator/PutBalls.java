package Simulator;

import java.util.Arrays;
import java.util.Scanner;


public class PutBalls {
    public static void main(String[] args) {
//    #10810 공넣기
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int[] inpt = Arrays.stream(a.split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = inpt[0];
        int m = inpt[1];

        int[] arr = new int[n+1];

        for(int x = 0; x<m; x++){
         String b = sc.nextLine();
            int[] box = Arrays.stream(b.split(" ")).mapToInt(Integer::parseInt).toArray();
            int i = box[0];
            int j = box[1];
            int k = box[2];

            for(int y = i; y< j+1; y++){
                arr[y] = k;
            }
        }
        for (int q = 1; q<arr.length; q++){
            System.out.print(arr[q] +" ");
        }
    }
}
