package projectTasks;

public class evenNumbersArray {
    public static void main(String[] args) {
        /* Create a 2D array or integer type where you will store odd and even numbers. Develop a program which will
identify/print the even numbers only.*/
        int[][]numbers={
                {5,9,8,44,18},
                {17,35,24,13},
                {30,6,32,16},
        };
        for(int x=0;x<numbers.length;x++){
            for(int y=0;y<numbers[x].length;y++){
                if(numbers[x][y]%2==0){
                    System.out.print(numbers[x][y]+" ");

                }
            }

        }

    }
}
