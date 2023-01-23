package MaxandMin_Problems;

import java.util.Scanner;

public class Maximum2566 {

    public static void main(String args[]) {
    // # 2566 최대값 스패셜저지
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[9][9];
        int max= 0,  a= 0,   b= 0;

        for(int i = 0; i < arr.length; i++){
            for( int j = 0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();

                if(arr[i][j]>max){
                    max = arr[i][j];
                    a = i;
                    b = j;
                }
            }
        }
        System.out.println(max);
        System.out.println((a+1) + " " + (b+1));
    }
}





























