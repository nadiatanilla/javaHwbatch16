package class24ArrayList;

import java.util.ArrayList;

public class E7ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Fatima");
        names.add("Anna");
        names.add("Rida");
        names.add("Nadia");
         names.add("Said");
        System.out.println(names.isEmpty());
        System.out.println( names.contains("Rida"));
        System.out.println(names.size());
        System.out.println(names);
        for(String name:names){
            System.out.println(name);
        }

    }
}
