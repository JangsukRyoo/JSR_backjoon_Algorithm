package StackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) throws IOException {
//        #9012 괄호
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for(int i =0; i<N; i++){
            String s = br.readLine();
            sb.append(cal(s)).append('\n');
        }
        System.out.println(sb.toString());
    }

    public static String cal(String s){
        Stack<Character> stack = new Stack<Character>();
        for(int j = 0; j<s.length(); j++){
            char c = s.charAt(j);
            if( c == '('){
                stack.push(c);
            }else if(stack.isEmpty()){
                return "NO";
            }else{
                stack.pop();
            }
        }
        if(stack.isEmpty()){
            return "YES";
        }else{
            return "NO";
        }
    }
}