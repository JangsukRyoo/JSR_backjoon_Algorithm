package Test;

public class Test {
    public static void main(String[] args){

        int a= 7;
        int b =0, c=0;

        try{
            c=a/b;
        }catch (ArithmeticException e2){
            System.out.println("exception2");
        }catch (ArrayStoreException e1){
            System.out.println("exception1");
        }catch (NumberFormatException e3){
            System.out.println("exception3");
        }catch (SecurityException e4){
            System.out.println("exception 4");
        }
    }
}

