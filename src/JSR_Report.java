import java.util.Scanner;

public class JSR_Report {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        JSR jsr =  new JSR();

        System.out.print("출력정보를 선택하세요 (1~3 까지 문자 입력): ");
        int select = sc.nextInt();

        switch (select){
            case 1 :
                System.out.println(jsr.show("유장석"));

                break;
            case 2 :
                System.out.println( jsr.show("유장석", "jangsukr@gmail.com"));

                break;
            case 3 :
                System.out.println( jsr.show("유장석", "jangsukr@gmail.com", "19920703"));

                break;
            default:
                System.out.println("숫자를 잘못입력 하셨습니다.");
                break;
        }
    }
}
