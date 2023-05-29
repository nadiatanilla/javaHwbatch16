package MapsHW;

import java.util.LinkedHashSet;
import java.util.Set;

public class ConcatString {
    //Create the collection that will store single uniques Objects of a String type in which order is preserved.
    //Write a logic to concatenate all string from the collection.
    public static void main(String[] args) {
        Set<String > str=new LinkedHashSet<>();
        str.add("Java");
        str.add("is");
        str.add("Programming ");
        str.add("Language");
        for(String s:str){
            System.out.print(s+" ");
        }
        System.out.println(" ");

        StringBuilder concat=new StringBuilder();
        for(String s:str){
            concat.append(s+" ");
        }
        System.out.print(concat);
    }
}
