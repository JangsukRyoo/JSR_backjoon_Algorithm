package If_Problem;

import java.util.Scanner;

public class AlarmClock {

    public static void main(String args[]) {
        // 알람 시계 #2884
        Scanner sc = new Scanner(System.in);
        int hr = sc.nextInt();
        int min = sc.nextInt();

        if (min < 45) {
            hr--;
            min = 60 - (45 - min);
            if (hr < 0) {
                hr = 23;
            }
            System.out.println(hr + " " + min);
        } else {
            System.out.println(hr + " " + (min - 45));
        }

        int time = sc.nextInt();
    }
}
