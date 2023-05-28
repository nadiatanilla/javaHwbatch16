package class19;

public class Animal {
    String name;
    String color;
    int age;
    double weight;
    static int numberOfLegs=4;// no need for static variables in the constructor
    // reuse the constructor
    public Animal(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }
// private modifiers and constructors never be inherited
    void display(){
    System.out.println(name+" "+color+" "+age+" "+weight+numberOfLegs);
}

}
class Dog extends Animal{
    double price;
  public Dog(String name, String color, int age, double weight,double price){
 super(name,color,age,weight);
 this.price=price;
  }
  void display(){
     super.display();
    System.out.println(price);
  }


}
class Cat extends Animal{
    public Cat(String name, String color, int age, double weight){
        super(name,color,age,weight);
    }


}
class Horse extends Animal{
    public Horse(String name, String color, int age, double weight){
        super(name,color,age,weight);
    }




}