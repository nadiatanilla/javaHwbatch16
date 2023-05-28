package class16;

import java.util.Scanner;

public class Person {
    public String name="Nadia";
    String password="1234";
    private String getPassword; // for private info and for security
    static double bankBalance=12334;
    private void print(){
        System.out.println(getPassword);
    }
    private static void printBalance(){
        System.out.println(bankBalance);
    }

    public static void main(String[] args) {
        Person Farwa=new Person();
        Farwa.getPassword="123456";// access only in the same claassss
        Farwa.print();
        System.out.println(Person.bankBalance);// because it static we call class

    }
}
// in one class we can have only one public
