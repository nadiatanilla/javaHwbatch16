package class25_3Collection;

import java.util.LinkedHashSet;

public class Task3 {
    public static void main(String[] args) {
        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("DC");
        cities.add("Alabam");
        cities.add("Alexandria");
        cities.add("New York");
        cities.add("Tanger");
        cities.add("Rabat");
        cities.removeIf(x->x.startsWith("A"));
        System.out.println(cities);

    }
}
