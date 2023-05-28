package class8;

public class E7WhileLoopsEx7 {
    public static void main(String[] args) {
        //add all the numbers from 1 to 10 and display result 55

        int a=1;
        int sum=0;
        while (a<=5){
            sum=sum+a;// same as sum+=a
            a++;
        }
        System.out.println(sum);
    }
}
