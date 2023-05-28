package Project2Exircises;

public class NumOfWords {
    public static void main(String[] args) {
    String word = "Hello, world!";
    int count=word.split("\s").length;
            System.out.println(count);
}
}
class StringWords{
    public int countWord(String word){
       int count =word.split(" ").length;

      return count;
    }
    public static void main(String[] args) {
        StringWords str=new StringWords();
        System.out.println( str.countWord("Java is programming language"));
    }
}
