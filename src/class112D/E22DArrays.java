package class112D;

public class E22DArrays {
    public static void main(String[] args) {
        String[][] names={
                {"Sarah","Artem","Lean","Semir"},
                {"Nadia","Farwa","Rida","Fatima"},
        };
        for(int i=0;i< names.length;i++){
            for(int x=0;x< names[i].length;x++){
                System.out.print(names[i][x]+" ");
            }
            System.out.println();
        }

    }
}
