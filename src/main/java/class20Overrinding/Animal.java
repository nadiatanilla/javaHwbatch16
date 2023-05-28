package class20Overrinding;

public class Animal {
    String name;
    String color;
    int age;
    Animal(String name,String color,int age){
        this.name=name;
        this.color=color;
        this. age=age;
    }
    void printInfo(){
        System.out.println(name+" "+color+" "+age);
    }
    void walk(){
        System.out.println("Walk Walk");
    }
    void ryn(){
        System.out.println("run ryn");
    }
    void eat(){
        System.out.println("eating");
    }

}
class Dog extends Animal{
    Dog(String name,String color,int age){
        super(name,color,age);

    }
    // Java the closest methods
    @Override  //optional perform annotation we
    void eat( ){  // should be same return type and same parameters
       // super.eat();
        System.out.println("I like eating ");// method overriding
// implementation
    }
}
class Cat extends Animal{
Cat(String name,String color,int age){
    super(name,color,age);
}
}
class Horse extends Animal{
Horse(String name ,String color,int age ){
    super(name,color,age);
}
}
