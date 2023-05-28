package ReviewClasses2;

public interface Moveable {
    void move();
}
class Dog implements Moveable{

    @Override
    public void move() {
        System.out.println("Dog is moving");
    }
}
class Car implements Moveable{// when classes are not belong to same category we can go with interface and opposite we can go with abstraction
    // interface =======few similarities
    // sharing instance fields and fields======= abstract

    @Override
    public void move() {
        System.out.println("Car are moving");
    }
}
class Human implements Moveable{

    @Override
    public void move() {

    }
}