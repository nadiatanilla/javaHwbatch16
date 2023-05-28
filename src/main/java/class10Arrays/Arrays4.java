package class10Arrays;

public class Arrays4 {
    public static void main(String[] args) {
        String [] names={"fatima","Tanilla","Nadia","Said","Rida"};
        int i=0;
        while(i<names.length){
            System.out.print(names[i]+" ");
            i++;
        }

        System.out.println();
        for(int j=0;j<names.length;j++){
            System.out.print(names[j]+" ");// here should be the initilized
        }
    }
}
