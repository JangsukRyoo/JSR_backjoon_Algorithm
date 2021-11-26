import java.util.Scanner;

public class function_practice {
    public static void main(String[] args) {
//      정수 N개의 합 #15596
//    class Test {
//        long sum(int[] a) {
//            long sum = 0;	// a 배열 정수 합 변수
//
//            for(int i = 0; i < a.length; i++) {
//                sum += a[i];
//            }
//            return sum;
//        }
//    }

//      셀프넘버  #1065
//
//        boolean[] check = new boolean[10001];
//        for (int i = 1; i < 10001; i++){
//            int n = d(i);
//
//            if(n < 10001){
//                check[n] = true;
//            }
//        }
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 1; i < 10001; i++) {
//            if (!check[i]) {
//                sb.append(i).append('\n');
//            }
//        }
//        System.out.println(sb);
//    }
//    public static int d(int number){
//        int sum = number;
//
//        while(number != 0){
//            sum = sum + (number % 10);
//            number = number/10;
//        }
//        return sum;

 //       한수 #1065

                Scanner in = new Scanner(System.in);

                System.out.print(arithmetic_sequence(in.nextInt()));
                in.close();
            }

     public static int arithmetic_sequence(int num) {
        int ct = 0;
        if (num < 100) {
            return num;
        }
        else {
            ct = 99;
            if (num == 1000) {
                num = 999;
            }
            for (int i = 100; i <= num; i++) {
                int hun = i / 100;
                int ten = (i / 10) % 10;
                int one = i % 10;
                if ((hun - ten) == (ten - one)) {
                    ct++;
                }
            }
        }
        return ct;
   }
}
