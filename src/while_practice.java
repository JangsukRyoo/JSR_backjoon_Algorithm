import java.util.Scanner;

public class while_practice {

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
    }
}

