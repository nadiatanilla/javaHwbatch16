package reviewClasses;
// CA NOT CREATE OBJECT OF THE INTERFACE
public abstract class Abstract {
    public String type,color;
    Abstract(String type,String color ){
        this.type=type;
        this.color=color;
    }
    protected void printInfo(){
        System.out.println("We build "+color+" "+type);
    }
   public  abstract double calculate();// non access modifiers
}


interface Durable{
// we cAan only have PUBLIC STATIC final VARIABLE in interface class
    boolean draw=true; // you do not need to add public static
    // all methods by default are public and abstract;
    void drawing();// you do not need to add public static because they are added by default

}
class triangle extends Abstract{
double base,height;
   triangle(String type,String color,double base,double height){
       super(type,color);
       this.base=base;
       this.height=height;
   }
   public double calculate(){
       return( base*height)/2;
   }
   public void print(){
       System.out.println(type+" has demention as "+base+" " +
               "" +height);
   }
}
class Rectangle extends Abstract{
    double length,width;
    public Rectangle(String type, String color,double length,double width) {
        super(type, color);
        this.width=width;
        this.length=length;
    }

    @Override
    public double calculate() {
        return length*width;
    }
}