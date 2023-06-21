package Review13;


import Utils.Constants2;
import Utils.fileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Map;

public class EmployeeTester {
    public static void main(String[] args) {


        List<Map<String, String>>empData= fileReader.readGetData(Constants2.EXCEL_FILE_PATH,"Sheet2");
        // we need to navigate to the website in witch we will add those data
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement userName=driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");
        WebElement pass=driver.findElement(By.id("txtPassword"));
        pass .sendKeys("Hum@nhrm123");
        WebElement logIn= driver.findElement(By.id("btnLogin"));
        logIn .click();
     //   WebElement pim=driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
      //  pim.click();
      //  WebElement addEmp=driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']"));
      //  addEmp.click();

        //loop to get through all these value to get all the maps  one by one
        for(Map<String,String>map:empData){
            WebElement pim=driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
            pim.click();
            WebElement addEmp=driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']"));
            addEmp.click();
          //  pim.click();
         driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(map.get("FirstName"));
         driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys(map.get("MiddleName"));
         driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(map.get("LastName"));
        }
    }
}