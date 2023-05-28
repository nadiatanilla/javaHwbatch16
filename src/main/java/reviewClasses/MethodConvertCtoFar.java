package reviewClasses;

public class MethodConvertCtoFar {
    double degree (double c){
        double cel=(c*5/9)+32;
        return cel;
    }

    public static void main(String[] args) {
        MethodConvertCtoFar obj = new MethodConvertCtoFar();
       double res= obj.degree(34);
        System.out.println(res);

    }
}
