package class22Abstract;

public abstract class Animal {// it represent logical entity
    private String name,color,breed;

    public Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }
void printInfo(){
    System.out.println(name+color+breed);
}
    abstract void speak();// ABSTRACT METHOD OR UNEMPLEMENTED
 abstract void eat();
 abstract void sleep ();// with the abstract we can remove the useless body , the class should be abstract
    // with abstract body should not be there
}
// it is mandatory  to create implem
// entation in the child class
// if we make subclass abstract no object will be calles
class Dog extends Animal {
    public Dog(String name, String color, String breed) {
        super(name, color, breed);
    }

    void speak() {
        System.out.println("Dog sound HOW HOW HOW ");
    }
    void eat(){
        System.out.println("Dog eats bones ");
    }
    void sleep (){
        System.out.println("Dog sleep 7 to 8");
    }
}
class Cat extends Animal{
    public Cat(String name, String color, String breed) {
        super(name, color, breed);
    }

    void speak() {
        System.out.println("Cat sound Meowwwwwwwwwwwww ");
    }
    void eat(){
        System.out.println("Cat eats fish ");
    }
    void sleep (){
        System.out.println("Cat slleeeepp");
    }
}
class Horse extends Animal{
    public Horse(String name, String color, String breed) {
        super(name, color, breed);
    }

    void speak() {
        System.out.println("Horse hawk hawk ");
    }
    void eat(){
        System.out.println("Horse eat grass ");
    }
    void sleep (){
        System.out.println("Horse sleep a loootttt");
    }
}