package SETMAP;

import java.util.Scanner;

public class PENGRAM {

    public static void main(String[] args) {
//        #5704 팬그램
        Scanner sc = new Scanner(System.in);

        while(true){
            int[] abc = new int[26];
            String str = sc.nextLine().replace(" ", "");
            if(str.equals("*")){
                break;
            }
            for (int i = 0; i < str.length(); i++) {
                ++abc[str.charAt(i) - 97];
            }
            String ret = "Y";
            for (int i = 0; i < abc.length; i++) {
                if (abc[i] == 0) {
                    ret = "N";
                    break;
                }
            }
            System.out.println(ret);
        }
    }
}