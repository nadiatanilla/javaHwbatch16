package class112D;

public class E6Arrays2D {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40, 50},
                {1, 2, -3, 4, 5},
                {5, -5, 5, 5, 5},
                {10, 8, 6, 4, 2},
        };
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]%2!=0&& arr[i][j]<0){
                  // if(arr[i][j]<0){
                       System.out.print(arr[i][j]+" ");
                    }
                   // System.out.print(arr[i][j]);
                }
           System.out.println();

            }

        }
      //  int sum = 0;
       // for (int[] arr1 : arr) {
          //  for (int num : arr1) {
             //   sum=sum+num;

          //  }
          //  System.out.println(sum);
          //  sum=0;

       // }
       // for(int i=0;i<arr.length;i++){
          //  for(int j=0;j<arr[i].length;j++){
           //     sum=sum+arr[i][j];
           // }
          //  System.out.println(sum);
         //   sum=0;
       // }
        }

