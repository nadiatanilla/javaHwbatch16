package class18Enheritance;

public class Person {
    String name ;
    void sleep(){
        System.out.println(" sleeepppiiing");
    }
}
class Employee extends Person{

}
class Tester extends Employee{

}
class PersonTester{
    public static void main(String[] args) {
        Tester tester=new Tester();
        tester.name="Nadia";
        System.out.println(tester.name);
        tester.sleep();
    }
}