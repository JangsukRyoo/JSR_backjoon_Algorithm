import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;
public class maxAndmin_practice {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //최소값 최대값 10818
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//
//        for(int i = 0; i < n; i++){
//            arr[i] = sc.nextInt();
//        }
//        sc.close();
//
//        Arrays.sort(arr);
//        System.out.println(arr[0] + " " + arr[n-1]);

        //최대값 1 , 2  # 2562
//        int[] arr = new int[9];
//        for(int i = 0; i<9; i++){
//            arr[i] = sc.nextInt();
//        }
//        Arrays.sort(arr);
//        System.out.println(arr[8]);
//        System.out.println(arr.length-1);

        //숫자와 개수 #2577
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        int ans = a * b * c;
//        String str = Integer.toString(ans);
//        System.out.println(countCh(str,'0'));
//        System.out.println(countCh(str,'1'));
//        System.out.println(countCh(str,'2'));
//        System.out.println(countCh(str,'3'));
//        System.out.println(countCh(str,'4'));
//        System.out.println(countCh(str,'5'));
//        System.out.println(countCh(str,'6'));
//        System.out.println(countCh(str,'7'));
//        System.out.println(countCh(str,'8'));
//        System.out.println(countCh(str,'9'));
//    }
//    public static long countCh(String st, char ch){
//       return st.chars().filter(c -> c == ch).count();
//    }

      //나머지 #3052
//        HashSet<Integer> set = new HashSet<Integer>();
//      for(int i=0; i< 10; i++){
//           set.add(sc.nextInt()%42);
//      }
//        System.out.println(set.size());

      //  평균 #1546
//      int n = sc.nextInt();
//      double[] num = new double[n];
//      double sum = 0;
//      for(int i =0; i < n; i++){
//          num[i]= sc.nextDouble();
//      }
//      Arrays.sort(num);
//      double max = num[n-1];
//      for(int i =0; i < n; i++) {
//          sum += (num[i]/max);
//      }
//      System.out.println(sum/n*100);

        // OX 문제 #8958
//        int n = sc.nextInt();
//
//       String arr[] = new String[n];
//
//        for(int i = 0; i<n; i++){
//        arr[i] = sc.next();
//        }
//        sc.close();
//
//        for(int i = 0; i < arr.length; i++){
//            int ct = 0;
//            int sum = 0;
//
//            for(int j =0; j < arr[i].length(); j++){
//
//                if(arr[i].charAt(j) =='O'){
//                    ct++;
//                }else{
//                    ct = 0;
//                }
//                sum += ct;
//            }
//            System.out.println(sum);
//        }

        // 평균은 넘곘지? #4344

        int n = sc.nextInt();
        int arr[];

        for (int i = 0; i < n; i++){
            int num = sc.nextInt();
            arr = new int[num];
            double sum = 0;
            for(int j = 0; j<arr.length; j++) {
                int val = sc.nextInt();
                arr[j] = val;
                sum += val;
            }
            double mean = (sum/num);
            double memct = 0;
            for(int j =0; j<num; j++){
                if(arr[j] >mean) {
                    memct ++;
                }
            }
            System.out.printf("%.3f%%\n",(memct/num)*100);
        }
    }
}





























