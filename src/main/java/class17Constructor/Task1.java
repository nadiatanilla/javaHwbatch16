package class17Constructor;

public class Task1 {
    String carBrand;
    int yearCreated;
    Task1(){
        System.out.println(" No argument constructor");
    }
    Task1(String brand,int year ){
        carBrand=brand;
        yearCreated=year;
        System.out.println(" My car is "+brand +" "+ year);
    }

    public static void main(String[] args) {
        Task1 obj=new Task1();
        Task1 obj1=new Task1("American",2023);

    }
}
