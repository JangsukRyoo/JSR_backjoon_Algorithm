package MaxandMin_Problems;
import java.util.Locale;
import java.util.Scanner;

public class ChangeCaps {

    public static void main(String args[]) {
        // #2744 대소문자 바꾸기
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();

        for(int i = 0; i < inp.length(); i++){
            char a = inp.charAt(i);
            if(Character.isUpperCase(a)){
                System.out.print(String.valueOf(a).toLowerCase());
            }else{
                System.out.print(String.valueOf(a).toUpperCase());
            }
        }
    }
}





























