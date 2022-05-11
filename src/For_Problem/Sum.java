package For_Problem;

import java.util.Scanner;

public class Sum {
    public static void main(String args[]) throws Exception {
        // 합 #8393
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <=a; i++){
            sum +=i;
        }
        System.out.println(sum);
    }
}
