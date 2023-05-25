package StringTasksHW;

public class

palindromeString {
    public static void main(String[] args) {
        //Palindrome String is String that remains the same after reversing it
        String str="MADAM";
        String string=str;
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
            if(string.equals(rev)){
                System.out.println(string+ " is Palindrome string");
            }else{
                System.out.println(string+" is not Palindrome string");
            }
        }
    }

}
