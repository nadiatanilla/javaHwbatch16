package class25_2Sets;

import java.util.LinkedHashSet;

public class E2Sets {
    public static void main(String[] args) {


        LinkedHashSet<String> fruit = new LinkedHashSet<>();
        // no dublicate but it will remember the order
        fruit.add("Kiwi");
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Mango");// ignored because it is duplicated
        System.out.println(fruit);

    }
}