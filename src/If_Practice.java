import java.util.Scanner;

public class If_Practice {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
//        //두 수 비교하기 # 1330
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        if( a > b ){
//            System.out.println(">");
//        }else if(a < b ){
//            System.out.println("<");
//        }else if( a == b){
//            System.out.println("==");
//        }

//        //시험 성적 #9498
//        int a = sc.nextInt();
//
//        if( 90 <= a && a <=100){
//            System.out.println("A");
//        }else if(80 <= a && a<90){
//            System.out.println("B");
//        }else if(70 <= a && a <80){
//            System.out.println("C");
//        }else if(60 <= a && a<70){
//            System.out.println("D");
//        }else{
//            System.out.println("F");
//        }

        //윤년 #2753
/*        int a = sc.nextInt();

        if(((a%4) == 0) && (((a%100)!=0) || ((a%400) == 0))){
            System.out.println("1");
        }else{
            System.out.println("0");
        }*/


        // 사분면 고르기 #14681
        // (+, +) = 1
        // (-, +) = 2
        // (-, -) =3
        //(+, -) 4
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        if (a > 0 && b > 0) {
//            System.out.println("1");
//        }else if (a < 0 && b >0){
//            System.out.println("2");
//        }else if( a < 0 && b < 00){
//            System.out.println("3");
//        }else{
//            System.out.println("4");
//        }

        // 알람 시계 #2884
        int hr = sc.nextInt();
        int min = sc.nextInt();

        if(min < 45){
            hr --;
            min = 60 - (45 - min);
            if(hr < 0){
                hr = 23;
            }
            System.out.println(hr + " " + min);
        }else{
            System.out.println(hr + " " + (min -45));
        }

        int time = sc.nextInt()
    }
}

