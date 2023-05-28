import java.util.Scanner;

public class E4LogicalOperator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your heights in inches");
        int height1=scanner.nextInt();


        if(height1<60){
            System.out.println("short");

        } else if(height1>=60&& height1<=72){
            System.out.println("Medium");

        }else{
            System.out.println("tall");
        }


    }
    }

