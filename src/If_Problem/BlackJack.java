package If_Problem;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BlackJack {

    public static void main(String args[]) {
        //#2798 블랙잭
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] setArr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();

        String str2 = sc.nextLine();
        int[] intArr = Arrays.stream(str2.split(" ")).mapToInt(Integer::parseInt).toArray();
        List<Integer> intList = Arrays.stream(intArr).boxed().collect(Collectors.toList());

        int ct = setArr[0];
        int goal = setArr[1];
        int res = 0;

        for(int i =0; i<ct-2; i++){
            for(int j = i+1; j <ct-1; j++){
                for(int k = j+1; k < ct; k++){
                    if((res < intArr[i] + intArr[j] + intArr[k]) && (intArr[i] + intArr[j] + intArr[k]<=goal)){
                        res = (intArr[i] + intArr[j] + intArr[k]);
                    }
                }
            }
        }
        System.out.println(res);

        //IntStream으로 풀기
//        int ct = setArr[0];
//        int goal = setArr[1];
//        int[] a = {0};
//
//        IntStream.range(0, ct-2).forEachOrdered(i ->{
//            IntStream.range(i+1, ct-1).forEachOrdered(j ->{
//                IntStream.range(j+1, ct).forEachOrdered(k ->{
//                    if((a[0] < intArr[i] + intArr[j] + intArr[k]) && (intArr[i] + intArr[j] + intArr[k]<=goal)){
//                        a[0] = (intArr[i] + intArr[j] + intArr[k]);
//                    }
//                });
//            });
//        });
//        System.out.println(a[0]);
    }
}
