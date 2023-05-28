package ConstructorHw;

public class Students {
    //Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    // Inside your class also have a method to Calculate Average Grade.
    // Test Student class for 5 different students with different marks. Your program should print an average mark of each student's name.
    String name;
    int psychologyGrade;
    int mathGrade;
    int sociologyGrade;

    public Students(String name, int psychologyGrade, int mathGrade, int sociologyGrade) {
        this.name = name;
        this.psychologyGrade = psychologyGrade;
        this.mathGrade = mathGrade;
        this.sociologyGrade = sociologyGrade;
    }
    void printGrades(){
        int average=(mathGrade+psychologyGrade+sociologyGrade)/3;
        System.out.println(this.name +" grade average is "+average);
    }
}
