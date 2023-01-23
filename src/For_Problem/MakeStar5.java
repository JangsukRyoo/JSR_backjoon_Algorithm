package For_Problem;

import java.util.Scanner;

public class MakeStar5 {
    public static void main(String args[]) throws Exception {
        //#2442 별찍기 5
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <=n; i++){
            for(int j = i; j < n; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < i*2-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
