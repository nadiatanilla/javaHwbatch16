package homework2;

import java.util.Scanner;

public class DmvLicense {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("You will get a driver license");

        } else {
            System.out.println("You need to get a learners permit");
        }
    }
}