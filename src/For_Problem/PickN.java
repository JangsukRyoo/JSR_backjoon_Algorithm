package For_Problem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PickN {
    public static void main(String args[]) throws Exception {

        // N 찍기  #2741
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            br.close();
            System.out.println(i);
        }
    }
}
