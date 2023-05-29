package class25_3Maps;

import java.util.HashMap;

public class E1Maps {
    public static void main(String[] args) {
        // no duplicate but it does not maintain the insertion order
        HashMap<String ,Double>grocery=new HashMap<>();// with hash map wiyh need two classes inside<>
        grocery.put("Apple",2.5);
        grocery.put("Eggs",4.6);
        grocery.put("Mango",2.5);
        grocery.put("Milk",3.5);
        // if insert the data with same key again it will override
        grocery.put("Apple",2.5);
        System.out.println(grocery);
        System.out.println(grocery.size());
        System.out.println(grocery.containsKey("Banana"));
    }
}
