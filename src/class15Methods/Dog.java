package class15Methods;

public class Dog {
    String color;
    String name;
    int age;
    static double weight;
    static int legs=4;
    static String planet="Earth";

    public static void main(String[] args) {
        Dog d=new Dog();
        d.color="red";
        d.weight=20;// weigth is statti variable
        Dog d1=new Dog();
        System.out.println(d1.weight);// static variable will print 20
        System.out.println(d1.color);// instance vari null will print

    }
}
