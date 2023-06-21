package class29Review2;

public class E10Methods {
    public static void main(String[] args)
    {
        int[] arr={2,4,6,7};
        System.out.println(sumArray(arr));
    }
    public static int  sumArray(int []arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
}