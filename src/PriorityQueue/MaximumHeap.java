package PriorityQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class MaximumHeap {
    public static void main(String[] args) throws IOException {
//        #11279 우선순위 큐 최대힙
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int inp;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            inp = Integer.parseInt(br.readLine());
            if(inp == 0){
                if(!maxHeap.isEmpty()){
                    System.out.println(maxHeap.poll());
                }else{
                    System.out.println(0);
                }
                continue;
            }
            maxHeap.add(inp);
        }
    }
}