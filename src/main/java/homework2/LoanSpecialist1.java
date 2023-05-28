package homework2;

import java.util.Scanner;

public class LoanSpecialist1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the amount of your loan");
        double amount = scan.nextDouble();
        if (amount <= 200000) {
            System.out.println("Your request accepted");
        } else {
            System.out.println("Your request is rejected");
        }
    }
}