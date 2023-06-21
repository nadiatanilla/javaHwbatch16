package class29Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E1Maps {
    public static void main(String[] args) {
        Map<String,String> info=new HashMap<>();
        info.put("Moncef","Morocco");
        Map<String, List<String>> moreInfo=new HashMap<>();
        List<String>moncefVisit=new ArrayList<>();
        moncefVisit.add("Rabat");
        moncefVisit.add("Meknes");
        moncefVisit.add("Marrakesh");

        List<String> nadia=new ArrayList<>();
        nadia.add("DC");
        nadia.add("Dubai");
        moreInfo.put("Nadia",nadia);
        moreInfo.put("moncef",moncefVisit);
        System.out.println(moreInfo);

    }
}
