package MathProblem1;

import java.util.*;
import java.util.stream.Collectors;

public class RightTriangle {
    public static void main(String args[]) {
        // #4153  직각 삼각형
        Scanner sc = new Scanner(System.in);
        while (true){
            String str = sc.nextLine();
            List<String> list = Arrays.asList(str.split(" "));
            List<Integer> numList= list.stream().map(s -> Integer.parseInt(s))
                                                .collect(Collectors.toList());

            numList.sort(Comparator.naturalOrder());
            if(numList.get(0) == 0){
                break;
            }
           if(Math.pow(numList.get(0),2) + Math.pow(numList.get(1),2) == Math.pow(numList.get(2),2)){
               System.out.println("right");
           }else{
               System.out.println("wrong");
           }
        }
    }
}
