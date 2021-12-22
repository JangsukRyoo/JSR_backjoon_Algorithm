import java.util.Scanner;

public class Math {
    public static void main(String args[]){

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
        int X = sc.nextInt();

        int crossCt = 1;
        int prev_sum = 0;

        while (true) {

            if (X <= prev_sum + crossCt) {

                if (crossCt % 2 == 1) {
                    System.out.print((crossCt - (X - prev_sum - 1)) + "/" + (X - prev_sum));
                    break;
                }
                else {
                    System.out.print((X - prev_sum) + "/" + (crossCt - (X - prev_sum - 1)));
                    break;
                }
            } else {
                prev_sum += crossCt;
                crossCt++;
            }
        }
    }
}
