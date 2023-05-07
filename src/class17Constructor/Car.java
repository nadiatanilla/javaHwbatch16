package class17Constructor;

public class Car {
    String make;
    String model;
    int engineCC;
    String color;
    Car(String make,String model,int engineCC,String color){// when we have same name for instance variable and parameters we use this keyword
       this. make=make;
       this. model=model;
       this. engineCC=engineCC;
        this. color=color;

    }
    void printInfo(){
        System.out.println(make+" "+model+" "+engineCC+" "+color);
    }

    public static void main(String[] args) {
        Car obj=new Car("Honda","Civic Type R",1800,"White");
obj.printInfo();
    }
}
