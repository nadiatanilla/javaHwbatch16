package class14Methods;

public class E2ArrayReturnType {
    int sumArr(int[] arr){
        int sum=0;
        for(int num:arr){
            sum=sum+num;
            // for(int i=0;i<arr.length;i++){sum=sum+arr[i];
        }
        return sum;// it is like sout but there is difference
    }

    public static void main(String[] args) {
        E2ArrayReturnType obj=new E2ArrayReturnType();
        int[]array={10,20,30};

       int result = obj.sumArr(array);// we need this step into to execute the sum
        System.out.println(result);
    }
}
