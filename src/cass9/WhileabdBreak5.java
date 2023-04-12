package cass9;

public class WhileabdBreak5 {
    public static void main(String[] args) {
        int temp=85;
        boolean summer=true;
        while(summer){
            if(temp<100) {
                System.out.println("it is good let s enjoy summer");
            }
            else if(temp>100){
                System.out.println("it is very hot");
                break;
            }
            temp++;

        }

    }
}
