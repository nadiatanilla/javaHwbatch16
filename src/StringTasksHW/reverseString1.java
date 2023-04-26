package StringTasksHW;

public class reverseString1 {

    public static void main(String[] args) {
         String sentence="This sentence I want to reverse";
         String[]arr=sentence.split(" ");
      String reverseWord="";
      for(String sen:arr){
          StringBuilder rev=new StringBuilder(sen);
          rev.reverse();
          reverseWord=reverseWord+rev.toString()+" ";
      }
        System.out.println(reverseWord);
    }

}
