package HomeWorkNumber4;

import java.util.Scanner;

public class H24Hours {
    public static void main(String[] args) {
        Scanner happy=new Scanner(System.in);
        System.out.println("What time is it?");
        int hour= happy.nextInt();
        if(hour>=1 && hour<=11){
            System.out.println("Morning");
        } else if (hour>=12 && hour<=15) {
            System.out.println("Afternoon");

        } else if (hour>=16 && hour<=20) {
            System.out.println("Evening");

        } else if (hour>=21 && hour<=24) {
            System.out.println("Night");

        }
    }
}
