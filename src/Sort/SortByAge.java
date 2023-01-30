package Sort;


import java.util.Scanner;

public class SortByAge {

    public static void main(String[] args)   {
//        #10814 나이순 정렬

        Scanner sc = new Scanner(System.in);
        StringBuilder[] sb = new StringBuilder[201];
        int ct =  sc.nextInt();

        for(int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuilder();
        }

        for(int i = 0; i<ct; i++){
            int age = sc.nextInt();
            String nm = sc.next();

            sb[age].append(age).append(' ').append(nm).append('\n');
        }

        StringBuilder s = new StringBuilder();
        for(StringBuilder a : sb){
            s.append(a);
        }

        System.out.println(s);

    }
}