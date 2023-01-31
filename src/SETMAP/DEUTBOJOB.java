package SETMAP;

import java.util.*;

public class DEUTBOJOB {


    public static void main(String[] args) {
//        #1764 듣보잡
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        HashSet<String> he = new HashSet<String>();

        for(int i =0; i<n ; i++){
            he.add(sc.next());
        }

        ArrayList<String> list = new ArrayList<>();
        for(int i =0; i<m; i++){
            String a = sc.next();
            if(he.contains(a)){
                list.add(a);
            }
        }
        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for(String s : list){
            sb.append(s).append("\n");
        }

        System.out.println(list.size());
        System.out.println(sb);
    }
}