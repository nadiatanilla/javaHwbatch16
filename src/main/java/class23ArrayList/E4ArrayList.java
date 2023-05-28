package class23ArrayList;

import class12classes.Dog;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {
        // arraylist is a class === it is part of the collection framework
        //<> these are called angle brackets or diamond operators ,we write the name of the class s objects we are planning to store in arraylist

     //   ArrayList<String>  names=new ArrayList<>();// names is a variable of arralist to store string

     //   names.add("");
     // ArrayList< Dog> dogs=new ArrayList<>();
    //  dogs.add(new Dog());// creating object of class dog which has to be created already
        Car car1=new Car("Prius","Honda");
        Car car2=new Car("Civic","Toyuta");
        ArrayList<Car> cars=new ArrayList<>();
        // creating object of dog and storring arraylist
        cars.add(car1);
        cars.add(car2);
        for(Car c:cars){
            c.print();
        }


    }
}
class Car{
    String make;
    String model;
    Car(String make,String model){
        this.make=make;
        this.model=model;

    }
    void print(){
        System.out.println("The car is "+model+" make is "+make);
    }

  //  ArrayList<Car>cars=new ArrayList<>();
}