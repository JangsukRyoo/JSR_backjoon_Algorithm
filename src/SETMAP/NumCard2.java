package SETMAP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class NumCard2 {
    public static void main(String[] args) throws IOException {
//        #10816 숫자카드 2

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> cards = new HashMap<>();
        StringBuffer sb = new StringBuffer();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int card = Integer.parseInt(st.nextToken());

            if(!cards.containsKey(card)){
                cards.put(card,1);
            }else{
                cards.put(card, cards.get(card) +1);
            }
        }
        //
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i= 0; i < M; i++){
            int num = Integer.parseInt(st.nextToken());

            if(cards.containsKey(num)){
                sb.append(cards.get(num) + " ");
            }else{
                sb.append(0 + " ");
            }
        }
        System.out.println(sb.toString());
    }
}