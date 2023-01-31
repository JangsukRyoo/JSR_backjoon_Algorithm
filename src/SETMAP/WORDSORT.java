package SETMAP;

import java.util.*;

public class WORDSORT {

    public static void main(String[] args) {
//        #10867  중복뺴고 정렬
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashSet<String> hasSet = new HashSet<String>();

        for(int i =0; i<n; i++) {
            hasSet.add(sc.next());
        }
        String[] arr = hasSet.toArray(new String[0]);

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }else {
                    return s1.length() - s2.length();
                }

            }
        });

        StringBuilder sb = new StringBuilder();
        for(String i :arr){
            sb.append(i).append("\n");
        }
        System.out.println(sb.toString());
    }
}