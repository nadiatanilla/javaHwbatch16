package class25_2Sets;

import java.util.TreeSet;

public class E3Sets {
    public static void main(String[] args) {
        TreeSet<String> fruit=new TreeSet<>();
        fruit.add("Mango");
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Kiwi");
        fruit.add("banana");
        fruit.add("banana");// it sorts the element in ascending order it is alphabitical A b C D
        System.out.println(fruit);
    }
}
