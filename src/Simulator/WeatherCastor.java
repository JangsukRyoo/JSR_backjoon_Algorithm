package Simulator;

import java.util.Scanner;

public class WeatherCastor {
    public static void main(String[] args) {
//    #10709 기상캐스터
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();

        for(int i =0; i<h; i++){
            String a = sc.next();
            int ct = 0;
            for(int j =0; j<w; j++){
                if(a.charAt(j) =='.' && ct ==0){
                    System.out.print(-1+" ");
                }else if(a.charAt(j) == 'c'){
                    System.out.print(0+" ");
                    ct =1;
                }else if(a.charAt(j) == '.' && ct !=0){
                    System.out.print(ct + " ");
                    ct++;
                }
            }
            System.out.println();
        }
    }
}
