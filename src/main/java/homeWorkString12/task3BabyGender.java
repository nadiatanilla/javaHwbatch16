package homeWorkString12;

import java.util.Scanner;

public class task3BabyGender {
    public static void main(String[] args) {
        /*
Write a program that reads two people's first names and if they expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL */
        Scanner scan=new Scanner(System.in);
        System.out.println("Mom's first name ?");
        String momName=scan.next();
        System.out.println("Dad's first name");
        String dadName=scan.next();
        System.out.println("Boy or Girl ?");
        String gender=scan.next();
        gender=gender.toLowerCase();
        if(gender.equals("boy")){
            System.out.println(dadName.substring(0,3).toUpperCase()+momName.substring(momName.length()-2).toUpperCase());
        }else if(gender.equals("girl")){
            System.out.println(momName.substring(0,3).toUpperCase()+dadName.substring(dadName.length()-3).toUpperCase());
        }

    }
}
