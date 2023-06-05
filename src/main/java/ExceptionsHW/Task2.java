package ExceptionsHW;

import java.util.Scanner;

public class Task2 {
    //Create a method checkUserName that will throw a runtime exception.
    // Method should throw an exception when entered username is less than 5 characters.
    public static void checkUserName(String userName){
        try{
            if(userName.length()<5){
                throw new RuntimeException();
            }else{
                System.out.println(userName+" is a correct user name ");
            }
        }catch (Exception exception){
          //  exception.getStackTrace();
            System.out.println(" Exception is "+exception);
        }
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=scan.next();
        checkUserName(name);
    }
}
