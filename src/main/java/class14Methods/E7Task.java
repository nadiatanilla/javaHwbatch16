package class14Methods;

public class E7Task {
    void larger(int num1, int num2) {
        //System.out.println(Math.max(num1, num2));
        if (num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }
    public static void main(String[] args) {
        E7Task obj=new E7Task();
        obj.larger(10,20); // because it is void we can not do int num=


    }
}
