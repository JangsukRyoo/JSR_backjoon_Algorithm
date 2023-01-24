package MaxandMin_Problems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FilpTheWord {

    public static void main(String args[]) throws IOException {
        //#9093 단어 뒤집기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ct = Integer.parseInt(br.readLine());

        for(int i = 0; i < ct; i++){
            String str = br.readLine();
            String[] strArr = str.split(" ");
            String res = "";

            for(int j =0; j<strArr.length; j++){
                StringBuilder sb = new StringBuilder(strArr[j]);
                res += sb.reverse() + " ";
            }

            System.out.println(res);
        }
    }
}





























