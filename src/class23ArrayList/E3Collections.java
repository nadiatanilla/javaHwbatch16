package class23ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class E3Collections {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("nadia");
        names.add("Rida");
        names.add("Fatima");
        names.add("Said");
        names.add("Tanilla");
       // names.clear();
        names.remove(0);
       // names.remove("Said");// after removing indexes change
       // names.remove(4);
        names.indexOf("Said");// will be 2 because we moved index0
        System.out.println(names);
        System.out.println("After reversing the list of names");
        Collections.reverse(names);
        System.out.println(names);
        for(int i=0;i<names.size();i++){
            System.out.println(names.get(i));
        }
    }
}
