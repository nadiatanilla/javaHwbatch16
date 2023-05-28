package HomeWorkNumber4;
/*3. Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules:
        if the average score >=90 → grade=A
        if the average score >= 70 and <90 → grade=B
        if the average score>=50 and <70 → grade=C
        if the average score<50 → grade=F*/

import java.util.Scanner;

public class ScoreAverage {
    public static void main(String[] args) {
        double quiz = 80;
        double midTerm = 75;
        double finalScore = 85;
        double totalScore = (quiz + midTerm + finalScore) / 3;
        if (totalScore >= 90) {
            System.out.println("Grade=A");
        } else if (totalScore >= 70 && totalScore < 90) {
            System.out.println("Grade=B");

        } else if (totalScore >= 50 && totalScore < 70) {
            System.out.println("Grade=C");

        } else if (totalScore < 50) {
            System.out.println("Grade=F*");

        }
    }
}