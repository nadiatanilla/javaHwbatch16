package Project2Exircises;

import java.util.Arrays;

public class AnagramStrings {
    public static void main(String[] args) {
        String str="listen";
        String str2="silent";
        if(str.length()!=str2.length()){
            System.out.println("The length of the String is different hence they are not anagram ");
        }else {
            char [] char1=str.toCharArray();
            char[] char2=str2.toCharArray();
            Arrays.sort(char1);
            Arrays.sort(char2);
            if(Arrays.equals(char1,char2)){
                System.out.println("Both Strings are anagram from each other");
            }else{
                System.out.println("Both Strings are not Anagram to each other");
            }
        }

    }
}
