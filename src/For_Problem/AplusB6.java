package For_Problem;

import java.util.Scanner;

public class AplusB6 {
    public static void main(String args[]) throws Exception {
        // A+B -2 #2558
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 1; i<=T; i++){
            String iput = sc.next();
            String[] sp = iput.split(",");
            System.out.println(Integer.parseInt(sp[0]) + Integer.parseInt(sp[1]));
        }

    }
}

