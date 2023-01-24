package Simulator;

import java.util.Arrays;
import java.util.Scanner;
public class Fatigue {
    public static void main(String[] args) {
//    #22864 피로도
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] inpt = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        int a = inpt[0];
        int b = inpt[1];
        int c = inpt[2];
        int m = inpt[3];
        int now = 0, cnt = 0 ;
    
        for(int i = 0; i<24; i++){
            if(now + a <=m){
                now += a;
                cnt += b;
            }else{
                now -= c;
                now = Math.max(0, now);
            }
        }
        System.out.println(cnt);
    }
}
