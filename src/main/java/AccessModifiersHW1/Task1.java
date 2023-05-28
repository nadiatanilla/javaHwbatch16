package AccessModifiersHW1;

public class Task1 {
    // Create a method that will take a String as a parameter and returns reversed String.
    // Method should be available to all classes within your project and accessible by class name.
    public String revStr(String s1){
        StringBuilder sb=new StringBuilder(s1);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        AccessModifiersHW.Task1 obj=new AccessModifiersHW.Task1();
        String res=obj.revStr("Java language");
        System.out.println(res);
    }
}
