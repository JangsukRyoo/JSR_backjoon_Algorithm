import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.IOException;

public class for_practice {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        //구구단 #2793
//        int a = sc.nextInt();
//        for(int i =1; i< 10; i++){
//            System.out.println(a + " * " + i + " = " + (a*i));
//        }

        // A+B -3 # 10950
//        int t = sc.nextInt();
//        for(int i = 1; i <= t; i++){
//            int a = sc.nextInt();
//            int b= sc.nextInt();
//            System.out.println(a+b);
//         }

        // 합 #8393
//        int a = sc.nextInt();
//        int sum = 0;
//        for(int i = 1; i <=a; i++){
//            sum +=i;
//        }
//        System.out.println(sum);

        //빠른 for #15552
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < N; i++) {
//            String str = br.readLine();
//            int target = str.indexOf(" ");
//            int result = Integer.parseInt(str.substring(0,target)) + Integer.parseInt(str.substring(target + 1));
//            sb.append(result+"\n");
//        }
//        br.close();
//        System.out.print(sb);

        // N 찍기  #2741
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        for (int i = 1; i <= N; i++) {
//            br.close();
//            System.out.println(i);
//        }
//        int N = sc.nextInt();
//        for (int i = 1; i <= N; i++) {
//            System.out.println(i);
//        }

        // N 찍기  #2742
//        int N = sc.nextInt();
//        for (int i = N;  i >= 1; i--) {
//            System.out.println(i);
//        }

        // A + B 7 #11021
//        int n = sc.nextInt();
//
//        for (int i = 1;  i <= n ; i++) {
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            System.out.println("Case #"+i+": +(a+b));
//        }

        // A + B 8 #11022
//        int n = sc.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a + b));
//        }

        //별찍기 -1 #2438
//        int n = sc.nextInt();
//        for(int i = 1; i <=n; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//

        //x보다 작은수 #10871
        int n = sc.nextInt();
        int les = sc.nextInt();
        int num[] = new int[n];

        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }
        sc.close();
        for(int i =0; i < n; i++){
            if(num[i] < les){
                System.out.print(num[i]+" ");
            }
        }
    }
}
