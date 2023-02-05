package StackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Zero {
    public static void main(String[] args) throws IOException {
//        #10773 제로
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<Integer>();

        int N =  Integer.parseInt(br.readLine());

        for(int i = 0; i<N; i++){
            int num = Integer.parseInt(br.readLine());

            if(num == 0){
                stack.pop();
            }else {
                stack.push(num);
            }
        }
        int sum = 0;
        for(int a : stack){
            sum += a;
        }
        System.out.println(sum);
    }
}