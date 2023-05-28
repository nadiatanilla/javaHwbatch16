package HomeWorkNumber4;

import java.util.Scanner;

public class WeekendWeekday {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter the day number:");
        int num = key.nextInt();
        if (num >= 1 && num <= 5) {
            System.out.println("It is a weekday");
        } else if (num >= 6 && num <= 7) {
            System.out.println("It a weekend");
        } else {
            System.out.println("Invalid day");
        }
    }
}