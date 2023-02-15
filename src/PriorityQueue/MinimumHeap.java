package PriorityQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class MinimumHeap {
    public static void main(String[] args) throws IOException {
//        #1927 우선순위 큐 최소힙
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int inp;
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        for(int i = 0; i<n; i++){
            inp = Integer.parseInt(br.readLine());
            if(inp>0){
                minHeap.add(inp);
            }else{
                if(!minHeap.isEmpty()){
                    System.out.println(minHeap.poll());
                }else{
                    System.out.println(0);
                }
            }
        }
    }
}