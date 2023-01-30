package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumSort3 {

    public static void main(String[] args) throws IOException {
//        #10989 수정렬하기3

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int ct =  Integer.parseInt(br.readLine());
        int[] a = new int[10001];

        for(int i = 0; i<ct ;i++){
            int x = Integer.parseInt(br.readLine());
            a[x] += 1;
        }

        for(int i =1; i<10001; i++){
            for(int j=0; j<a[i]; j++){
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }
}