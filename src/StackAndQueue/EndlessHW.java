package StackAndQueue;


import java.io.*;
import java.util.*;

public class EndlessHW {

    public static void main(String[] args) throws IOException {
//        #17952 과제가 끝나지 않아!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Stack<HW> stack = new Stack<>();
        int totalSc = 0;

        for(int i =0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            if(st.nextToken().charAt(0) == '1'){
                int sc = Integer.parseInt(st.nextToken());
                int min = Integer.parseInt(st.nextToken());
                if(min == 1){
                    totalSc += sc;
                }else{
                    stack.push(new HW(sc,min-1));
                }
            }else if (!stack.isEmpty()){
                HW tmp = stack.pop();
                tmp.min --;
                if(tmp.min ==0){
                    totalSc += tmp.sc;
                }else{
                    stack.push(tmp);
                }
            }
        }
        System.out.println(totalSc);

    }
    static class HW{
        int sc;
        int min;
        public HW(){
        }
        public HW(int sc, int min){
            this.sc = sc;
            this.min = min;
        }
    }
}