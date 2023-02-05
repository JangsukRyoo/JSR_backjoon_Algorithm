package SETMAP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BestSeller {
    public static void main(String[] args) throws IOException {
//        #1302 베스트셀러

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> books = new HashMap<>();

        int max = 0;
        for (int i = 0; i < N; i++) {
            String book = br.readLine();
            books.put(book, books.getOrDefault(book, 0) + 1);
            max = Math.max(max, books.get(book));
        }
        List<String> list = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : books.entrySet()){
            if(entry.getValue() == max) {
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);
        System.out.println(list.get(0));
    }
}