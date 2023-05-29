package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties getProperties(String path) throws IOException {
        FileInputStream fileInputStream=new FileInputStream(path);
        Properties properties=new Properties();// properties refers to all properties name and password
        properties.load(fileInputStream);
        return properties;
    }
    public static String getProperty(String key) throws IOException {

        Properties properties=getProperties(Constants.ConfigReaderPath);
        String value=properties.getProperty(key);
        return value;
    }
}
