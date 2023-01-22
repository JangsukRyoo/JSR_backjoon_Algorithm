package For_Problem;

import java.util.*;

//인공 지능 시계2530
public class AI_CLOCK {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        String ent = sc.nextLine();
        int entSec = sc.nextInt();

        String[] spl = ent.split("\\s");

        int hr = Integer.parseInt(spl[0]);
        int min = Integer.parseInt(spl[1]);
        int sec = Integer.parseInt(spl[2]);

        // 60초가 넘어가는 몫은 분에 더하고 나머지는 초에 넣고
        sec += entSec;
        min += (sec/60);

        // 60초가 넘어가는 몫은 시에 더하고 나머지는 분에 넣고
        sec %= 60;
        hr +=(min/60);
        min %= 60;

        hr %=24;

        System.out.println(hr + " " + min + " " + sec);
    }
}


