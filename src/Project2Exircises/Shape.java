package Project2Exircises;

public interface Shape {
    //Create an Interface 'Shape' with undefined methods as calculateArea
    //and calculatePerimiter. Create 2 classes Circle & Square that
    //implements functionality defined in the Shape Interface. Test your
    //code
    double calculateArea();
    double calculatePerimiter();

}
class Circle implements Shape{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    // the area of circle is : PI*r*r
    @Override
    public double calculateArea() {
return Math.PI*radius*radius;
    }
// the perimeter of circle is 2*IP*r
    @Override
    public double calculatePerimiter() {

        return 2*Math.PI*radius;
    }
}
class Square implements Shape{
     double side;
     Square(double side){
         this.side=side;
     }
     // the area of Square is side*side
    @Override
    public double calculateArea() {
        return side*side;
    }

    @Override
    public double calculatePerimiter() {
        return 4*side;
    }
}
class Main {
    public static void main(String[] args) {
        Circle circle=new Circle(7);
        double result=circle.calculateArea();
        System.out.println("The area of the circle is : "+result);
        System.out.println("The perimeter of circle is "+circle.calculatePerimiter());

        Square square =new Square(5);
        double res=square.calculateArea();
        System.out.println("The Area of square  is :"+res);
        System.out.println("The perimeter of square is "+square.calculatePerimiter());

    }
}
