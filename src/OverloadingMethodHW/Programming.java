package OverloadingMethodHW;

public class Programming {
    //Create a class named 'Programming'. While creating an object of the class,
    // if nothing is passed to it, then the message "I love programming languages" should be printed.
    // If some String is passed to it,
    // then in place of "programming languages" the value variable should be printed.
    // Example, if we pass "Java", then "I love Java" should be printed.
     public String  language(){
         return "Programming language";
     }
     public String language(String word){
         return "I love "+word;
     }
}
class TesterProgramming {
    public static void main(String[] args) {
        Programming obj=new Programming();
        System.out.println( obj.language());
        System.out.println( obj.language("Java"));
    }
}