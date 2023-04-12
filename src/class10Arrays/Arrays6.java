package class10Arrays;

public class Arrays6 {
    public static void main(String[] args) {
        int [] numbers={10,50,60,45,100};
        for(int i=0;i<numbers.length;i++){// we can also say for(int i=1;i<numbers.length;i+=2)
            if(i%2==1){
                System.out.println(numbers[i]);
            }
        }
    }
}
