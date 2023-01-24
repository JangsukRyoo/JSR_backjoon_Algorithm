package MaxandMin_Problems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pangram {

    public static void main(String args[]) throws IOException {
        //#10384 팬그램
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ct = Integer.parseInt(br.readLine());

        for(int i = 0; i < ct; i++){
            int[] alp = new int[26];
            String str = br.readLine();

            for(int j =0; j<str.length(); j++){
                char c = str.charAt(j);
                if ('a' <= c && c <= 'z') {
                    alp[(int) c - 97]++;
                }else if ('A' <= c && c <= 'Z') {
                    alp[(int) c - 65]++;
                }
            }
            int min = Integer.MAX_VALUE;
            for(int k =0; k<25; k++){
                min = Math.min(min, alp[k]);
            }
            if(min >=3){
                System.out.println("Case "+(i+1)+": Triple pangram!!!");
            }else if(min == 2){
                System.out.println("Case "+(i+1)+": Double pangram!!");
            }else if(min == 1){
                System.out.println("Case "+(i+1)+": Pangram!");
            }else{
                System.out.println("Case "+(i+1)+": Not a pangram");
            }
        }
    }
}

























