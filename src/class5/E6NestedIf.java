package class5;

public class E6NestedIf {
    public static void main(String[] args) {
        int money = 20000;
        String day = "Monday";
        if (money  <10000) {
            if (day.equals("Sunday")) {
                System.out.println("Let s go shopping");
            } else {
                System.out.println("Let s wait for Sunday");
            }
        } else {
            System.out.println("Let s save more");
        }
    }
}