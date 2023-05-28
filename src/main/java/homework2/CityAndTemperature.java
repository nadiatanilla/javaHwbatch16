package homework2;

import java.util.Scanner;

public class CityAndTemperature {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your city");
        String city=scan.nextLine();
        System.out.println("What is your temperature in Fahrenheit  ");
        int tempf=scan.nextInt();
        //the formula to convert Fahrenheit temperature to Celsius :(( Fah temp -32)*5)/9=Celsius temp//
        int temp2c=((tempf-32) *5) /9 ;
        System.out.println("The temperature in the city "+city+ " is "+temp2c +" Celesius" );

    }
}
