package MathProblem1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Num10250 {
    public static void main(String args[]) throws IOException {
//       #10250

        Scanner sc = new Scanner(System.in);


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testcase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int height = Integer.parseInt(st.nextToken());
            int width = Integer.parseInt(st.nextToken());
            int nth = Integer.parseInt(st.nextToken());
            int floor = nth % height, room = nth / height;
            if (floor == 0) {
                System.out.println(height * 100 + room);
            } else {
                System.out.println(floor * 100 + room + 1);
            }
        }
    }
}

