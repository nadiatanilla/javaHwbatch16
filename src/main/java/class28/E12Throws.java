package class28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E12Throws {
    public static void main(String[] args) throws FileNotFoundException {
        print();
    }
    static void print() throws FileNotFoundException {
        FileInputStream fileInputStream=new FileInputStream("sdfg");
    }
}
