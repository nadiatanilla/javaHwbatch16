package projectTasks;

public class sumEvenOdd {
    public static void main(String[] args) {
        /*. Create a 2D array of integers. Develop a program which will calculate the sum of even and odd numbers
                  for that array. */
        int[][]numbers={
                {3,8,50,45,7,12,75,34},
                {23,6,10,40,15,32,9},
        };
        int sumEven=0;
        int sumOdd=0;
        for(int x=0;x<numbers.length;x++) {
            for (int y = 0; y < numbers[x].length; y++) {
                if (numbers[x][y] % 2 == 0) {
                    sumEven = sumEven + numbers[x][y];

                } else {
                    sumOdd = sumOdd + numbers[x][y];
                }
            }
        }
            System.out.println("The sum of even numbers is "+sumEven);
            System.out.println("The sum of odd numbers is "+sumOdd);

    }
}
