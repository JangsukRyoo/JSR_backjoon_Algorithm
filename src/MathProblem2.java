import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MathProblem2 {
    public static boolean prime[];

    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);

//        #1978
//
//        int n = sc.nextInt();
//        int ct = 0;
//
//        for(int i =0; i<n; i++){
//
//            boolean isPrime = true;
//            int num = sc.nextInt();
//
//            if(num == 1){
//                continue;
//            }
//
//            for(int j = 2; j <=Math.sqrt(num); j++){
//                if(num % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if(isPrime){
//                ct ++;
//            }
//        }
//        System.out.println(ct);

//        #2581
//
//        int M = sc.nextInt();
//        int N = sc.nextInt();
//
//        prime = new boolean[N + 1];
//        get_prime();
//
//        int sum = 0;
//        int min = Integer.MAX_VALUE;
//        for(int i = M; i <= N; i++) {
//            if(prime[i] == false) {
//                sum += i;
//                if(min == Integer.MAX_VALUE) {
//                    min = i;
//                }
//            }
//        }
//
//        if(sum == 0) {
//            System.out.println(-1);
//        }
//        else {
//            System.out.println(sum);
//            System.out.println(min);
//        }
//    }
//
//    public static void get_prime() {
//        prime[0] = true;
//        prime[1] = true;
//
//        for(int i = 2; i <= Math.sqrt(prime.length); i++) {
//            for(int j = i * i; j < prime.length; j += i) {
//                prime[j] = true;
//            }
//        }

//      #9020
        // 2보다  큰 짝수가 주어질 때 소수의 합을 구한다.
        // 소수의 합이 여러개일 경우 두 소수의 차이가 작은 것을 출력한다
        // 두 개으 소수를 출력 할 때 작은 소수 부터 출력한다.
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        get_prime();
//        int T = Integer.parseInt(br.readLine());
//        while (T-- > 0){
//            int n = Integer.parseInt(br.readLine());
//            int first = n/2;
//            int second = n/2;
//            if (!prime[first] && !prime[second]) {
//                System.out.println(first + " " + second);
//                break;
//            }
//            first--;
//            second++;

//      #1085
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        int w = sc.nextInt();
//        int h = sc.nextInt();
//
//        int x_min = Math.min(x, w-x);
//        int y_min = Math.min(y, h-y);
//
//        System.out.println(Math.min(x_min, y_min);

//      #3009
//
//        int[][] arr = new int[3][2];;
//        int x=0, y=0;
//
//        for(int i=0;i<3;i++) {
//            arr[i][0] = sc.nextInt();
//            arr[i][1] = sc.nextInt();
//        }
//
//        if(arr[0][0] == arr[1][0]) x = arr[2][0];
//        else if(arr[0][0] == arr[2][0]) x = arr[1][0];
//        else if(arr[1][0] == arr[2][0]) x = arr[0][0];
//
//        if(arr[0][1] == arr[1][1]) y = arr[2][1];
//        else if(arr[0][1] == arr[2][1]) y = arr[1][1];
//        else if(arr[1][1] == arr[2][1]) y = arr[0][1];
//
//        System.out.println(x + " " + y);
//
//
//        #4153

//        while (true) {
//
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//            int z = sc.nextInt();
//
//            if (x == 0 && y == 0 && z == 0) break;
//
//            if ((x * x + y * y) == z * z) {
//                System.out.println("right");
//            } else if (x * x == (y * y + z * z)) {
//                System.out.println("right");
//            } else if (y * y == (z * z + x * x)) {리
//                System.out.println("right");
//            } else {
//                System.out.println("wrong");
//            }
//
//        }


//        #3053

        double R = sc.nextDouble();
        sc.close();

        System.out.println(R * R * Math.PI);
        System.out.println(2 * R * R);

    }
}

    // 9020 같은것
//    public static void get_prime() {
//        prime[0] = prime[1] = true;
//
//        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
//            if (prime[i])
//                continue;
//            for (int j = i * i; j < prime.length; j += i) {
//                prime[j] = true;
//            }
//        }
//    }
//
//  public static boolean[] prim = new boolean[10001];
₩

