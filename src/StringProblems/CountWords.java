package StringProblems;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {

//        단어의 개수 # 1152
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();

        if(str.isEmpty()){
            System.out.println("0");
        } else{
            System.out.println(str.split(" ").length);
        }

    }
}






















