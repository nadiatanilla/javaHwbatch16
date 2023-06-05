package ReviewClasses3;

import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> arrayList=new ArrayList<>();// diamond this arraylist of string
        arrayList.add("Adam");
        arrayList.add("ANNA");
        arrayList.add("Assel");
        arrayList.add("Nadia");
        arrayList.add("Said");
        System.out.println(arrayList.isEmpty());

        System.out.println(arrayList.contains("Thmin"));
        System.out.println(arrayList.indexOf("Nadia"));
        arrayList.removeIf(x->x.startsWith("a"));
        System.out.println(arrayList);
        arrayList.removeIf(x->x.length()<5&&x.contains("a"));
            System.out.println(arrayList);
        }

    }


