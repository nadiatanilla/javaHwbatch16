package class26;

import java.util.*;

public class E1Maps {
    public static void main(String[] args) {
        Map<String,Double>drinks=new HashMap<>();
        drinks.put("coke",2.00);
        drinks.put("Milk",5.00);
        drinks.put("Mango Juice",3.00);
        drinks.put("Tea",3.00);
        drinks.put("Coffee",4.99);
      //  Set<String> keys=drinks.keySet();// to get the keys
        drinks.keySet().removeIf(x->x.contains("i"));
      //  Collection<Double> values=drinks.values();// to get value
        drinks.values().removeIf(x->x>3.0);
        // entrySet will give us both value and keys
        // this is from the class entry
      Set<Map.Entry<String,Double>>entrySet= drinks.entrySet();

      for(Map.Entry<String,Double> e:entrySet){
          System.out.println(e.getKey());
      }
      //  List<Map<String,Double>> mapList=new ArrayList<>();// nested list
        //REmove if call the entrySet method
        entrySet.removeIf(x->x.getKey().contains("i")&& x.getValue()>2);


    }
}
