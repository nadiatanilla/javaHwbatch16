package class23_2Incapsulation;

import java.util.ArrayList;

public class E1Collections {
    public static void main(String[] args) {
        String name="Veronica";
        String name1="Nadia";
        String []names={"Sarah","Nadia"};
        String []names2=new String[2];
        names2[0]="Semir";


        ArrayList<String> arrayList=new ArrayList<>(50);// dynamic array
        arrayList.add("Nadia");
        arrayList.add("Fatima");
        System.out.println(arrayList);
    }
}
