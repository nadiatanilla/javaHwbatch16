package projectTasks;

public class maxMini {
    public static void main(String[] args) {
        int[]numbers={56,12,78,3,90,60,98,-3};
        int min=numbers[0];
        int max=numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<min){
                min=numbers[i];
            }
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println("The minimum number is "+min);
        System.out.println("The maximum number is "+max);
    }
}
