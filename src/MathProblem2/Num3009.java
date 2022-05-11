package MathProblem2;
import java.util.Scanner;

public class Num3009 {
    public static boolean prime[];

    public static void main(String args[]){
//      #3009

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][2];
        int x = 0, y = 0;

        for (int i = 0; i < 3; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        if (arr[0][0] == arr[1][0]) x = arr[2][0];
        else if (arr[0][0] == arr[2][0]) x = arr[1][0];
        else if (arr[1][0] == arr[2][0]) x = arr[0][0];

        if (arr[0][1] == arr[1][1]) y = arr[2][1];
        else if (arr[0][1] == arr[2][1]) y = arr[1][1];
        else if (arr[1][1] == arr[2][1]) y = arr[0][1];

        System.out.println(x + " " + y);
    }
}


