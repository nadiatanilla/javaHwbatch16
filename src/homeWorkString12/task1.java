package homeWorkString12;

public class task1 {
    public static void main(String[] args) {
        String girls= "Tanilla && Fatima";
      int length=girls.length();

        if (girls.isEmpty()) {
            System.out.println("Nothing");

        } else if(length % 2 == 1 && length >= 3) {

                int middle = length / 2;

                System.out.println(girls.charAt(middle));
            }
        }
    }


