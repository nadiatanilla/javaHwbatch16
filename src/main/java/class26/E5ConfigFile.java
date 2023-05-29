package class26;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class E5ConfigFile {


    public static void main(String[] args) throws IOException {
      //  System.out.println(System.getProperty("user.dir"));// to print the path of the project



        System.out.println(System.getProperty("user.dir"));
        String path=System.getProperty("user.dir")+"\\"+"Files\\Config.properties";

        System.out.println(path);
        FileInputStream fileInputStream=new FileInputStream(path);// it will navigate to that file
        // this special class knows how this file works

        Properties properties=new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("userName"));
    }
}
