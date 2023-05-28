package class17Constructor;

public class Cat {
   // Cat(){
    //} // 0 argument constructor and parametrize constructor the one with parameters
     String name;
     // not allowed two have two values from the same data type
     Cat(String catName){
         name=catName;
         System.out.println("1 argument ");
     }
     Cat(String color,String breed){
         System.out.println("2 arguments constructor will called ");
     }
     Cat (String brand,int year){
         System.out.println("Different type will be called");
     }
     Cat(double weight){
         System.out.println(" double argument ");
     }
     Cat (int age){
         System.out.println("Int argument");
     }
     Cat(){
         System.out.println("0 argument constructor called");
     }
     void printInfo(){
         System.out.println(name);
     }

    public static void main(String[] args) {
        Cat cat=new Cat("American",2019);// default constructor created behind the scenes
        // it created automatically by Java it does not take any parameters
        // no need to create a constructor even if empty parameters


    }
}
