package ReviewClass12;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static String read(String key){
        String path = "Files/Config.properties";
        FileInputStream fis=null;// because null we can not put var
        String value=null;
        try {
            fis =  new FileInputStream(Constants.CONFIG_FILE_PATH);// not handling exception could cause error /checked/manddatory
            Properties properties=new Properties();
            properties.load(fis);
        value=    properties.getProperty(key);
        }catch(IOException f){
            f.printStackTrace();
        }finally{
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return value;
    }
}
