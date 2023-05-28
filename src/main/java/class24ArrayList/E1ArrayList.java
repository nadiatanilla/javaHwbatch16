package class24ArrayList;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {
        ArrayList<String> arraylist=new ArrayList<>();// whatever you put in the diamond brackets all the methods calling this data type
         // every single class is a child class of OBJECT PARENT CLASS
        Object obj=new ArrayList<>();
        Object obj1=new String();
        // it allows you to use all the data types
        // for each primitive data type Java created wrapper classes
       // Integer integer=new Integer(10);// the actual one
        Integer integer=10;
      // Integer intege=new Integer(20);
        Integer intege=20;
       System.out.println(integer*intege);
       // primitive data          classs
        //byte                    Byte
        //int                     Integer
        //boolean                Boolean
        //char                    Character
        // Java created the wraped classe so we can use the methods
        System.out.println(integer.longValue());
        System.out.println(Integer.MAX_VALUE);

    }

}
