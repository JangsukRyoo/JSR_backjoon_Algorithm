package Simulator;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BallChange {
    public static void main(String[] args) {
//    #10813 공바꾸기
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int[] sett = Arrays.stream(st.split(" ")).mapToInt(Integer::parseInt).toArray();
        int balls = sett[0];
        int chg = sett[1];
        List<Integer> a = IntStream.range(0, balls+1).boxed().collect(Collectors.toList());

        for(int i=0; i<chg; i++){
            String str = sc.nextLine();
            int[] stat = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
            int x = a.get(stat[0]);
            int y = a.get(stat[1]);
            a.set(stat[0], y);
            a.set(stat[1], x);
        }
        for(int i = 1; i< a.size(); i++){
            System.out.print(a.get(i)+" ");
        }
    }
}
