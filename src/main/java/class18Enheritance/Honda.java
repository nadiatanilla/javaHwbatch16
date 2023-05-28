package class18Enheritance;

public class Honda extends Cars {// we can write a lot of classes but only one public

}
// this one is hierarchical inheritance
class BMW extends Cars{
   void offerPackage() {
       System.out.println("Only BMW OFFERS the M package");
   }
}
class Audi extends Cars{

}
class CarTester {
    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.stop();
    }
}