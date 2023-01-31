package SETMAP;

import java.util.*;

public class SORTNOREPEAT {

    public static void main(String[] args) {
//        #10867  중복뺴고 정렬
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashSet<Integer> hasSet = new HashSet<Integer>();

        for(int i =0; i<n; i++) {
            hasSet.add(sc.nextInt());
        }
        ArrayList<Integer> arr = new ArrayList<Integer>(hasSet);
        Collections.sort(arr);

        StringBuilder sb = new StringBuilder();
        for(int i :arr){
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString());
    }
}