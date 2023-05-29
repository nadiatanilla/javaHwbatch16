package class26;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task2 {
    //Create a map of countries with its capital that will store countries in alphabetical order.
    //Print all keys and values from a country map using for each loop and iterator.
    //Print all values from a country map using for each loop and iterator.
    public static void main(String[] args) {

        Map<String,String> countries=new TreeMap<>();
        countries.put("USA","Washington");
        countries.put("Morocco","Rabat");
        countries.put("Egypt","Cairo");
        countries.put("France","Paris");
        countries.put("Spain","Madrid");
      //  Set<String>countrySet=countries.keySet();
        for(String c:countries.keySet()){
            System.out.println(c);
        }
        System.out.println("************************************************");
        Iterator<String> i=countries.values().iterator();
        while(i.hasNext()){
            System.out.println( i.next());

            System.out.println("TO BRING BOTH USE ENTRYSET");

           // Set<Map.Entry<String,String>> entrySet=countries.entrySet();
           // for(Map.Entry<String,String>e:entrySet){
            //    System.out.println(e.getKey()+" = "+e.getValue());
           // }
            for(var e:countries.entrySet()){// var here replace Map.Entry<String,String>
                System.out.println(e.getKey()+" = "+e.getValue());
            }
        }

    }
}
