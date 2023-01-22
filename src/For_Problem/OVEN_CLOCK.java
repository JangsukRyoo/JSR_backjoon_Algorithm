package For_Problem;

import java.util.Scanner;

//#2525 오븐시계
public class OVEN_CLOCK {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        String ent = sc.nextLine();
        int entSec = sc.nextInt();

        String[] spl = ent.split("\\s");

        int hr = Integer.parseInt(spl[0]);
        int min = Integer.parseInt(spl[1]);
        //분에 추가 분 더하기
        min += entSec;
        hr +=(min/60);
        min %= 60;

        hr %=24;
        System.out.println(hr + " " + min);
    }
}

