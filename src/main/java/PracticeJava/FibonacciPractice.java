package PracticeJava;

public class FibonacciPractice {
    public static void main(String[] args) {
      int f=10;
      int a=0;
      int b=1;
      for(int i=1;i<=f;i++){
          int c=a+b;
          System.out.println(a+" ");
          a=b;
          b=c;
      }
        System.out.println("********************************");
   int fibo=20;
   int first=0;
   int second=1;
   for(int i=0;i<fibo;i++){
       if(i==0){
           System.out.println("0 ");
       }else if(i==1){
           System.out.println("1 ");
       }else{
           int sum=first+second;
           System.out.println(sum+" ");
           first=second;
           second=sum;
       }
   }
    }
}
