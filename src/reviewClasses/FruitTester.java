package reviewClasses;

public class FruitTester {
    public static void main(String[] args) {

        Apple apple=new Apple("A","B");
        apple.name="Fuji apple";
        apple.makeJuice();
        apple.eat();
        apple.getClass();// comes from object class == parent of all objects in java
    }
}
