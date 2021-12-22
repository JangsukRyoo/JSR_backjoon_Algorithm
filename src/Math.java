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

        int n = sc.nextInt();
        int ct = 1;
        int range = 2;

        if (n ==1) {
            System.out.println(1);
        }else{
            while(range <= n){
                range = range + (6 *ct);
                ct ++;
            }
            System.out.println(ct);
        }
    }
}
