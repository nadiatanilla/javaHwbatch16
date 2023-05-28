package Project2Exircises;

import java.util.Scanner;

public class StringReverse {
    public String ReverseWord(String words){
        String rev="";
        for(int i=words.length()-1;i>=0;i--){
            rev=rev+words.charAt(i);

        }
        return rev;
    }

    public static void main(String[] args) {
        StringReverse reverse=new StringReverse();
        System.out.println( reverse.ReverseWord("I love Java"));
    }
}
class Reverse2{
    public String sentence(String str){
        StringBuilder sb= new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        Reverse2 rev=new Reverse2();
        System.out.println( rev.sentence("Hello World "));
    }
}
class Reverse3{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your String here:");
        String rev="";
        String str=scan.nextLine();
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
           // System.out.println(rev);  // it should be out of the loop
        }
        System.out.println(rev);
    }
}