package class13String;

public class E5StringVStringBuilder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Java");
        System.out.println(str.length());
        System.out.println(str.reverse());
// convert string to string builder to use methods we can not use in string like reverse
        String str1="Computer";
        StringBuilder str2=new StringBuilder(str1);
        System.out.println(str2);
        str2.reverse();
       str1=str2.toString();
        System.out.println(str1);
    }
}
