package class29Review2;

public class E5Methods {
    public static void main(String[] args) {
        E5Methods method=new E5Methods();

        method.printWord("Jva",5);
    }
    void printHello(){
        System.out.println("Hello World");
    }
    void printWord(String word,int x){
       for(int i=0;i<x;i++){
           System.out.println("Java");
       }
    }// you can call another method inside method but you can not create it

}