package cass9;

public class WhileLoopEx3 {
    public static void main(String[] args) {
        int num=1;
       while(num<=30){
           if(num%2!=1){
               System.out.print(num+" ");

           }num++;

       }
       int sum=0;
       for(int num1=1;num1<=30;num1++){
           if(num1%2==0){// this for the even numbers or num%2!=1 / num%2 != 0 and num%2 ==1 for the odd numbers
               sum=sum+num;
           }
       }
        System.out.println(num+" ");
    }
}
