package Class4;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter my name");
        String name = scanner.next();
        if (name.equals("Elina")) {
            System.out.println("Mac user");

        } else if (name.equals("Safyan")) {
            System.out.println("Naughty");
        } else if (name.equals("Halima")) {
            System.out.println("Best");

        } else if (name.equals("Axel")) {
            System.out.println("Bad boy");

        }
    }
}