package Simulator;

import java.util.Scanner;

public class ChangYoungViliage {
    public static void main(String[] args) {
//    #3028 창영마을

        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int b = 1;

        for(int i = 0; i<st.length(); i++){
            st.charAt(i);
            if('A' == st.charAt(i) && b != 3){
                b = 3 - b;
            }else if('B' == st.charAt(i) && b != 1) {
                b = 5 - b;
            }else if('C' == st.charAt(i) && b != 2){
                b = 4 - b;
            }
        }
        System.out.println(b);
    }
}
