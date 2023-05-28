package class15Methods;

public class Variables3 {

    String name;// outside  the methods called instance variables

    public static void main(String[] args) {
        String breed;// here it is local inside the method
        if(10>20){

            int sum=10; // sum is local to if condition ,
            // so we can not access to it outside of it
        }
        String name1;// instance variables
    }
}
