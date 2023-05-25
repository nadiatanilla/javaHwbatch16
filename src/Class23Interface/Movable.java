package Class23Interface;
// makes everyone follow the rules
public interface Movable {
    //int age;// no instance field in interfaces
    // all the methods are public static final
    int age=12;// initialize the instance var since it is final
    //no constructors (initialize the instance var)
    void move();// by default a=in interface class methods are abstract by default
}
// with the help of interface we can have two parents class
interface washable{
    void wash();
}
class Dog implements Movable,washable{// with interface, we use implement , we can not change the structure

    @Override
    public void move() {
        System.out.println(" Dogs are Moving..........");
    }
    public void wash(){
        System.out.println(" Washing ............");
    }
}
class Cat implements Movable{
    @Override
    public void move() {
        System.out.println(" Cats moving .........");
    }
}
class Horse{
    public void move (){
        System.out.println(" Horse moving");
    }
}