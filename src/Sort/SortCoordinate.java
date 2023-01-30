package Sort;


import java.util.Arrays;
import java.util.Scanner;

public class SortCoordinate {

    public static void main(String[] args)   {
//        #11650 좌표 정렬하기

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int ct =  sc.nextInt();
        int[][] arr = new int[ct][2];

        for(int i = 0; i<ct; i++){
            arr[i][0]  = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        Arrays.sort(arr, (e1, e2) -> {
            if(e1[0] == e2[0]) {
                return e1[1] - e2[1];
            } else {
                return e1[0] - e2[0];
            }
        });

        for(int i = 0; i < ct; i++) {
            sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
        }
        System.out.println(sb);
    }
}