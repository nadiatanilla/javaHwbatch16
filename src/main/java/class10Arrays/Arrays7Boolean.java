package class10Arrays;

public class Arrays7Boolean {
    public static void main(String[] args) {
        boolean []flags={true,false,true,false,false,true};
        int counter=0;

        while(counter< flags.length) {
            if (flags[counter] == false) {
               counter++;
            }



        }
        System.out.println(counter);

    }
}
