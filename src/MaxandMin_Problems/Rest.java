package MaxandMin_Problems;

import java.util.HashSet;
import java.util.Scanner;

public class Rest {

    public static void main(String args[]) {

      //나머지 #3052
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<Integer>();

      for(int i=0; i< 10; i++){
           set.add(sc.nextInt()%42);
      }
        System.out.println(set.size());
    }
}





























