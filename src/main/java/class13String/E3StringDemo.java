package class13String;

public class E3StringDemo {
    public static void main(String[] args) {
        String str="kjhhfdd   HGFTD1232343434@#$%&*&^*";
        System.out.println(str.replaceAll("[^a-z]",""));
        // empty double quotes remove ^ evrything delet just letters from  a-z
        System.out.println(str.replaceAll("[^a-z0-9A-Z]",""));
        System.out.println(str.replaceAll("[Dh34]",""));
        // ^ do not replace a-z0-9
        System.out.println(str.replaceAll("[A-z]","\\$"));//$ here gives error it should be \\
        System.out.println(str.replaceAll(" ","\\$"));//we can replace spaces
    }
}
