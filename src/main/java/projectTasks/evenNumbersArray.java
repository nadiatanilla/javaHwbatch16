package projectTasks;

import java.util.*;

public class evenNumbersArray {
    public static void main(String[] args) {
        /* Create a 2D array or integer type where you will store odd and even numbers. Develop a program which will
identify/print the even numbers only.*/
        //create map that hold only even numbers for this 2D array
        int[][]numbers={
                {5,9,8,44,18},
                {17,35,24,13},
                {30,6,32,16},
        };
      //  Map<Integer, Integer> EvenMap=new HashMap<>();
        for(int[] num:numbers){
            for(int n:num){
                if(n%2==0){
                    System.out.println(n);
                }
              //  EvenMap.get(n).add(n);
            }
        }

       // System.out.println(EvenMap);
      /*  for(int x=0;x<numbers.length;x++){
            for(int y=0;y<numbers[x].length;y++){
                if(numbers[x][y]%2==0){
                    System.out.print(numbers[x][y]+" ");

                }
            }



                }*/
            }}




