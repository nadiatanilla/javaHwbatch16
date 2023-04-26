package class13String;

public class E2StringDemo {
    public static void main(String[] args) {
        String str="njkkjDDFFGG23445@#$%";
        System.out.println(str.replaceAll("[a-z]","*"));
        System.out.println(str.replaceAll("[A-Z]","*"));
        System.out.println(str.replaceAll("[0-9]","*"));
        System.out.println(str.replaceAll("[a-zA-Z0-9]","*"));
        System.out.println(str.replaceAll("[A-z]","*"));//look at ASCII TABLE
        System.out.println(str.replaceAll("[#-z]","*"));//look at ASCII

        char c='A';
        c++;
        System.out.println(c);
        for(int i=0;i<10;i++){
            System.out.print(c++);
        }
    }
}
