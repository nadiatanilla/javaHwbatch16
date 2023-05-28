package Arrays2DHOMEWORK;

public class task5EvenArray {
    public static void main(String[] args) {
        int [][] evenNumbers={
                {4,6,19,7},
                {9,3,24,2},
                {5,14,30,12},
        };
        for(int i=0;i< evenNumbers.length;i++){
            for (int x=0;x< evenNumbers[i].length;x++){
                if(evenNumbers[i][x]%2==0){
                    System.out.print(evenNumbers[i][x]+" ");
                }
            }
            System.out.println();
        }
    }
}
