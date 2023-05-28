package class112D;

public class E12DArrays {
    public static void main(String[] args) {
        int[][] arr={
                {10,20,30,40,50   },
                {1,2,3,4,5},
                {5,5,5,5,5},
                {10,8,6,4,2},
        };
        for(int i=0;i< arr.length;i++){
            for(int x=0;x< arr[i].length;x++){
                if(arr[i][x]%2==1){
                    System.out.print(arr[i][x]+" ");
                }
            }
        }
    }
}
