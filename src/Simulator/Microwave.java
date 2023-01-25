package Simulator;

import java.util.Scanner;

public class Microwave {
    public static void main(String[] args) {
//    #14470 전자레인지
        Scanner sc = new Scanner(System.in);
        int meat = sc.nextInt();
        int goal = sc.nextInt();
        int fheat = sc.nextInt();
        int defro = sc.nextInt();
        int heat = sc.nextInt();

        int tTime = 0;

        if(meat <0){
            tTime = defro;
        }
        while (meat < goal){
            if(meat < 0){
                tTime += fheat;
            }else{
                tTime += heat;
            }
            meat +=1;
        }
        System.out.println(tTime);
    }
}
