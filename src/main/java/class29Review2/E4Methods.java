package class29Review2;

public class E4Methods {
    public static void main(String[] args) {
        E4Methods method=new E4Methods();
        method.printHello();
        method.printWord("Jva");
    }
    void printHello(){
        System.out.println("Hello World");
    }
    void printWord(String word){
        System.out.println(word);
        printHello();
    }// you can call another method inside method but you can not create it

}