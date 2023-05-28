package class8;

import java.util.Scanner;

public class WhileLooopsExScanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number");
        int count= scan.nextInt();
         int newNum=1;
        while (newNum<=count) {
            System.out.print(newNum+" ");
            newNum++;
        }
    }
}
