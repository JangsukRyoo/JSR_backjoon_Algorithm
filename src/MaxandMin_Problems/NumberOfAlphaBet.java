package MaxandMin_Problems;
import java.util.Scanner;

public class NumberOfAlphaBet {

    public static void main(String args[]) {
        // #2744 문자의 개수
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        inp.toLowerCase();
        int[] alp = new int[26];

        for(int i = 0; i<inp.length(); i++){
            char c = inp.charAt(i);
            alp[c-97] ++;
        }
        for(int i = 0; i<26; i++){
            System.out.print(alp[i] + " ");
        }
    }
}





























