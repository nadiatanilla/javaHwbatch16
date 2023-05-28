package Arrays2DHOMEWORK;

public class task6SumArrays {
    public static void main(String[] args) {
        String [][]countries={
                { "USA","Canada","Mexico" },
                { "Brazil" ,"Argentina","Peru" },
                { "France" ,"Netherlands" ,"Spain"  },
                { "China" ,"Japan","Singapore"    },
                {"Morocco","Egypt","Senegal"   },
        };

        for(int i=0;i< countries.length;i++){
            for(int j=0;j< countries[i].length;j++){
                System.out.print(countries[i][j]+" ");
            }
            System.out.println();
        }
        for (String[] country : countries) {
            for (String flag : country) {
                System.out.print(flag+" ");
            }

        }

        int sum=0;
        for(int i=0;i< countries.length;i++){
            sum=sum+ countries[i].length;

        }
        System.out.println(sum);
    }
}
