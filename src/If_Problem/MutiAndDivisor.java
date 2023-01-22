package If_Problem;

import java.util.Scanner;

public class MutiAndDivisor {
    //#5086  배수와 약수
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

            //1 첫 번째 숫자가 두 번째 숫자의 약수이다 factor
            //2 첫 번쨰 숫자가 두 번째 숫자의 배수이다. mutiple
            //3 첫 번째 숫자다 두 번 째 숫다의 약수와 배수 모두 아니다.
        while(true){
            String[] st = sc.nextLine().split(" ");
            int a = Integer.parseInt(st[0]);
            int b = Integer.parseInt(st[1]);

            if(a == 0 && b == 0 ){break;}

            if( b% a == 0 ){
                System.out.println("factor");
            }else if(a%b == 0){
                System.out.println("multiple");
            }else{
                System.out.println("neither");
            }
        }
    }
}
