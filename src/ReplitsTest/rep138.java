package ReplitsTest;

public class rep138 {
   static void m1(){
        System.out.println("default");
    }
    protected static void m2(){
        System.out.println("protected");
    }
    public static void m3(){
        System.out.println("public");
    }
}

class Main {
    public static void main(String []args){

        rep138.m1();
        rep138.m2();
        rep138.m3();
    }
}
