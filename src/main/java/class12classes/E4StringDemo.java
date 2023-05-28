package class12classes;

public class E4StringDemo {
    public static void main(String[] args) {

        String firstName="Ana";
        String lastName="Steen";
        String fullName=firstName+lastName; // most widely used approach
        System.out.println(fullName);
        System.out.println(firstName.concat(lastName));
    }
}
