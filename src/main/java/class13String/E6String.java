package class13String;

public class E6String {
    public static void main(String[] args) {
        String str="WIFE";
        str.toLowerCase();
        System.out.println(str);  // here it is mutable it will not change but if we String str1=str.toLowerCase sout (str1) will change


        StringBuilder str1=new StringBuilder("Husband");
        str1.reverse();
        System.out.println(str1);
    }
}
