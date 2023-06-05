package ExceptionsHW;

import java.lang.ref.SoftReference;
import java.util.Scanner;

public class Task1 {

    // Create a method to check age eligibility that will throw a runtime exception. Method should throw an exception age is less than 16.
     public static void isEligible(int age){
         try{
             if(age<16){
                 throw new RuntimeException();
             }else{
                 System.out.println("You are elegible");
             }
         }catch (Exception e){
            // System.out.println("You are not eligible ");
            e.printStackTrace();
         }
     }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age :");
        int age=scan.nextInt();
        isEligible(age);
    }
}
