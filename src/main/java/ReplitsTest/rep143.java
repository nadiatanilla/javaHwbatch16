package ReplitsTest;

public class rep143 {
    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    double price;
    rep143(String make,String model,int numberOfDoors,int topSpeed,double price){
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;

    }


    void display(){
        System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
    }

    public static void main(String[] args) {
        rep143 obj1=new rep143("Toyuta","Prius",4,120,3000);
        obj1.display();
        rep143 obj2=new rep143("Toyota","Prius",4,120,3000);
        obj2.display();
        rep143 obj3=new rep143("Unknown","Unknown",4,120,3000);
        obj3.display();
        rep143 obj4=new rep143("Toyota","Pius",4,90,0);
        obj4.display();
    }
}
