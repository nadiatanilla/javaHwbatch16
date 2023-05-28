package class13String;

public class task3 {
    public static void main(String[] args) {
        String str="Is it saturday? Is it raining? Do we have a Java class today?";
        String []strArr=str.split("[.?]");
        System.out.println(strArr.length);

    }
}
