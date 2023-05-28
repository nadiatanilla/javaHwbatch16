package HomeWorkNumber4;

import java.util.Scanner;

public class SwitchGrade {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        System.out.println("Please enter your grade");
        char grade=key.next().charAt(0);
        String explanation;
        switch (grade){
            case 'A':
                explanation="Excelent";
                break;
            case 'B':
                explanation="Good";
                break;
            case 'C':
                explanation="Average";
                break;
            case'D':
                explanation="Bad";
           break;
            default:
                explanation="Not acceptable";

        }
        System.out.println("Your grade is" +explanation);
    }
}
