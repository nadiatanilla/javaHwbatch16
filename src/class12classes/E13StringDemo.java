package class12classes;

public class E13StringDemo {
    public static void main(String[] args) {
        String sentence="yup we have another class";
        // subString is used to get part of the whole string
        System.out.println(sentence.substring(4));
        // this one when we start and when it ends
        System.out.println(sentence.substring(12,19));
        int startIndex=sentence.length()-5;
        System.out.println(sentence.substring(startIndex,sentence.length()));// this one to print the last 5 indexes
    }
}
