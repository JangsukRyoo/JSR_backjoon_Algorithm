package StringProblems;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

//     숫자의 합 #11720
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next();
        int sum = 0;

        for(int i =0; i< n; i++){
            sum += a.charAt(i)-'0';
        }
        System.out.println(sum);

    }
}






















