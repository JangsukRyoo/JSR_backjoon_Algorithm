package For_Problem;

import java.util.Scanner;

public class MakeStar6 {
    public static void main(String args[]) throws Exception {
        //#2443 별찍기 6
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int k=1; k< i; k++){
                System.out.print(" ");
            }
            for(int j = (2*n)-(2*i-1); j >0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
