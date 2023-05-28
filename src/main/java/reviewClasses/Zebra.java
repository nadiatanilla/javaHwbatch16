package reviewClasses;

public class Zebra {
    // whenever instance variable are involved instance method are created
    String color;
    String name;
    int age;
    double weight;
    static int noOflegs=4;

    public Zebra(String color, String name, int age, double weight) {
        this.color = color;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    void printInfo(){
        System.out.println(color+name+age+weight+noOflegs);
    }
    static void speak(){
        System.out.println("moooooooooo");

    }
    

}
