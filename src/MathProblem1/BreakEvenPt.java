package MathProblem1;
import java.util.Scanner;

public class BreakEvenPt {
    public static void main(String args[]) {
//      #1712 손익 분기점

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(c <= b){
            System.out.println("-1");
        }else{
            System.out.println((a/(c-b))+1);
        }
   }
}
