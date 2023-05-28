package HomeWorkArrays;

public class largestArray {
    public static void main(String[] args) {
        int [] count={5,89,347,609,789,89};
        int max=count[0];

        for(int i =0;i<count.length;i++){
            if(count[i]>max){
                max=count[i];
            }

        }
        System.out.println(max);
    }
}
