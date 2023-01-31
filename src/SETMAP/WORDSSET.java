package SETMAP;

import java.util.HashSet;
import java.util.Scanner;

public class WORDSSET {


    public static void main(String[] args) {
//        #14425 문자열 집합
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        HashSet<String> he = new HashSet<String>();

        for(int i =0; i<n ; i++){
            he.add(sc.next());
        }

        int ct = 0;
        for(int i =0; i<m; i++){
            String a = sc.next();
            if(he.contains(a)){
                ct++;
            }
        }
        System.out.println(ct);
    }
}