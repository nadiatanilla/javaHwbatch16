package class15Methods;

public class E5 {
    String name="Jimi";
    String num;
    void print(){

        int num=10;
        System.out.println(num);
    }

    public static void main(String[] args) {
        E5 e=new E5();
        e.print();
        if(true){
            int sum=0;// we can reuse it in a different block outside brackets
        }
    }

}
