package class29Review2;

import java.util.ArrayList;
import java.util.List;

public class E6Methods {
    public static void main(String[] args) {
        E6Methods method=new E6Methods();
        List<Integer>arrayList=new ArrayList<>();
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(5);
        System.out.println(arrayList);


    }
    void print(List<Integer>list){
        for(Integer l:list){// we can do int too as autoboxing
            System.out.println(l);
        }

    }
   //an call another method inside method but you can not create it

}