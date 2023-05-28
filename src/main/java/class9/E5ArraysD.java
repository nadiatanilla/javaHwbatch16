package class9;

public class E5ArraysD {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30,40,50},
                {20, 50, 60},
                {102, 54, 60},
                {20,55},
        };
        for(int row=0;row<matrix.length;row++){// row
            int []arr=matrix[row];
            for(int column=0;column<matrix[row].length ;column++){//element
                System.out.print(matrix[row][column]+" ");
            }
            System.out.println();
        }
    }

}
