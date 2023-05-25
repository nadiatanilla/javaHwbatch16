package class24ArrayList;

import java.util.ArrayList;

public class E6Arraylist {
    public static void main(String[] args) {
        ArrayList<String> makeup=new ArrayList<>();
        makeup.add("nailPolish");
        makeup.add("Lipstick");
        makeup.add("Blush");

        ArrayList<String> fruit=new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Strawberry");

        ArrayList<String> grocery=new ArrayList<>();
        grocery.addAll(makeup);
        grocery.addAll(fruit);
        System.out.println(grocery);


    }
}
