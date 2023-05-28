package class25_3Collection;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {

      /*  List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");*/

        ArrayList<String> aList = new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        HashSet<String> hashSet = new HashSet<>(aList);
        System.out.println(hashSet);
        LinkedList<String> linkedList = new LinkedList<>(hashSet);
        System.out.println(linkedList);

    }
}
