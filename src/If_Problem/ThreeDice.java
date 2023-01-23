package If_Problem;

import java.util.*;
import java.util.stream.Collectors;

public class ThreeDice {

    public static void main(String args[]) {
        //#2480 주사위 3개
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] intArr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        List<Integer> intList = Arrays.stream(intArr).boxed().collect(Collectors.toList());

        Collections.sort(intList);

        if(intList.get(0) == intList.get(intList.size()-1)){
            System.out.println(10000 + (1000*intList.get(0)));
        }else if((intList.get(1) == intList.get(0)) || (intList.get(1) == intList.get(2))){
            System.out.println(1000+(intList.get(1) * 100));
        }else{
            System.out.println(Collections.max(intList) * 100);
        }
    }
}
