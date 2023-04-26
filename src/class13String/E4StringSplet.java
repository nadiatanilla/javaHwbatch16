package class13String;

public class E4StringSplet {
    public static void main(String[] args) {
        String str="Today is Sunday. we have Java class?we like java";
        String[]strArr=str.split("[.!?]");// WE HAVE MULTIPLE ELEMENTS SO WE NEED ARRAY
        System.out.println(strArr.length);// HOW MANY ARRAY WE HAVE AND HERE ARRAY==SENTENCE
        System.out.println(strArr[0]);
        System.out.println(strArr[2].trim());
    }
}
