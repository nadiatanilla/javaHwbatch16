package PracticeJava;

public class Replit2014 {
    public static void checkTemp(int temp){
        try{if(temp<32){
            throw new SyntaxStudentException();
        }else{
            System.out.println("Great student");
        }
        }catch(Exception ex){
            System.out.println(ex+" Awesome student");
        }
    }

    public static void main(String[] args) {
        checkTemp(30);
    }

}
class SyntaxStudentException extends Exception{

}