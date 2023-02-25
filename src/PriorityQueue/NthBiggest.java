package PriorityQueue;

import java.util.*;


public class NthBiggest {
    static int n ;
    public static void main(String[] args)  {
//        2075 N번째 큰수
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                q.offer(sc.nextInt());
            }
        }
        for(int i=0; i<n-1; i++) {
            q.poll();
        }
        System.out.println(q.poll());
    }

}