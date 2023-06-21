package PracticeJava;

import java.util.Scanner;

public class repl214 {
    public static void check(){
        Scanner scan=new Scanner(System.in) ;
        System.out.println("Please enter temperature in your city");
        int temp= scan.nextInt();
        try{
            if(temp<32){
                throw new RuntimeException("It is Frozen there");
            }else{
                System.out.println("Nice weather");
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        check();
    }
}
