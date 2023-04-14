package Arrays2DHOMEWORK;

public class task4Arrays {
    public static void main(String[] args) {
        int[][] numbers={
                {11,22,33 },
                {4,5,6 },
                {23,24,8 },
        };
        int sum=0;
        for(int i=0;i< numbers.length;i++){
            for(int x=0;x< numbers[i].length;x++) {
                //  System.out.print(numbers[i][x]+" ");
                sum = sum + numbers[i][x];
              //  System.out.println(sum);
            }
        }
        System.out.println(sum);


        for (int[] number : numbers) {
            for (int num : number) {
                sum=sum+num;
            }
        }
        System.out.println(sum);
    }
}
