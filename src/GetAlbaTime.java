public class GetAlbaTime {

    public static void main(String args[]){
    }

    public static double calTime = 0.0;

    public double solution(double C, double F, double X) {
        int ab = 0;
        double answer = 0.0;
        double soloT = 0.0;
        double albaT = 0.0;
        double total = 0.0;

        soloT = getSoloT(C);

        calTime = soloT;
        total = getAlbaTime(C,F,X,ab);


        return answer;
    }

    public double getAlbaTime(double C, double F, double X, int ab){
        System.out.println();
        double abTime = 0.0;
        double getXTime = 0.0;
        double getTotal = 0.0;

        for(int i = 0; i< ab; i++){
            abTime += C/(2 + (F*i));
        }

        getXTime = X/(2+(F*ab));
        getTotal = abTime+getXTime;

        return getTotal;
    }

    public double getSoloT(double X){
        double soloT = 0.0;
        soloT = X / 2;

        return soloT;
    }
}

