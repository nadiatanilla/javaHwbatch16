package class28;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E7Task {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        try{
        scan.nextInt();}
        catch (InputMismatchException x){
            System.out.println("The input should be int");
        }catch(Exception x){
            System.out.println("This is a misMach data");
        }

    }
}
