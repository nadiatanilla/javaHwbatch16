package class25_2Sets;

import java.util.HashSet;

public class E1Sets {
    public static void main(String[] args) {
        // in Array list we can have duplicate value
        // in sets no duplicated value allowed
        HashSet<String> uniqueNames=new HashSet<>();// does not guarantee to return elements in order// it does not allowed the duplicate
        uniqueNames.add("Yellow");
        uniqueNames.add("Yellow");
        uniqueNames.add("green");
        System.out.println(uniqueNames);// it is random // deos not remember the insertions order
        // there is no get method in sets so no normal for loop , just enhanced and iterator
        for(String unique:uniqueNames){
            System.out.println(unique);
        }

    }
}
