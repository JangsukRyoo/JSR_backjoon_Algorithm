package MaxandMin_Problems;

import java.util.Scanner;

public class OX {

    public static void main(String args[]) {

        // OX 문제 #8958
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       String arr[] = new String[n];
        for(int i = 0; i<n; i++){
        arr[i] = sc.next();
        }
        sc.close();

        for(int i = 0; i < arr.length; i++){
            int ct = 0;
            int sum = 0;
            for(int j =0; j < arr[i].length(); j++){

                if(arr[i].charAt(j) =='O'){
                    ct++;
                }else{
                    ct = 0;
                }
                sum += ct;
            }
            System.out.println(sum);
        }

    }
}





























