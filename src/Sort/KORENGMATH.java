package Sort;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class KORENGMATH {

    public static void main(String[] args) throws IOException {
//        #10825 국영수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        ArrayList<Student> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());

        while (--n >= 0){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int k = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            list.add(new Student(name, k, e, m));
        }

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.k == o2.k) {
                    if (o1.e == o2.e) {
                        if (o1.m == o2.m) {
                            return o1.name.compareTo(o2.name);
                        }
                        return o2.m - o1.m;
                    }
                    return o1.e - o2.e;
                }
                return o2.k - o1.k;
            }
        });

        StringBuilder sb = new StringBuilder();
        for (Student student : list) {
            sb.append(student.name).append('\n');
        }

        System.out.println(sb);
    }

    static class Student{
        String name ;
        int k;
        int e;
        int m;

        public Student(String name, int k, int e, int m){
            this.name = name;
            this.k = k;
            this.e = e;
            this.m = m;
        }
    }
}