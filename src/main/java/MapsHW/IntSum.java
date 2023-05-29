package MapsHW;

import java.util.ArrayList;
import java.util.List;

public class IntSum {
    //Create a collection of integers in which you can keep duplicates.
    //Write a logic to find sum of all integers
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(23);
        list.add(12);
        list.add(90);
        list.add(89);
        int sum=0;
        for(Integer i:list){
            sum+=i;
        }
        System.out.println(sum);
    }
}
