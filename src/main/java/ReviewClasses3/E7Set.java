package ReviewClasses3;

import java.util.*;
import java.util.ArrayList;

public class E7Set {
    public static void main(String[] args) {

        Set<String> names=new HashSet<>();// no order is asked it is random no insertion order no duplicate
        names.add("Maz");
        names.add("Mama");
        names.add("Mark");
        names.add("Mazrk");
        System.out.println(names);
        List<String> list=new ArrayList<>(names);
        Collections.sort(list);// sort in alphabitical way
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        System.out.println(list.get(1));
    }
}
