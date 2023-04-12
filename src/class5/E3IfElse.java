package class5;

import java.util.Scanner;

public class E3IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your age ");
        int age = scan.nextInt();
        if (age >= 18) {
            System.out.println("you will get the license");
        } else {
            System.out.println(" you can t drive ");
        }
    }
}