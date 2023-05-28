package class18Enheritance;

public class AnimalTester {
    // create different animal classes like cat,dog.zebra
    // IS A RElationship

    public static void main(String[] args) {
        Horse horse=new Horse();
        horse.color="Black";
        System.out.println(horse.color);
        horse.eat();
        Cat cat=new Cat();
        cat.name="Mamo";
        cat.walk();
        cat.run();
    }
}




