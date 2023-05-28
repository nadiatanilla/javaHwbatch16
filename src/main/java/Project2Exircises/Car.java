package Project2Exircises;

public abstract class Car {
    //Create a Class Car that would have the following fields: carPrice and
    //color and method calculateSalePrice() which should be returning a
    //price of the car.
    //Create 2 sub classes: Sedan and Truck. The Truck class has a field
    //as weight and has its own implementation of calculateSalePrice()
    //method in which returned price is calculated as following: if
    //weight>2000 then returned price car should include 10% discount,
    //otherwise 20% discount.
    //The Sedan class has field as length and also does it is own
    //implementation of calculateSalePrice(): if length of sedan is >20 feet
    //then returned car price should include 5% discount, otherwise 10%
    //discount
    double carPrice;
    String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    abstract double calculateSalePrice();


}
class Sedan extends Car {
    double length;

    Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }


        @Override
        double calculateSalePrice() {
            if(length>20){
                return carPrice*0.5;// give 10% discount
            }else{
               return carPrice*0.1; // give 20% discount
            }

        }
    }
    class Truck extends Car{
        double weigth;

        Truck(double carPrice, String color, double weight) {
            super(carPrice, color);
            this.weigth=weight;
        }
        @Override
        double calculateSalePrice() {
            if(weigth>200){
                return carPrice*0.2;
            }else{
             return carPrice*0.1;
            }

        }
    }

class CarTester{
    public static void main(String[] args) {
      Sedan car=new Sedan(30000,"white",35);
        System.out.println( "Sedan Price after discount is "+car.calculateSalePrice());
        Truck truck=new Truck(40000,"Black",3000);
        System.out.println("The price of Truck after discount is "+truck.calculateSalePrice());
    }
}