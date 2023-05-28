package HomeWorkArrays;

public class integerSumArray {
    public static void main(String[] args) {
        int []numbers={23,5,-3,100,20};
        int sum=0;
        for(int x=0;x<numbers.length;x++){
            sum=sum+numbers[x];
        }
        System.out.println(sum);


        int [] counters={34,56,-45,56,-5,100};
         int sum1=0;
        for (int number : counters) {
            sum1 = sum1 + number;
        }
            System.out.println(sum1);

    }
}
