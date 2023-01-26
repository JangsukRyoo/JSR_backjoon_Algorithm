package MathProblem1;

import java.util.Scanner;

public class SangeuNald {
    public static void main(String args[]) {
        // #5543 상근날드
        Scanner sc = new Scanner(System.in);
        int sang = sc.nextInt();
        int jung = sc.nextInt();
        int ha = sc.nextInt();
        int coke = sc.nextInt();
        int cider = sc.nextInt();

        int minH = Math.min(Math.min(sang,jung),ha);
        int minS = Math.min(coke, cider);

        System.out.println(minS+minH -50);

    }
}
