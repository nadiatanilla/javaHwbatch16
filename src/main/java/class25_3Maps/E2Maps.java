package class25_3Maps;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class E2Maps {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> ranks=new LinkedHashMap<>();
        ranks.put(1,"James");  // with maps we use put no add
        ranks.put(2,"Jum");
        ranks.put(3,"Jon");
        ranks.put(4,"Jimi");
        // it maintains the order
        System.out.println(ranks);
        ranks.remove(2);
        System.out.println(ranks);
        ranks.replace(1,"Nadia");
        System.out.println(ranks);

    }
}
