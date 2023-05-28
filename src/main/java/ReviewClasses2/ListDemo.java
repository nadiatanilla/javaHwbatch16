package ReviewClasses2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    //List<String> names=new LinkedList<>();
    public static void main(String[] args) {


        String[] names = new String[5];//static code simple array for string array for  string you must specify size
        ArrayList<String> amazonList = new ArrayList<>(10000000);// for array it is good to specify
        // the size it can improve the performan
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
amazonList.add(String.valueOf(i));
        }
long end=System.currentTimeMillis();
        System.out.println(end-start);

    }
}