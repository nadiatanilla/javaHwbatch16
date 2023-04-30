package reviewClasses;

public class iceCreamTester {
    public static void main(String[] args) {
        // the object of class icecream
        iceCream ice =new iceCream();
        ice.flavor="Vanilla";
        ice.dairyFree=true;
        ice.price=34;

        ice.eat();
        ice.buy();
        // we can create many objects
        System.out.println("Creating second object");

        iceCream ice2 =new iceCream();
        ice2.flavor="Chocolate";
        ice2.dairyFree=true;
        ice2.price=45;
        ice2.eat();
        ice2.buy();

    }
}
