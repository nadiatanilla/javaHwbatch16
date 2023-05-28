package ReplitsTest;

public class Method {
    static int sumArray(int  array[][]){
        int [][]arr=new int[0][0];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum=sum+arr[i][j];

            }
        }
        return sum;
    }
}
class Test extends Method {
    public static void main(String[] args) {
         System.out.println("hello world");
          Method obj =new Method();
       // int [][] a=new int [3][3];
        int [][] a={
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        // int[][] res= obj.sumArray(a);
       //  System.out.println(res);
      //  System.out.println(Method.sumArray(arr));
    }
}
