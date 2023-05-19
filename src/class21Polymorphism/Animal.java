package class21Polymorphism;

public class Animal {
    String name;
    String color;
    String breed;

    public Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    void printInfo(){
        System.out.println(name+" "+color+" "+breed);
    }
    void speak(){
        System.out.println("Animal sounds ");
    }
    void sleep(){
        System.out.println("Animals sleep 1 to 20 hours a day");
    }
    void eat (){
        System.out.println("Animals eat different things");
    }
}
class Cat extends Animal{


    public Cat(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("Meowwwwwwwwwwwwwww");
    }
    @Override
    void eat(){
        System.out.println("Cats eat fish");
    }
    @Override
    void sleep(){
        System.out.println("Cats sleep 10 to 12 hours");
    }
}
class Dog extends Animal{

    public Dog(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
   void speak(){
       System.out.println("Woof woooofff");
   }
   @Override
   void eat(){
       System.out.println("Dogs eat bones");
   }
   @Override
   void sleep(){
       System.out.println("Dogs sleep 10 to 12 hours a day");
   }
   void run(){
       System.out.println("Dog ios running ");
   }
}
class Horse extends Animal{

    public Horse(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("Wohahhahhahahah");
    }
    @Override
    void eat(){
        System.out.println("Horse eat grass");
    }
    @Override
    void sleep(){
        System.out.println("Horse sleeps 2 to 4 hours a day");
    }
}
class AnimalTester {
    public static void main(String[] args) {
        Dog dog = new Dog("Shaggy", "Black", "German");
        dog.printInfo();
        // we can not store object of dog in cat variable or other class but  if it is parent class it works
        // prent class can store object of child class
        Animal dog1 = new Dog("Jack", "black", "German");
        Animal[] animals = {new Dog("Jack", "black", "German"), new Cat("A", "B", "C")};
        for(Animal an:animals){
            an.printInfo();
        }
        double d=10;
        // this is widening type casting====upcasting
        Animal dog2=new Dog("Shaggy", "Black", "German");
        // the narrowing type casting not allowed==downcasting not allowed
      //  Dog dog3=new Animal("Shaggy", "Black", "German");
    }
}