package MaxandMin_Problems;
import java.util.Scanner;

public class WhiteBlock {

    public static void main(String args[]){
        //#1100 하안칸
        Scanner sc = new Scanner(System.in);
        int res = 0;

        for(int i = 0; i<8; i++){
            String a  = sc.nextLine();
            for(int j = 0; j<8; j++){
                if((a.charAt(j) == 'F') && (i%2 == j%2)){
                    res ++;
                }
            }
        }
        System.out.println(res);
    }
}





























