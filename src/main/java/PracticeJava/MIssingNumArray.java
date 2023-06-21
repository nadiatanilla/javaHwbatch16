package PracticeJava;

import java.util.Set;
import java.util.TreeSet;

public class MIssingNumArray {
    // print the missing num in an array
    public static void missingNum(int[]arr){
        Set<Integer>setArr=new TreeSet<>();
        for(Integer num:arr){
            setArr.add(num);
        }
        for(int i=0;i<arr.length+1;i++){
            if(!setArr.contains(i)){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int[]a={1,7,6,9,4,0};
        missingNum(a);
    }
}
