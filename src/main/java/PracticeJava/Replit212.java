package PracticeJava;

import java.io.FileNotFoundException;

public class Replit212 {
    public static void throwException()throws FileNotFoundException{
        throw new FileNotFoundException();
    }

    public static void main(String[] args) {
        try{
            throwException();
        }catch (FileNotFoundException exception){
            System.out.println(exception);
        }
    }
}
