package MaxandMin_Problems;
import java.util.Scanner;

public class OverAverage {

    public static void main(String args[]) {
        // 평균은 넘곘지? #4344

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[];

        for (int i = 0; i < n; i++){
            int num = sc.nextInt();
            arr = new int[num];
            double sum = 0;
            for(int j = 0; j<arr.length; j++) {
                int val = sc.nextInt();
                arr[j] = val;
                sum += val;
            }
            double mean = (sum/num);
            double memct = 0;
            for(int j =0; j<num; j++){
                if(arr[j] >mean) {
                    memct ++;
                }
            }
            System.out.printf("%.3f%%\n",(memct/num)*100);
        }
    }
}





























