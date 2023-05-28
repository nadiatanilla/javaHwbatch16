package reviewClasses;

public class Fruit {
    // one super and one subclass ==== single level
    String name,color;

    public Fruit(String name, String color) {// initializing the instance var
        this.name = name;// in the parent class we use this
        this.color = color;
    }

    void eat(){
        System.out.println("We can eat "+name);
    }
}
class Mango extends Fruit{
    Mango(String name,String color){
        super(name,color);
        
    }
    protected void grow(String country){
        System.out.println(name+" grows in "+country);
    }
}
// 2 suclasses or more ==== hierarchical inheritance
class Apple extends Fruit{
    Apple(String name1,String color1){
     super(name1,color1);
    }

    protected void makeJuice(){
        System.out.println("We can make "+name+ " juice");
    }

}
//A==B==C==D======>multilevel
class babyApple extends Apple{
    babyApple(String name,String color,String test){
        super(name,color);
    }
    void print(){
        System.out.println(name+" is very small");
    }
}