package class10Arrays;

import java.util.Scanner;

public class repl76arraysweekdays {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String[]days=new String[7];
        for(int i=0;i<days.length;i++){

            System.out.println("please enter day "+(i+1)+ " of the week");
            days[i]=scan.nextLine();
        }
        for (String week : days) {
            System.out.println(week);

        }


        }

    }

