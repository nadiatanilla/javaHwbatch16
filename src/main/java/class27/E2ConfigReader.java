package class27;

import Utils.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class E2ConfigReader {
    public static void main(String[] args) throws IOException {



        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%22%22");
                driver.manage().window().maximize();
    WebElement username = driver.findElement(By.cssSelector("#txtUsername"));
    String userName=getProperty("userName");
        username.sendKeys(userName);
    WebElement password = driver.findElement(By.cssSelector("#txtPassword"));
    String passWord=getProperty("passWord");
        password.sendKeys(passWord);

    WebElement login = driver.findElement(By.cssSelector(".button"));
        login.click();
}
public static String getProperty(String key) throws IOException {
    FileInputStream fis=new FileInputStream(Constants.ConfigReaderPath);
    Properties properties=new Properties();
    properties.load(fis);
    return properties.getProperty(key);
}
}