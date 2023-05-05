package reviewClasses;

import com.sun.tools.javac.Main;

public class ReviewMethods {
    // method is a block of code to perform specific task
    // in the future we have to develop methods in selenium classes
    // methods to return value or methods not return value (void)
    // methods with parameters and methods without parameters
    void hello() {
        System.out.println("Hello");
        // main is a method that s why void should be out of the main method

    }

    void helloWorld(String name) {
        System.out.println("hello " + name);
    }

    // i want methods that accept 3 String  concatenating them and return concatenated String
    String concatStr(String s1, String s2, String s3) {
        String concat = s1 + s2 + s3;
        return concat;

    }

    // i want return largest number from 2 nums
    int largest(int a,int b) {
          int large;
              if(a>b){
                   large=a;
              }else{
               large=b;
        }
          return large;
    }

    public static void main(String[] args) {
        ReviewMethods obj= new ReviewMethods();
        obj.hello();
        obj.helloWorld("Nadia");
       String result= obj.concatStr("hello","fatima","aouragh");
        System.out.println(result);
       int res= obj.largest(7,9);
        System.out.println(res);

    }
}
