package class14Methods;

public class E1ReturnType {
    void print(String word){ //we can put any data type we have learned
        System.out.println(word);// print is name of method
    }
    // void==> return type of method and void means this method does not
    //return any data
    //(String word) ==> is the parameters or inputs
    //{} inside == referred as the body of the method




    public static void main(String[] args) {
        // we are creating an object of the E1ReturnType class
        // in java all classes can act as data types
        E1ReturnType obj=new E1ReturnType();
        obj.print("Java");// calling the method on obj object and passing
        // the java as a string value as an input or argument
    }
}
