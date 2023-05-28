package reviewClasses;

public class ReturnArray {
    String[] array(String s1) {// method header
        String[] arrays = s1.split(" ");
        return arrays;

    }

    public static void main(String[] args) {
        ReturnArray obj = new ReturnArray();
        String[] re = obj.array("hello my world"); // always to call array use enhanced loop
        for (String str : re) {

            System.out.println(str);// print just the adress if i just print re
        }
    }
}