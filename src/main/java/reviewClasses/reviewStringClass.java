package reviewClasses;

public class reviewStringClass {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");// SB is mutable opposite os String
        sb.reverse();
        System.out.println(sb);

        sb.append("World");// here we can not relate it to string
        System.out.println(sb);// concat
        sb.toString();// here we can do relation with string convert SB to string
        // str=sb.toString()


        //Whrite a code to reverse a String
        String given="class";
        StringBuilder sb1=new StringBuilder(given);
        sb1.reverse().toString();
        System.out.println(given);
        // reverse string without using any inbuilt functions ==== loops

    }
}
