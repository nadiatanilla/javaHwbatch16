package ReviewClass12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class R3Maps {
    //entry
    // add works with the collection framework maps are not part of them
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        // duplicate data in maps
        map.put("Apple", 3);
        map.put("Kiwi", 1);
        map.put("Orange", 2);
        map.put("Mango", 4);
        map.put("Banana", 4);
        map.values().removeIf(x->x>3);
        System.out.println(map);
        map.entrySet().removeIf(x->x.getKey().contains("a")&&x.getValue()>3);
        System.out.println(map);

    }
}
