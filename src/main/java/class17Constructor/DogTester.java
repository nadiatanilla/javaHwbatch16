package class17Constructor;

import java.util.Scanner;

public class DogTester {
    public static void main(String[] args) {
     /*   Dog obj=new Dog();
        obj.name="Jack";
        obj.breed="X";
        obj.color="Grey";
        obj.age=35;

        Dog obj1=new Dog();
        obj1.name="Jacky";
        obj1.breed="Z";
        obj1.color="black";
        obj1.age=45;

        Dog obj2=new Dog();
        obj2.name="Jimy";
        obj2.breed="X";
        obj2.color="black";
        obj2.age=35;

        Dog obj3=new Dog();
        obj3.name="Jack";
        obj3.breed="X";
        obj3.color="Grey";
        obj3.age=45;

        Dog obj4=new Dog();
        obj4.name="Joly";
        obj4.breed="Y";
        obj4.color="White";
        obj4.age=5;

        obj.printInfo();
        obj2.printInfo();
        obj3.printInfo();
        obj4.printInfo();*/
// this is how constructor create the object of class
        //it is used to inititialize the objects
        Dog dog1=new Dog("Jack","Black","Persian",3);
        Dog dog2=new Dog("Shaggy","White","Husky",5);
        Dog dog3=new Dog("Fluffy","grey","British",2);
        Dog dog4=new Dog("Papi","Black","Asian",8);
        dog1.printInfo();
        dog2.printInfo();
        dog3.printInfo();
        dog4.printInfo();
        Scanner scan=new Scanner(System.in);


    }
}
