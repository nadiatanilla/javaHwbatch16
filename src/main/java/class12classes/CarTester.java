package class12classes;

public class CarTester {
    public static void main(String[] args) {
        Car car=new Car();
        car.name="BMW";
        car.isFast=true;
        car.mileage=567;
        car.weight=666;
        car.color="White";

        car.run();
        car.move();
        car.stop();
    }
}
