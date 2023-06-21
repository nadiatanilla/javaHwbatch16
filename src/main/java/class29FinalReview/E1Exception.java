package class29FinalReview;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E1Exception {
    public static void main(String[] args) throws FileNotFoundException {

        method1();
    }

        static void method1() throws FileNotFoundException {
            method2();
        }

        static void method2() throws FileNotFoundException {
            method3();
        }

        static void method3() throws FileNotFoundException {
            File file = new File("Files/Emp1.xlsx");
            if (file.exists()) {
                FileInputStream fileInputStream = new FileInputStream(file);

            }
// unchecked exception occurs because it may be because of less knowledge  of java
// checked
//add exception or try catch
    // always use try catch block better than throw
            //to control the flow of your code
            // we can create our own exception
}}