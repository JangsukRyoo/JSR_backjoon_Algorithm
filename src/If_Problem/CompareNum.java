package If_Problem;

import java.util.Scanner;

public class CompareNum {
    public static void main(String args[]){
//        //두 수 비교하기 # 1330
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if( a > b ){
            System.out.println(">");
        }else if(a < b ){
            System.out.println("<");
        }else if( a == b){
            System.out.println("==");
        }
    }
}

