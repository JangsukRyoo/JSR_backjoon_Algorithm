package For_Problem;

import java.util.Scanner;

public class MakeStar3 {
    public static void main(String args[]) throws Exception {
        //#2440 별찍기 3
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n; i >=1; i--){
            for(int j = i; j >= 1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
