package HomeWorkNumber4;

import java.util.Scanner;

public class SwitchCountryLanguage {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        System.out.println("Please enter your country");
        String country=key.nextLine();
        String language;
        switch (country){
            case "united states":
                language="English";
                break;
            case "Mexico":
                language="Spanish";
                break;
            case "Egypt ":
                language="Arabic";
                break;
            case "France":
                language="Frensh";
            default:
                language="unknown";

        }
        System.out.println("The language in your country is " +language);
    }
}
