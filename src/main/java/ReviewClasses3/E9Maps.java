package ReviewClasses3;

import java.util.HashMap;
import java.util.Map;

public class E9Maps {
    public static void main(String[] args) {
        Map<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",3.5);
        fruit.put("Orange",3.5);
        fruit.put("Kiwi" ,3.5);
        fruit.put("Mango",3.5);
        System.out.println(fruit);
        fruit.remove("Mango");
        fruit.containsKey("Kiwi");
        fruit.containsValue(3.5);
        fruit.replace("Kiwi",7.9);
        System.out.println(fruit);
        System.out.println(fruit.get("Apple"));
    }
}
