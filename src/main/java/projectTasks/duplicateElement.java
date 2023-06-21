package projectTasks;

import java.util.HashMap;
import java.util.Map;

public class duplicateElement {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        String[]names={"Tanilla","Fatima","Rida","Anissa","Fatima","Anna"};

        for(String str:names){
           if(map.get(str)==null){
               map.put(str,1);
           }else{
               int count=map.get(str)+1;
               map.put(str,count);
           }
       }
        System.out.println(map);
     /*   for(int i=0;i<names.length;i++){
            for(int j=i+1;j< names.length;j++){
                if(names[i]==names[j]){
                    System.out.println("The duplicate name is "+ names[j]);
                    System.out.println("i = "+i+" and j = "+j);
                }
            }
        }*/
    }
}
