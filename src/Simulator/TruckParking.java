package Simulator;

import java.util.Arrays;
import java.util.Scanner;

public class TruckParking {
    public static void main(String[] args) {
//    #2979 트럭 주차
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] inpt = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        int one = inpt[0];
        int two = inpt[1];
        int three = inpt[2];
        int[] t = new int[101];
        int res = 0;

        for(int i =0; i<3; i++){
            String st = sc.nextLine();
            int[] ip = Arrays.stream(st.split(" ")).mapToInt(Integer::parseInt).toArray();
            for(int j = ip[0]; j<ip[1]; j++){
                t[j] +=1;
            }
        }
        for (int i =1; i<100; i++){
            if(t[i]==1){
                res += one;
            }else if(t[i] ==2){
                res += two *2;
            }else if(t[i] ==3){
                res += three *3;
            }
        }
        System.out.println(res);
    }
}
