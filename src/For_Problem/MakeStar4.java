package For_Problem;

import java.util.Scanner;

public class MakeStar4 {
    public static void main(String args[]) throws Exception {
        //#2441 별찍기 4
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i <n; i++){
            for(int k=0; k<i; k++){
                System.out.print(" ");
            }
            for(int j = i; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
