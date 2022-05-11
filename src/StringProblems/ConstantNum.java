package StringProblems;

import java.util.Scanner;

public class ConstantNum {
    public static void main(String[] args) {
//        상수 #2908

        Scanner sc = new Scanner(System.in);
        String reverse1 = new StringBuffer(sc.next()).reverse().toString();
        String reverse2 = new StringBuffer(sc.next()).reverse().toString();

        int reverint1 = Integer.parseInt(reverse1);
        int reverint2 = Integer.parseInt(reverse2);

        if (reverint1 <reverint2){
            System.out.println(reverint2);
        }else{
            System.out.println(reverint1);
        }
    }
}






















