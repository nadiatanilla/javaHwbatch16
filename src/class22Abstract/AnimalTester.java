package class22Abstract;

public class AnimalTester {
    public static void main(String[] args) {
        Animal []animals={new Dog("A","B","C"),new Cat("D","E","F"),new Horse("X","Y","Z"),};
        for(Animal ani:animals){
            ani.eat();
            ani.speak();
            ani.sleep();

        }
    }
}
// FINAL KEYWORD means ONCE you give a value it will not be change