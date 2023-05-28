package Project2Exircises;

public class IsPalindrom {
    boolean isPalindrome(String word) {
        return new StringBuilder(word).reverse().toString().equalsIgnoreCase(word);
    }

    public static void main(String[] args) {
        IsPalindrom pali=new IsPalindrom();
       boolean result= pali.isPalindrome("Madam");
        System.out.println(result);
    }
}
class Palindrome {
    boolean isPalidrome(String str){
        boolean isPal=false;
        String reverseString=str;
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
            if(reverseString.equalsIgnoreCase(rev)){
                isPal=true;
            }
        }
        return isPal;
    }
    public static void main(String[] args) {
       Palindrome p=new Palindrome();
      boolean res= p.isPalidrome("MADAM");
        System.out.println(res);
    }

}
