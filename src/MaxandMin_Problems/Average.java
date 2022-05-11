package MaxandMin_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class Average {

    public static void main(String args[]) {

      //  평균 #1546
        Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      double[] num = new double[n];
      double sum = 0;
      for(int i =0; i < n; i++){
          num[i]= sc.nextDouble();
      }
      Arrays.sort(num);
      double max = num[n-1];
      for(int i =0; i < n; i++) {
          sum += (num[i]/max);
      }
      System.out.println(sum/n*100);
    }
}





























