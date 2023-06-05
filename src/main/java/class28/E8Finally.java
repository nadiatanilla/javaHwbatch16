package class28;

public class E8Finally {
    public static void main(String[] args) {
        System.out.println("1");
        try{
            System.out.println("2");
            System.out.println(10/0);
            System.out.println("3");
        }catch(Exception e){ // we can have nexted try catch
            System.out.println("4");
            try{
            System.out.println(10/0);}
            catch (Exception x){
                System.out.println("8");
            }

        }
        System.out.println("5");
    }

}
