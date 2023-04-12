package ReviewClass;

public class AotherNastedIf {
    public static void main(String[] args) {
        boolean vaccine = true;
        int dose = 1;
        if (vaccine) {

            if (dose == 1) {
                System.out.println("you need second one");

            }else if(dose==3){
                System.out.println("you are vaccinated");
            }else if(dose==3){
                System.out.println("you are fully vaccinated and booster");
            }
        }else{
            System.out.println( " go take one");
        }
    }
}