package ReplitsTest;

public class repl128 {
    static String mixString(String s1,String s2)

    {
        StringBuilder sen = new StringBuilder();
       // if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                sen.append(s1.charAt(i));
                sen.append(s2.charAt(i));
                 String s=sen.toString();
            }
            return sen.toString();

        }

    public static void main(String[]args){
        String firstValue=mixString("12345","abcde");
        System.out.println(firstValue);
        String secondValue=mixString("howdy","hello");
        System.out.println(secondValue);
    }


}
