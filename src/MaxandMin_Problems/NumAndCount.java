package MaxandMin_Problems;

import java.util.Scanner;

public class NumAndCount {

    public static void main(String args[]) {

        //숫자와 개수 #2577
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int ans = a * b * c;
        String str = Integer.toString(ans);
        System.out.println(countCh(str,'0'));
        System.out.println(countCh(str,'1'));
        System.out.println(countCh(str,'2'));
        System.out.println(countCh(str,'3'));
        System.out.println(countCh(str,'4'));
        System.out.println(countCh(str,'5'));
        System.out.println(countCh(str,'6'));
        System.out.println(countCh(str,'7'));
        System.out.println(countCh(str,'8'));
        System.out.println(countCh(str,'9'));
    }
    public static long countCh(String st, char ch){
       return st.chars().filter(c -> c == ch).count();
    }
}





























