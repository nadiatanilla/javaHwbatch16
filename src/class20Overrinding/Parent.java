package class20Overrinding;

public class Parent {
    // we can increase the access modifier defaut can be public in child class
    void getMarry(){
        System.out.println("marry to the girl of our choice");
    }
     void printNumber(){
        System.out.println(10);
    }
}
class Axel extends Parent{
    @Override// annotation should use it
    void getMarry(){
        System.out.println("I want to marry anna");
    }
    void printNumber(){
        System.out.println(20);
    }
}
class ParentTest{
    public static void main(String[] args) {
        Axel axel=new Axel();
    axel.getMarry();
    axel.printNumber();

}
}