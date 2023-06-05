package class28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E6Exceptions {
    public static void main(String[] args) {
        // checked are mandatory to handle,they are forced by the compiler
        // unchecked are non mandatory
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\usa20\\IdeaProjects\\SDET16\\Files\\file1.txt");
        }catch(FileNotFoundException e){
            System.out.println("the file that you are trying to read is not found on the address specified");
        }
    }
}

