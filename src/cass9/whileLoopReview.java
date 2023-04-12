package cass9;

import java.util.Scanner;

public class whileLoopReview {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        System.out.println("Please enter 10 numbers");
        int sum=0;
        for(int x=0;x<10;x++){
           int num= key.nextInt();
           sum=sum+num;
        }
        System.out.println("summation of these numbers :" +sum);
    }
}