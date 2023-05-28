package class12classes;

public class Task2 {
    public static void main(String[] args) {
        String sent="Today is Saturday";
        for(int i=0;i<sent.length();i++){
            if(sent.charAt(i)=='a'){
                System.out.print(i+" ");
              //  System.out.println(sent.charAt(i));// this to print how many a
            }
        }
    }
}
