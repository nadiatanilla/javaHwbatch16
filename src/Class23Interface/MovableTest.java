package Class23Interface;
// in the abstractwe can have some methods that are not abstract but in interface all
//methods should be abstract or public static final ones
public class MovableTest {
    public static void main(String[] args) {
       Movable mov=new Cat();
       // we can create object for the second interface class too
        washable w=new Dog();
       Movable[] m={new Cat(),new Dog(),};
       for(Movable movable:m){
           movable.move();
       }
    }
}
