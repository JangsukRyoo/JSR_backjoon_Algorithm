package Deck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class SpinQueue {
    public static void main(String[] args) throws IOException {
//        #1021 회전하는 큐
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        LinkedList<Integer> deque = new LinkedList<Integer>();

        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i =1; i<=N; i++){
            deque.offer(i);
        }

        int[] seq = new int[M];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i<M; i++){
            seq[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i<M; i++){
            int targ_idx = deque.indexOf(seq[i]);
            int h_indx;

            if(deque.size() % 2 == 0){
                h_indx = deque.size() / 2-1;
            }else{
                h_indx = deque.size() / 2;
            }

            if(targ_idx <= h_indx){
                for(int j =0; j < targ_idx; j++){
                    int temp = deque.pollFirst();
                    deque.offerLast(temp);
                    count++;
                }
            }else{
                for(int j = 0; j < deque.size() - targ_idx; j++) {
                    int temp = deque.pollLast();
                    deque.offerFirst(temp);
                    count++;
                }
            }
            deque.pollFirst();
        }
        System.out.println(count);
    }
}