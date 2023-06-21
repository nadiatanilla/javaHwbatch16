package AccessModifiersHW1;

public class Task2 {
    //Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    // Method should be available inside the class only where it was declared and executed by calling its name
    private String vowelsOnly(String s1){
        String word= s1.replaceAll("[a,Z]","");
        return word;
    }

    public static void main(String[] args) {
        Task2 obj=new Task2();
        String result=obj.vowelsOnly("Pneumonoultramicroscopicsilicovolcanoconiosis");
        System.out.println(result);
    }
}
