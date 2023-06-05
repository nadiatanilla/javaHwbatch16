package ReviewClasses3;

import java.util.ArrayList;
import java.util.LinkedList;

public class E5ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> arrayList=new ArrayList<>();// diamond this arraylist of string
        arrayList.add("Adam");
        arrayList.add("ANNA");
        arrayList.add("Assel");
        arrayList.add("Nadia");
        arrayList.add("Said");

        ArrayList<String> feeDefaulter=new ArrayList<>();
        feeDefaulter.add("Axel");
        feeDefaulter.add("Farwa");
        feeDefaulter.add("Amall");
        feeDefaulter.add("asghar");
        arrayList.removeAll(feeDefaulter);// only feedefaulter will be removed
        System.out.println(arrayList);



        LinkedList<String> names=new LinkedList<>();


    }
}
