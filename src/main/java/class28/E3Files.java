package class28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class E3Files {
    public static void main(String[] args) throws FileNotFoundException {
        // create an empty file with this only line
        FileOutputStream fileOutputStream=new FileOutputStream("Files/file1.txt");
    }
}
