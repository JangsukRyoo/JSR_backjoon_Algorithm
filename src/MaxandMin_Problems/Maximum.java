package MaxandMin_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum {

    public static void main(String args[]) {

        //최대값 1 , 2  # 2562

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for(int i = 0; i<9; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[8]);
        System.out.println(arr.length-1);

    }
}





























