package Arrays2DHOMEWORK;

public class task3Grocery {
    public static void main(String[] args) {
        String [][] grocery={
                {"Onions","Potatoes","Tomatoes"   },
                { "Bananas","Strawberries","Oranges"  },
                { "Milk","Cheese","Yogurt"   },
                {  "Chocolate","Cake","Macaroons" },
        };
        for(int i=0;i< grocery.length;i++){
            for(int x=0;x< grocery[i].length;x++){
                System.out.print(grocery[i][x]+" ");
            }
            System.out.println();
        }
        int  i=0;
        while(i< grocery.length){
            int j=0;
         while(j< grocery[i].length) {
             System.out.print(grocery[i][j]+" ");
             j++;
         }
         i++;
            System.out.println();
        }

    }
}
