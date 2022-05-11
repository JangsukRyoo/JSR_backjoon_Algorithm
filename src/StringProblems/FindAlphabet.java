package StringProblems;

import java.util.Scanner;

public class FindAlphabet {
    public static void main(String[] args) {
//        알파벳 찾기 #10809

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        String a = sc.nextLine();

        for(int i=0; i< arr.length; i++){
            arr[i] = -1;
        }

        for(int j=0; j < a.length(); j++){
            char cha = a.charAt(j);

            if(arr[cha-'a'] == -1){
                arr[cha-'a'] = j;
            }
        }
        for(int val : arr){
            System.out.println(val + " ");
        }

    }
}






















