package class15Methods;

public class E4 {
    String name;
    static int age1 =10;// the static variable can be acess in all
    // the methods instance or other methods and also in another class
    void print(){
        System.out.println(name);
        int age =10;
        System.out.println(age);
        System.out.println(age1);
        System.out.println(Math.E); // IT IS universsalit is STATIC
    }
    void printe(){
        System.out.println(name);// instance variable an  exist inside
        // instance method
        // method can be instance
    }
    static void p(){
        System.out.println();// this a static method
        System.out.println(age1);
    }
}
