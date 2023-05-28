package class17Constructor;

public class Laptop {
    String make ;
    String model;
    double batteryLife;
    int storage;
    boolean camera;
    boolean touchpad;
    boolean touchScreen;

    public Laptop(String make, String model, double batteryLife, int storage, boolean camera, boolean touchpad, boolean touchScreen) {
        this.make = make;
        this.model = model;
        this.batteryLife = batteryLife;
        this.storage = storage;
        this.camera = camera;
        this.touchpad = touchpad;
        this.touchScreen = touchScreen;
    }

    public static void main(String[] args) {
        Laptop obj=new Laptop("Dell","G5",3,512,true,false,true);

    }
}
