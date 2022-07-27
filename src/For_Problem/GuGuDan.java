package For_Problem;

import java.util.Scanner;
        //구구단 #2793
public class GuGuDan {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i =1; i< 10; i++){
            System.out.println(a + " * " + i + " = " + (a*i));
        }
    }
}
