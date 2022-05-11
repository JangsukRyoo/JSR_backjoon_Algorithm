package Function_Practice;

public class Sum {
    //#15596 정수의 합
    public static void main(String[] args) {
        class  Test {
            long sum(int[] a) {
                long sum = 0;	// a 배열 정수 합 변수

                for(int i = 0; i < a.length; i++) {
                    sum += a[i];
                }
                return sum;
            }
        }
    }
}
