package class25_3Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        TreeSet<String> countries=new TreeSet<>();
        countries.add("USA");
        countries.add("Morocco");
        countries.add("France");
        countries.add("German");
        countries.add("Egypt");
        countries.add("Tunisie");
        System.out.println(countries);
        for(String c:countries){
            System.out.println(c);
        }
    }
}
