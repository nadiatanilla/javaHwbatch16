package class23ArrayList;

import java.util.ArrayList;

public class E2Collections {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("nadia");
        names.add("Rida");
        names.add("Fatima");
        names.add("Said");
        names.add("Tanilla");
        System.out.println(names);
        System.out.println(names.size());// this to give the length of the array and if i add more it will count
        System.out.println(names.contains("Said"));
        names.remove("Nadia");
        // arraylist is the class and list is interface that implepented
        //* for all tag names

    }
}
