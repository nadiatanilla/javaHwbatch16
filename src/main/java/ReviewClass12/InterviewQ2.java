package ReviewClass12;

import java.util.Map;
import java.util.TreeMap;

public class InterviewQ2 {
    public static void main(String[] args) {

        // int[]arr={10,20,10,30,40,50,20,30,70,80,70};
        Map<Integer, Integer> map = new TreeMap<>();
        int[] arr = {10, 20, 10, 30, 40, 50, 20, 30, 70, 80, 70};

        for(int i:arr){
            int count=0;
            for(int j:arr){
                if(i==j){
                    count++;
                }
            }
            map.put(i,count);
        }
        System.out.println(map);
    }}