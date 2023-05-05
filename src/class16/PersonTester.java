package class16;

public class PersonTester {
    public static void main(String[] args) {
        Person person =new Person();
        // person.getPassword="hhghhg" no access in another class
       // person.print(); no access
       // Person.printBalance
        System.out.println(person.password);
        System.out.println(person.name);
    }
}
