package For_Problem;

import java.util.Scanner;

public class SmallerThanX {
    public static void main(String args[]) throws Exception {
        //     x보다 작은수 #10871

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int les = sc.nextInt();
        int num[] = new int[n];

        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }
        sc.close();
        for(int i =0; i < n; i++){
            if(num[i] < les){
                System.out.print(num[i]+" ");
            }
        }
    }
}
