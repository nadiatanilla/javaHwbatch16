package E14TasksMethods;

public class task2 {
    //Create a method createEmail(). Based on values of users firstName, lastName and email type,
    // your method should return complete email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
    String createEmail(String firstName,String lastName,String Email){
        String Gmail=firstName+lastName+Email;
      //  System.out.println(firstName+lastName+Email);

       return Gmail;
    }

    public static void main(String[] args) {
        task2 obj =new task2();
        String first="john";
        String last="snow";
        String email="@gmail";
        String result=obj.createEmail(first,last,email);
        System.out.println(result);

    }
}
