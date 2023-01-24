package MaxandMin_Problems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaesarCipher {

    public static void main(String args[]) throws IOException {
        //#5598 카이사르 암호
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringBuilder sb = new StringBuilder(str);
        String b ="";
         for(int i = 0; i < str.length(); i++){
             char a = str.charAt(i);
             int c = a - 3;
             if(c < 65){
                 c += 26;
             }
            b += (char)c;
         }
        System.out.println(b);
    }
}





























