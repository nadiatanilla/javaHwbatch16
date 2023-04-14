package Arrays2DHOMEWORK;

public class task2cars {
    public static void main(String[] args) {
        String [][]carsBrands={
                {"Cadillac","Chevrolet","Tesla" },
                {"Volkswagen","BMW","Porsche" },
                {"Kia","Genesis","Hyundai"},
                {"Ferrari","Lamborghini","Maserati" },
        };
        for(int i =0;i< carsBrands.length;i++){
            for(int j=0;j< carsBrands[i].length;j++){
                System.out.print(carsBrands[i][j]+" ");
            }
            System.out.println();
        }
        for (String[] brand : carsBrands) {
            for (String cars : brand) {
                System.out.print(cars+" ");

            }
            System.out.println();


        }

        }
    }


