package class25_3Maps;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.Collection;
import java.util.TreeMap;

public class E4Maps {
    public static void main(String[] args) {

        TreeMap<String,Double> makeUp=new TreeMap<>();
        //          key       value
        makeUp.put("LipStick",100.0);
        makeUp.put("BlushOn",34.89);
        makeUp.put("EyeLiner",23.09);
        makeUp.put("Foundation",24.56);
       // makeUp.values(); for values we use collection because it could be duplicated
        Collection<Double> values=makeUp.values();
        values.removeIf(x->x>80);
        XSSFWorkbook xssfWorkbook;
    }
}
