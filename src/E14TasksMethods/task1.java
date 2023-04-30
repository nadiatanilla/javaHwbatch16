package E14TasksMethods;

public class task1 {
    void language(String word) {
        if (word.equalsIgnoreCase("France")) {
            System.out.println("Bonjour");
        }else{
            System.out.println("Not the right language");
        }
    }

    public static void main(String[] args) {
        task1 obj=new task1();
        String word =  "France";
        obj.language(word);
    }
}
