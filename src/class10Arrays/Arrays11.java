package class10Arrays;

public class Arrays11 {
    public static void main(String[] args) {
        // there are two ways of creating arrays
        // new int
        int []numbers=new int[5];// create array of int with size 5

     int num=50;
     for(int i =0;i< numbers.length;i++){
    numbers[i]=num;
    num=num+10;
      //  numbers[0]=50;// store 50 in index 0
      //  numbers[1]=60;
      //  numbers[2]=70;
       // numbers[3]=80;
      //  numbers[4]=90;
      //  for (int number : numbers) {


        }
     for(int number:numbers){
         System.out.println(number);
     }

    }
}
