package ReviewClass12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigWrite {
    public static void main(String[] args) throws IOException {


        String path="Files/Test.properties";

        Properties properties=new Properties();

        properties.setProperty("Name","Vlad");
        FileOutputStream fos=new FileOutputStream(path);
        properties.store(fos,"adding a name");

    }

}
