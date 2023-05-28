package StringTasksHW;

public class reverseString2 {
    public static void main(String[] args) {
        String sentence= "I LOVE JAVA";
        StringBuilder sentence2=new StringBuilder(sentence);
        sentence2.reverse();
        sentence=sentence2.toString();
        System.out.println(sentence);

    }
}
