package class21Polymorphism;

public class E1Polymorphism {
    public static void main(String[] args) {
      Animal []animal={new Dog("A","B","C"),
      new Cat("D","E","F"),
      new Horse("F","J","H")};
      for(Animal an:animal){
          //
          an.eat();
          an.sleep();
          an.speak();
      }
      // to access to a method that is not created in the parent class only in Dog we use Casting
        // for example run in dog
      Animal animals=new Dog("A","B","C");// to convert we need to creat objcet of that child class

          // this how we cast
        Dog d=(Dog) animals;
        d.run();
        // or this way
        ((Dog)animals).run();// it is a direct way
    }
}
