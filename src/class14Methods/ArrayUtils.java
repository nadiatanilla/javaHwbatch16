package class14Methods;

public class ArrayUtils {
    // create method of add two int numbers and it should return the result back when when called name of the method should be add
    int add(int a,int b){
        int sum=a+b;
        return sum;
    }

    public static void main(String[] args) {
        ArrayUtils addNum=new ArrayUtils();
        // we are calling the add method on obj object and passing two value
       int sum= addNum.add(10,20);
        System.out.println(sum);
        System.out.println(addNum.add(10,20));// both are working to get the result
    }
}
