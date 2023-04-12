package HomeWorkNumber4;

import java.util.Scanner;

public class SmallMl {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter a number please:");
        int number = key.nextInt();
        if (number >= 1 && number <= 10) {
            System.out.println("Small");
        } else if (number >= 11 && number <= 100) {
            System.out.println("Medium");

        } else if (number >= 101 && number <= 1000) {
            System.out.println("Large");
        }
    }
}
