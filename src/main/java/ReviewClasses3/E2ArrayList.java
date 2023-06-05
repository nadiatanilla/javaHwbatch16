package ReviewClasses3;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();// diamond this arraylist of string
        arrayList.add("Adam");
        arrayList.add("ANNA");
        arrayList.add("Assel");
        arrayList.add("Nadia");
        arrayList.add("Said");
        System.out.println(arrayList);
        for(int i=0;i<arrayList.size();i++){// if we use arraylist.cointais it will check the array
            String name= arrayList.get(i);// always this to give us the one elelement
            if(name.contains("a"))
            System.out.println(name);// or arraylist .get(i)
        }
        // we can go with the enhanced for loop
        for(String ar:arrayList){
            if(ar.contains("a")){
                System.out.println(ar);
            }
        }
    }
}
