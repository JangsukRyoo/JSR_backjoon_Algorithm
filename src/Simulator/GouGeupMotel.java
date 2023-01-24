package Simulator;

import java.util.Arrays;
import java.util.Scanner;

public class GouGeupMotel {
    public static void main(String[] args) {
//    #12756 고오오오급 여관!
        Scanner sc = new Scanner(System.in);
        String aStr  = sc.nextLine();
        String bStr  = sc.nextLine();

        int[] a = Arrays.stream(aStr.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] b  = Arrays.stream(bStr.split(" ")).mapToInt(Integer::parseInt).toArray();

        while(true){
          a[1] -= b[0];
          b[1] -= a[0];

          if(a[1] <= 0 && b[1]<=0){
              System.out.println("DRAW");
              break;
          }else if(a[1] <=0){
              System.out.println("PLAYER B");
              break;
          }else if(b[1] <= 0){
              System.out.println("PLAYER A");
              break;
          }
        }
    }
}
