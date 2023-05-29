package class26;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<Integer, String> buildings=new LinkedHashMap<>();
        buildings.put(1,"Google");
        buildings.put(3,"FireFox");
        buildings.put(4,"Amazon");
        buildings.put(2,"Target");
        buildings.put(5,"Giant");
        buildings.put(6,"Walmart");
        buildings.put(7,"Macdonald");

        System.out.println(buildings.size());
        buildings.replace(4,"Target");
        buildings.remove(7);
        System.out.println(buildings);
    }
}
