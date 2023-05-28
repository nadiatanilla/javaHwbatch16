package projectTasks;

public class sumArray {
    public static void main(String[] args) {
        /*  . Create an array of integer values. After the array is created, calculate the sum of
        all stored elements in that array.*/
        int[] numbers={10,10,25,6,30,100};
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            sum=sum+numbers[i];
        }
        System.out.println(sum);
    }
}
