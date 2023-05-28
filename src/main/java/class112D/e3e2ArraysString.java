package class112D;

public class e3e2ArraysString {
    public static void main(String[] args) {
        String[][] names={
                {"Sarah","Artem","Lean","Semir"},
                {"Nadia","Farwa","Rida","Fatima"},};
        for(String[] name:names){
           for(String z:name) {
               System.out.print(z+" ");
           }
            System.out.println();
        }
    }
}
