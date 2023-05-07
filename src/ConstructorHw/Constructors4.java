package ConstructorHw;

public class Constructors4 {
    String brand;
    int yearMake;
    double price;
    Constructors4(){
        System.out.println("Zero argument constructor");
    }
   private Constructors4(String brand){
        this.brand=brand;
        System.out.println(this.brand);
    }
   public Constructors4(int yearMake){
        this.yearMake=yearMake;
       System.out.println(this.yearMake);
   }
   protected Constructors4(double price){
        this.price=price;
       System.out.println(this.price);
   }

    public static void main(String[] args) {
        Constructors4 obj=new Constructors4("American");  //private

    }

}
