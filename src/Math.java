import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Math {
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
//
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


   }
}
