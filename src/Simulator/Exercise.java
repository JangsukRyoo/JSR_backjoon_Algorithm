package Simulator;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
//    #1173 운동
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int[] inpt = Arrays.stream(a.split(" ")).mapToInt(Integer::parseInt).toArray();
        int N = inpt[0];
        int m = inpt[1];
        int M = inpt[2];
        int T = inpt[3];
        int R = inpt[4];
        int res = 0;
        int cnt = 0;
        int now = m;

        if(m+T >M){
            System.out.println(-1);
        }else{
            while(true){
                if( now +T <= M){
                    cnt += 1;
                    now += T;
                }else{
                    now -= R;
                    now = Math.max(now,m);
                }
                res += 1;
                if(cnt == N ){
                    break;
                }
            }
            System.out.println(res);
        }
    }
}
