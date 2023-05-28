package class112D;

public class E52DArrays {
    public static void main(String[] args) {
        int[][] arr={
                {10,20,30,40,50   },
                {1,2,3,4,5},
                {5,5,5,5,5},
                {10,8,6,4,2},
        };
        int count=0;
        for (int[] arr1d : arr) {
            for (int i : arr1d) {
                if(i%2==0){
                    count++;
                }

            }

        }
        System.out.println(count);

   }
    }

