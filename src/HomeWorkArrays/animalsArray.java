package HomeWorkArrays;

public class animalsArray {
    public static void main(String[] args) {
        String []animals={"Cat","Dog","Lion","Tiger","Bear" };
        for(int i=0;i< animals.length;i++){
            System.out.print(animals[i]+" ");
        }
        System.out.println();

        String []carsCompanies={"Cat","Dog","Lion","Tiger","Bear", };
        int x=0;
        do{
            System.out.print(carsCompanies[x]+" ");
            x++;
        }while(x<carsCompanies.length );



    }
}
