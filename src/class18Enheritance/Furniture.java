package class18Enheritance;

public class Furniture {
    String color="Black";

}
class Chair extends Furniture{
    String color="Blue";
    void printInfo(){
        String color="White";
        System.out.println(color);// local variable
        System.out.println(this.color);// instance variable in side parameter
        System.out.println(super.color);// instance in side parent
    }
}
class FurnitureTester{
    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.printInfo();
    }
}