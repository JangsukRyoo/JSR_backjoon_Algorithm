package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci2 {
    static int[] bUp;
    public static void main(String[] args) throws IOException {
//        #2748 피보나치의 수 2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        bUp = new int[N+1];
        System.out.println(fibonacci(N));
    }

    // 피보나치 함수
    public static int fibonacci(int n) {
        bUp[0] = 0; bUp[1]=1;

        for(int i=2; i<=n; i++){
            bUp[i]= bUp[i-1] + bUp[i-2];
        }
        return bUp[n];
    }
}