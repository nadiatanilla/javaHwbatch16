package class18Enheritance;

public class Car {
    String make;
    String model;
    String color;
    int year;
    int engineCC;


    //the constructor we call should be the first one
    public Car(String make, String model, String color) {
        this.make = make;
        this.model = model;
        this.color = color;
      //  this.year = year;
      //  this.engineCC = engineCC;
    }

    Car(String make, String model, String color,int year){
        this(make,model,color);// always should be before the last this left ones
        this.year=year;

    }
}
