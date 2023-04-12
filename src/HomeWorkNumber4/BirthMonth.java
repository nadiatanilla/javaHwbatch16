package HomeWorkNumber4;

import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        System.out.println("Enter your birth month");
        String month=key.nextLine();
        if(month.equals("January") || month.equals("February") ||month.equals("March")){
            System.out.println("You are born in winter season");
        } else if (month.equals("April") || month.equals("May")) {
            System.out.println("You are born in spring season");

        } else if (month.equals("June") || month.equals("July")||month.equals("August")) {
            System.out.println("You are born in summer season");

        }
    }
}
