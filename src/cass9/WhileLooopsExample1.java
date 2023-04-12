package cass9;

import java.util.Scanner;

public class WhileLooopsExample1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter starting number and ending number and the step ");
        int start=scan.nextInt();
        int end=scan.nextInt();
        int step=scan.nextInt();
        int number  =start; // this one like sum=0
        while(number<=end){
            System.out.print(number+" ");
            number=number+step;// number+=step
        }
    }
}
