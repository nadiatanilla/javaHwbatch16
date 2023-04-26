package class13String;

public class task2 {
    public static void main(String[] args) {
        String str="I HAVE GIRLSssddfgg 223334@2@$#$3";
      //  System.out.println(str.replaceAll("^#^@",""));
        String str1=str.replaceAll("[^A-Za-z0-9]","");
        System.out.println(str1);
        System.out.println(str1.length());

          }
    }

