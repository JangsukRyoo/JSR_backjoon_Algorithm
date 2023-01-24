package Simulator;

import java.util.Arrays;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
//    #10103 주사위 게임
        Scanner sc = new Scanner(System.in);
        int ct = Integer.parseInt(sc.nextLine());
        int a = 100 , b  = 100;

        for(int i = 0; i <ct; i ++){
            String str = sc.nextLine();
            int[] dice = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();

            if(dice[0] < dice[1]){
                a -= dice[1];
            }else if(dice[0] > dice[1]){
                b -=dice[0];
            }
        }
        System.out.println(a);
        System.out.println(b);
    }
}
