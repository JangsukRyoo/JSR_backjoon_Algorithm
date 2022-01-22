import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MathProblem {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);

        // #1712 손익 분기점
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        if(c <= b){
//            System.out.println("-1");
//        }else{
//            System.out.println((a/(c-b))+1);
//        }

        //  #2292 벌집
//        int n = sc.nextInt();
//        int ct = 1;
//        int range = 2;
//
//        if (n ==1) {
//            System.out.println(1);
//        }else{
//            while(range <= n){
//                range = range + (6 *ct);
//                ct ++;
//            }
//            System.out.println(ct);
//        }

        // #1193
//        int X = sc.nextInt();
//        int crossCt = 1;
//        int prev_sum = 0;

//        while (true) {
//
//            if (X <= prev_sum + crossCt) {
//
//                if (crossCt % 2 == 1) {
//                    System.out.print((crossCt - (X - prev_sum - 1)) + "/" + (X - prev_sum));
//                    break;
//                }
//                else {
//                    System.out.print((X - prev_sum) + "/" + (crossCt - (X - prev_sum - 1)));
//                    break;
//                }
//            } else {
//                prev_sum += crossCt;
//                crossCt++;
//            }
//        }


 //       #2869

//        int up = sc.nextInt();
//        int down = sc.nextInt();
//        int length = sc.nextInt();
//
//        int day = (length - down) / (up - down);
//        if ((length - down) % (up - down) != 0) {
//            day++;
//        }
//        System.out.println(day);

//       #10250

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int testcase = Integer.parseInt(br.readLine());
//        for(int i=0; i<testcase; i++)
//        {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int height = Integer.parseInt(st.nextToken());
//            int width = Integer.parseInt(st.nextToken());
//            int nth = Integer.parseInt(st.nextToken());
//            int floor =  nth % height  , room = nth/height;
//            if ( floor == 0 ) {
//                System.out.println(height*100+room);
//            }
//            else {
//                System.out.println(floor*100+room+1);
//            }
//        }

//      #2775
//
//        int testCase = sc.nextInt();
//        int[][] apt = new int[15][15];
//
//        apt[0][0] =1;
//
//        for( int i =0; i<apt.length; i++){
//            apt[0][i] = i+1;
//            apt[i][0] = 1;
//        }
//
//        for(int i =1 ; i<apt.length; i++){
//            for(int j =1; j < apt.length; j++){
//                apt[i][j] = apt[i-1][j] + apt[i][j-1];
//            }
//        }
//
//        while(testCase -- > 0){
//            int floor = sc.nextInt();
//            int roomNum = sc.nextInt();
//            System.out.println(apt[floor][roomNum-1]);
//
//        }

        //#2839

//        int ct = sc.nextInt();
//
//        if (ct == 4 || ct == 7) {
//            System.out.println(-1);
//        }
//        else if (ct % 5 == 0) {
//            System.out.println(ct / 5);
//        }
//        else if (ct % 5 == 1 || ct % 5 == 3) {
//            System.out.println((ct / 5) + 1);
//        }
//        else if (ct % 5 == 2 || ct % 5 == 4) {
//            System.out.println((ct / 5) + 2);
//        }

        // 10757
//        String str_A = sc.next();
//        String str_B = sc.next();
//
//        int max_length = Math.max(str_A.length(), str_B.length());
//
//        int[] A = new int[max_length + 1];
//        int[] B = new int[max_length + 1];
//
//        for(int i = str_A.length() - 1, idx = 0; i >= 0; i--, idx++) {
//            A[idx] = str_A.charAt(i) - '0';
//        }
//
//        for(int i = str_B.length() - 1, idx = 0; i >= 0; i--, idx++) {
//            B[idx] = str_B.charAt(i) - '0';
//        }
//
//        for(int i = 0; i < max_length; i++) {
//            int value = A[i] + B[i];
//            A[i] = value % 10;
//            A[i + 1] += (value / 10);
//        }
//
//        StringBuilder sb = new StringBuilder();
//        if(A[max_length] != 0) {
//            sb.append(A[max_length]);
//        }
//        for(int i = max_length - 1; i >= 0; i--) {
//            sb.append(A[i]);
//        }
//        System.out.println(sb);


//         1011 Math 마지막

        int ct = sc.nextInt();

        for(int i = 0; i < ct; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            int distance = Y - X;
            int max = (int)Math.sqrt(distance);

            if(max == Math.sqrt(distance)) {
                System.out.println(max * 2 - 1);
            }
            else if(distance <= max * max + max) {
                System.out.println(max * 2);
            }
            else {
                System.out.println(max * 2 + 1);
            }
        }
   }
}
