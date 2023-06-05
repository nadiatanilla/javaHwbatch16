package MapsHW;

import java.util.Map;
import java.util.TreeMap;

public class PersonTester {
    //In Test Class create a Map that will store key in ascending order.
    // In that map store personId and a Person Object. Print each object details.
    public static void main(String[] args) {
        //create objects
      //  Person person1=new Person("Anna","Smith",24,2675);
        Person person2=new Person("Jimmy ","Doe",34,4567);
        Person person3=new Person("Jim ","Dan",35,3425);

//      Integer for person Id and Person class       treemap for the ascending order
        Map<Integer,Person> personMap=new TreeMap<>();
        personMap.put(2,person2);
        personMap.put(1,new Person("Anna","Smith",23,3456));
        personMap.put(3,person3);
        for(var entryP:personMap.entrySet()){// var==== Map.Entry<integer,person>
            Person person=entryP.getValue();
            System.out.println(entryP.getKey());
            person.printDetails();



        }


    }
}
