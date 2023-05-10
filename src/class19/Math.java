package class19;

public class Math {
   static void add(int num,int num2){
        System.out.println(num+num2);
    }

    // we can have multiple method of different data types  parameters in the same name it is overloading methods
    // overloading by different data
    // number of parameters should match
    //sequence / order of data types
    // same returntype
    //same variable type but different signature  parameters
    static void add(int num,double num2){// method header
        System.out.println(num+num2);// body
    }// name of method and parameter====== signature
    static void add(double a,int b){
        System.out.println(a+b);
    }
    static void add(double num1,double num3){
        System.out.println(num1+num3);

    }
    public static void main(String[] args) {
        add(10,10);
        add(2,4.5);
        add(5.5,7.9);
        add(3.5,6);
        // clean lines
        // readability

    }



}
