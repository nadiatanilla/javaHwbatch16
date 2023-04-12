package cass9;

import java.util.Scanner;

public class WhileLoopEx2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number");
        int  num=scan.nextInt();

        while(num!=-1){
            System.out.println("try again");
            num= scan.nextInt();
        }
    }
}
