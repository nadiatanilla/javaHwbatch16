package class18Enheritance;

public class D {
    static void printInfo(){
        System.out.println("Something");
    }
}
class E extends D{


}
class ETester{
    public static void main(String[] args) {
        E.printInfo();
    }
}