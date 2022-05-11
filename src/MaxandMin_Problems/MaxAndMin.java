package MaxandMin_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMin {

    public static void main(String args[]) {
        //최소값 최대값 10818

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];


        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[n-1]);
    }
}





























