package Sort;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class NumSort2 {

    public static void main(String[] args) throws IOException {
//        #2751 수정렬하기2

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int ct =  sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<ct ;i++){
            list.add(sc.nextInt());
        }

        list.sort(Comparator.naturalOrder());
        for(Integer a : list){
            sb.append(a).append("\n");
        }
        System.out.println(sb);
    }
}