package ReviewClass;

import java.util.Scanner;

public class NotScannerReviewClass {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        System.out.println("please enter full sentence");
        String sentence= key.nextLine();
        System.out.println(sentence);

        System.out.println("Please enter 1 word");
        String word=key.next();
        System.out.println("Word that was captured= "+word);

        System.out.println(" please enter demicil");
        double amount= key.nextDouble();
        System.out.println("please enter integer");
        int num= key.nextInt();
    }

}
