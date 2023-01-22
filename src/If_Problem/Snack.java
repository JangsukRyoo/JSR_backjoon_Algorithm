package If_Problem;
import java.util.*;

public class Snack {
    //#10156 과자
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String[] st = sc.nextLine().split(" ");

        int price = Integer.parseInt(st[0]);
        int num = Integer.parseInt(st[1]);
        int money = Integer.parseInt(st[2]);

        if(price * num <=money){
            System.out.println(0);
        }else{
            System.out.println(price * num - money);
        }
    }
}
