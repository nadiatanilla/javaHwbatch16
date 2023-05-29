package class26;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        //Create a map of Best Buy store. Place
        //item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
        //Retrieve all keys and values from a Best Buy map using EntrySet.
        HashMap<Integer,String> items=new HashMap<>();
        items.put(1234590,"Printer");
        items.put(7667656,"Printer");
        items.put(1234578,"Printer");
        items.put(1234545,"Printer");
       for(Map.Entry<Integer,String> i: items.entrySet()){
           System.out.println(i.getKey()+" = "+i.getValue());
       }
    }
}
