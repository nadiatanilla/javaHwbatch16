package class15Methods;

public class E2 {
    void method1(){
        System.out.println("hello world");

    }

  //  public static void main(String[] args) {

      //  E2 e=new E2();
     //  e.method1();
 //  }
   int sumArr(int[] num){ // we are returning sum so int sum
        int sum=0;
     //   int [] arr=new int[num];
        for(int i=0;i<num.length;i++){
         sum+=num[i] ;

        }
        return sum;
   }

    public static void main(String[] args) {
        E2 e1 =new E2();
        int []arr={20,3,7,8,9};
        e1.sumArr(arr);
        int sum= e1.sumArr(arr);
        System.out.println(sum);
    }
}
