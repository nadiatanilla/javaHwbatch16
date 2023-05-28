package class25_3Collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class E1CollectionFramework {
    public static void main(String[] args) {
        ArrayList<String>  fruit=new ArrayList<>();
        fruit.add("Mango");
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Apple");
        fruit.add("Banana");
        System.out.println(fruit);
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet(fruit);
        System.out.println(linkedHashSet);

    }
}
