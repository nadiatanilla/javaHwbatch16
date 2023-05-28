package class112D;

public class E4Arrays2D {
    public static void main(String[] args) {
        int[][] array2D={
                {10,20,30,40,50   },
                {1,2,3,4,5},
                {5,5,5,5,5},
                {10,8,6,4,2},
        };
     for(int []array1D:array2D){
         for(int num:array1D){
             System.out.print(num+" ");
         }
         System.out.println();
     }
    }
}
