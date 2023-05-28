package class16;

public class SumArray {
     int sum(int []array){
        int sum=0;
        for(int i=0;i<array.length;++i){
           sum+=array[i] ;
        }
        return sum;
    }

    public static void main(String[] args) {
        SumArray obj=new SumArray();
       int result= obj.sum(new int []{2,3,4});

        System.out.println(result);
    }
}
