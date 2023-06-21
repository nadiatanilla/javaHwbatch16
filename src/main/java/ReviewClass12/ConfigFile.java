package ReviewClass12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFile {
    public static void main(String[] args) {
        String path = "Files/Config.properties";
        FileInputStream fis=null;// because null we can not put var
        try {
             fis =  new FileInputStream(path);// not handling exception could cause error /checked/manddatory
            Properties properties=new Properties();
            properties.load(fis);
            System.out.println(properties.getProperty("url"));
        }catch(IOException f){
            f.printStackTrace();
        }finally{
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
}}