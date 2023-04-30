package class14Methods;

public class E5Tester {
    public static void main(String[] args) {
        E5ArrayUtils obj=new E5ArrayUtils();
       // obj.contains()
        int []arr={10,20,45};// do not need to be same  like in the return type
        int number=20;
        boolean result=obj.contains(arr,number);
        System.out.println(result);
    }
}
