package class22Abstract;

import javax.net.ssl.SNIServerName;

public class finalKeyWord {
    final String AAP="HY6776776"; // WE CAN DO THAT AT THE BIGGINNIG BUT PREFER TO NOT SING IT DIRECTELY AND USE CONSTRUCTOR
    final String SSN;
    finalKeyWord(String SSN){
      this.SSN=SSN;
        System.out.println(SSN);
        // NOT ALLOWED TO CHANGE THE VALUE
   // }
  // public static  final String URL;
   // finalKeyWord(String URL){
      //  this.URL="hhtp.syntax.com";


    }

}
class Test{
    public static void main(String[] args) {
        finalKeyWord f=new finalKeyWord("YUUU344");

    }
}