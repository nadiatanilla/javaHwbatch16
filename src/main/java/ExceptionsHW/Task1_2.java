package ExceptionsHW;

public class Task1_2 {
    public static int eligible(int age){
        try{
            if(age<16){
                throw new RuntimeException();
            }else{
                System.out.println("you are eligible");
            }
        }catch (Exception ex){
            System.out.println("you are not eligible");
           // ex.getMessage();
            ex.printStackTrace();
        }
        return age;
    }

    public static void main(String[] args) {
        Task1_2.eligible(13);
    }
}
