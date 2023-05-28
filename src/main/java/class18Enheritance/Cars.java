package class18Enheritance;

public class Cars {
    String color;
   protected String make;
    boolean isFast;
    double size;

   /* public Cars(String color, String make, boolean isFast, double size) {
        this.color = color;
        this.make = make;
        this.isFast = isFast;
        this.size = size;
    }*/

    void run(){
        System.out.println("Car is running ");
    }
    void move(){
        System.out.println("Car is moving");
    }
    void stop(){
        System.out.println("Car is stopping");
    }
}
