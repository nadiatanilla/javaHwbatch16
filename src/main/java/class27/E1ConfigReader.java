package class27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class E1ConfigReader {
    public static void main(String[] args) throws IOException {
        // know the location
        // eighter navigate to that file or bring that file into the memory
       // String path="C:\\Users\\usa20\\IdeaProjects\\SDET16\\Files\\Config.properties";//hard coding info because this code be different for everyone
        // so it should be generic one we got this one by click on config properties and absolute path
       // System.out.println(System.getProperty("user.dir"));// this code to get the property// it is the generic way//gives the path of your project
        String path1=System.getProperty("user.dir")+"\\Files\\Config.properties";// get the path of our files
       // System.out.println(path1);// path is for the file we want to read now is config prp
        // because we have data in other files input stream go bring those bites to java
        //file input brings data from the files in the form of bytes // read images and doc
        FileInputStream fileInputStream=new FileInputStream(path1);// created the object store the data in the FileInputStream
        //properties is the software to get data in form of key value for data that that inputstream brings
        Properties prop=new Properties();
        prop.load(fileInputStream);
        // we use the mapp because in config we have data in the form of key and value
        System.out.println(prop.getProperty("userName"));
       // System.out.println(prop.containsKey("userName")); all methods from map can be used



    }
}
