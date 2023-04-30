package class14Methods;

public class palindromeTask {
    boolean isPalindrome(String word){
       // StringBuilder reversedStr= new StringBuilder();
      //  for(int i=word.length()-1;i>=0;i--){
        //    reversedStr.append(word.charAt(i));
      //  }
      //  boolean isPalindrome1=false;
       // if(reversedStr.toString().equalsIgnoreCase(word)){
        //    isPalindrome1=true;
      //  }
       // return isPalindrome1;
         return new StringBuilder(word).reverse().toString().equalsIgnoreCase(word);
    }

    public static void main(String[] args) {
        palindromeTask obj=new palindromeTask();
       boolean result= obj.isPalindrome("MADAM");
        System.out.println(result);

    }
}
