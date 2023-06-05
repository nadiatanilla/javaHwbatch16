package class28;

public class E5Exceptions {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("2");
        System.out.println("5");
        //ERRORS ARE RELATED TO THE  HARDWARE SO NO NEED OF SOFTWARE
        // we can do all of this for best practice
        try {
            "".charAt(10);
          //  System.out.println(10 / 0);
        } catch (ArithmeticException x) {
            System.out.println("Some one try to divide by zero");// Back up code
        }catch(NegativeArraySizeException x){
            System.out.println("someone is trying to create an array of negative size");
        }catch(Exception x){
            System.out.println("Something went wrong executing backup code");
        }
         System.out.println("9");

    }
}