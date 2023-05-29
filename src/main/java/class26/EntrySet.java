package class26;

import java.util.HashSet;
import java.util.Set;

public class EntrySet {
    public static void main(String[] args) {
        Set<Entry> entrySet=new HashSet<>();// <> the class which we want to print its objects
        entrySet.add(new Entry("COKE",2.7));
        entrySet.add(new Entry("Milk",2.7));
        entrySet.add(new Entry("COffee",2.7));
       //  for(Entry e:entrySet){
        //     System.out.println(e.getKey()+" "+e.getPrice());
           //  e.getPrice();// because it is string we need sout
           //  System.out.println(e.getKey()+" "+e.getPrice());
            // if(e.getKey().contains("i")&&e.getPrice()>3){
             //    System.out.println(e.getKey()+" "+e.getPrice());
          //   }


             entrySet.removeIf(x->x.getKey().contains("i")&& x.getPrice()<2);
             System.out.println(entrySet);
         }

    }

