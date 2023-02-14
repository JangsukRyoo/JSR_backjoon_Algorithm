package PriorityQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class ChristMasPresent {
    public static void main(String[] args) throws IOException {
//        #14235 크리스마스 선물
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> y - x);
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            for (int j = 0; j < a; j++) {
                pq.offer(Integer.parseInt(st.nextToken()));
            }
            if (a != 0) {continue;}

            if (!pq.isEmpty()) {
                sb.append(pq.poll()).append("\n");
            } else {
                sb.append(-1).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}