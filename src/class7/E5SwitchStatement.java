package class7;

public class E5SwitchStatement {
    public static void main(String[] args) {
        char gender='F';

        switch(gender){
            case 'f':
                System.out.println("Female");
                break;
            case'M':
                System.out.println("Male");
                break;
            case'O':
                System.out.println("Others");
            default:
                System.out.println("None");
        }
    }
}
