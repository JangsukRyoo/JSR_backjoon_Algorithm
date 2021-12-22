import java.util.Scanner;

public class Math {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // #1712 손익 분기점
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
