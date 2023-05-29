package class25_3Maps;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class E3Maps {
    public static void main(String[] args) {
        // it based data based on keys
        // it is slower than hash map and linked hash map


        TreeMap<String,Double> makeUp=new TreeMap<>();
        //          key       value
        makeUp.put("LipStick",100.0);
        makeUp.put("BlushOn",34.89);
        makeUp.put("EyeLiner",23.09);
        makeUp.put("Foundation",24.56);

      Set<String> keys=makeUp.keySet(); // that help us get the keys
      keys.removeIf(x->x.contains("a"));
        System.out.println(makeUp);

       // System.out.println(keys); will get all the keys
       Collection<Double> values= makeUp.values();//is the framework interface of sets and lists and maps
       // var values=makeUp.values();// it refers any class so



    }
}
