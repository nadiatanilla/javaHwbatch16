package cass9;

public class BreakandContinueEx4 {
    public static void main(String[] args) {


        for(int b=0;b<10;b++){
            if(b>5){
                break;
            }
            System.out.println(b);
        }

        int sum=0;
        for(int a=0;a<50;a++){
            sum+=a;
            if(sum>=300){
                System.out.println(a);
                break;
            }

        }
    }
}
