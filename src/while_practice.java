import java.util.Scanner;

public class while_practice {
    public static boolean[] prime;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //  A + B -5 10952

//        do {
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            if ((a + b) == 0) {
//                break;
//            }
//            System.out.println(a + b);
//        } while (true);

        //  A + B +4
//        while(sc.hasNext()){
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            System.out.println(a + b);
//        }


        // 더하기 사이클 #1110
//        String num = sc.nextLine();
//        int a,b;
//        int ct = 0;
//        int ini = 0;
//        int sum = 0;
//        if(num.length() == 1){
//            a = 0;
//            b = (int)num.charAt(0)-'0';
//        }else{
//          a = (int)num.charAt(0)-'0';
//          b = (int)num.charAt(1)-'0';
//        }
//        ini = (a*10)+b;
//        while(true){
//            sum = a+b;
//            a=b;
//            b=(sum%10);
//            int newNum = (a*10)+b;
//            ct ++;
//            if(ini == newNum){
//               break;
//            }
//        }
//        System.out.println(ct);

        //11653

//        int n = sc.nextInt();
//
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            while (n % i == 0) {
//                System.out.println(i);
//                n /= i;
//            }
//        }
//        if (n != 1) {
//            System.out.println(n);
//        }

        //1929
        //소수 구하기

//        int m = sc.nextInt();
//        int n = sc.nextInt();
//
//        boolean[] prime = new boolean[n + 1];
//        get_prime();
//
//        for(int i = m; i <= n; i++) {
//            // false = 소수
//            if(!prime[i]) System.out.println(i);
//        }
//    }
//
//    public static void get_prime() {
//        prime[0] = prime[1] = true;
//        for(int i = 2; i <= Math.sqrt(prime.length); i++) {
//            if(prime[i]) continue;
//            for(int j = i * i; j < prime.length; j += i) {
//                prime[j] = true;
//            }
//        }
        
        //4948 베트랑 공준
    }
}

