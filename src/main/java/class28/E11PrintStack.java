package class28;

public class E11PrintStack {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch(ArithmeticException e){
          //  System.out.println("Please do not divide by zero");
          //  e.printStackTrace();// helps you trace the eroor
            System.out.println(e.getMessage());
            System.out.println(e);
        }
        System.out.println("2");
    }
}
