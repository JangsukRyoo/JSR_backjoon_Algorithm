package For_Problem;

import java.util.Scanner;

public class MakeStar {
    public static void main(String args[]) throws Exception {
        //별찍기 -1 #2438
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <=n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
