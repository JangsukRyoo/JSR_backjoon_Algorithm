package Simulator;

import java.util.Arrays;
import java.util.Scanner;

public class TurnelEntrandExit {
    public static void main(String[] args) {
//    #5612 터널의 입구와 출구
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int cars = sc.nextInt();
        int res = cars;
        int maxCar = cars;
        int flag = 0;
//        nextInt 다음에 nextLine이 들어오면 1라인 먹혀서 추가
        sc.nextLine();
        for(int i = 1; i<=time; i++){
            String str = sc.nextLine();
            int[] a = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
            int ent = a[0];
            int ext = a[1];

            maxCar += ent - ext;

            if(maxCar <0){
                flag = 1;
            }
            res = Math.max(res,maxCar);
        }
        if(flag ==1){
            System.out.println(0);
        }else{
            System.out.println(res);
        }
    }
}
