package class14Methods;

public class E6Tsk {
    boolean even(int num){
      //  boolean isEven=true;
      //  if(num%2==0){
       //     isEven=true;
      //  }
      //  return isEven; the easiest way ;
        return num%2==0;
    }

    public static void main(String[] args) {
        E6Tsk obj=new E6Tsk();
        int num=42;
        boolean result =obj.even(num);
        System.out.println(result);
        System.out.println(obj.even(42));
    }
}



