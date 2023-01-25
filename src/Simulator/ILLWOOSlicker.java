package Simulator;

import java.util.Arrays;
import java.util.Scanner;

public class ILLWOOSlicker {
    public static void main(String[] args) {
//    #20361 일우는 야바위꾼
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int[] sett = Arrays.stream(st.split(" ")).mapToInt(Integer::parseInt).toArray();
        int cups = sett[0];
        int ball = sett[1];
        int n = sett[2];

        for(int i=1; i<=n; i++){
            String sw = sc.nextLine();
            int[] ch = Arrays.stream(sw.split(" ")).mapToInt(Integer::parseInt).toArray();
            int sw1 = ch[0];
            int sw2 = ch[1];

            if(ball == sw1){
                ball = sw2;
            }else if (ball == sw2) {
                ball = sw1;
            }
        }
        System.out.println(ball);
    }
}
