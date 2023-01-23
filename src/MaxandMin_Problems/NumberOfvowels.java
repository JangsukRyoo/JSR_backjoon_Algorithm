package MaxandMin_Problems;
import java.util.Scanner;

public class NumberOfvowels {

    public static void main(String args[]) {
        //#10987 모음이 개수
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        int res = 0;

        for(int i =0; i<inp.length(); i++){
            char ch = inp.charAt(i);
            if(ch == 'a' || ch =='e' || ch == 'o' || ch == 'i' || ch == 'u'){
                res ++;
            }
        }
        System.out.println(res);
    }
}





























