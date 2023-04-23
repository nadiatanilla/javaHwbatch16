package class12classes;

import java.util.Scanner;

public class E10StringTask {
    public static void main(String[] args) {
      String userName="nadiachakouch";
      String passWord="pass5@";
      String confirmPass="PASS56565@";
      if(userName.isEmpty()&& passWord.isEmpty()){
          System.out.println("user and pass should not be empty");
      }else if(passWord.length()<8){
          System.out.println("Password is short");

      }else if(passWord.contains(userName)){
          System.out.println("password cn not contain username");
      }else if(passWord.equals(confirmPass)){
          System.out.println("password do not match");
      }else{
          System.out.println("Your user name has been created");
      }
    }
}
