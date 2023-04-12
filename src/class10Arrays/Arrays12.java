package class10Arrays;

import java.util.Scanner;

public class Arrays12 {
    public static void main(String[] args) {
        int []numbers=new int[3];
        Scanner scanner=new Scanner(System.in);
        System.out.println("PLEASE Enter int numbers");
        for(int i =0;i< numbers.length;i++){

            numbers[i]=scanner.nextInt();
        }
        for (int number : numbers) {
            System.out.println(number);

        }
    }
}
