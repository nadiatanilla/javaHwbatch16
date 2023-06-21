package ReviewClass12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class R4Maps {
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
     /*  map.forEach((key,value)->{
           if(key.contains("a")&&value>4)
               System.out.println(key+" "+value);
               }*/
        var entrySets=map.entrySet();
        for(var entry:entrySets){
            if(entry.getKey().contains("a")&& entry.getValue()>4){
                System.out.println(entry);
            }
        }
    }
}
