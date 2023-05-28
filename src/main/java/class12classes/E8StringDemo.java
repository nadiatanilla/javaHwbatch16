package class12classes;

public class E8StringDemo {
    public static void main(String[] args) {
        String sentence="  JAVA is very very easy"; // if there is space in java it matters
        //method chaining use lot methods in one
        sentence=sentence.trim().toLowerCase();// trim ignor space
        System.out.println(sentence);



       // String searchWord="Java";
        System.out.println(sentence.startsWith("java"));// TO print the first element in string

    }
}
