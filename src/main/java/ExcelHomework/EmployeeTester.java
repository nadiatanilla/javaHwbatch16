package ExcelHomework;

import Utils.Constants3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class EmployeeTester  {
    public static void main(String[] args) {
        List<Map<String, String>> mapData = ExcelReader.readGetData(Constants3.EXCEL_FILE_PATH, "Sheet1");

        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");
        WebElement pass = driver.findElement(By.id("txtPassword"));
        pass.sendKeys("Hum@nhrm123");
        WebElement logIn = driver.findElement(By.id("btnLogin"));
        logIn.click();

        for (Map<String, String> map : mapData) {
            WebElement pim = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
            pim.click();
            WebElement addEmp = driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']"));
            addEmp.click();
            driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(map.get("First Name"));
            driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys(map.get("Middle Name"));
            driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(map.get("Last Name"));
         //   driver.findElement(By.name("employeeId")).clear();
            driver.findElement(By.id("btnSave")).click();
           driver.findElement(By.xpath("//input[@id='btnSave']")).click();
           driver.findElement(By.xpath("//input[@id='personal_txtEmployeeId']")).sendKeys(map.get("Employee Id"));

          driver.findElement(By.xpath("//input[@id='personal_txtOtherID']")).sendKeys(map.get("Other Id"));
          driver.findElement(By.xpath("//input[@id='personal_txtLicenNo']")).sendKeys(map.get("Driver License No."));

            WebElement calender = driver.findElement(By.xpath("//input[@id='personal_txtLicExpDate']"));
            calender.click();
            WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
            Select Year = new Select(year);
            Year.selectByVisibleText("2023");
            WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
            Select Month = new Select(month);
            Month.selectByVisibleText("Feb");
            List<WebElement> date = driver.findElements(By.xpath("//table/tbody/tr/td"));
            for (WebElement dates : date) {
                String currentedate = dates.getText();
                if (currentedate.equals("6")) {
                    dates.click();
                    break;
                }
            }

            WebElement ss= driver.findElement(By.xpath("//input[@id='personal_txtNICNo']"));
            ss.sendKeys(map.get("SSN no"));
            driver.findElement(By.id("personal_txtSINNo")).sendKeys(map.get("SIN No"));

            if(map.get("Gender").equals("Male")){
                WebElement male=driver.findElement(By.xpath("(//input[@name='personal[optGender]'])[1]"));
                male.click();

            }else{
                WebElement female=driver.findElement(By.xpath("(//input[@name='personal[optGender]'])[2]"));
                female.click();
            }
            WebElement martial=driver.findElement(By.xpath("//select[@name='personal[cmbMarital]']"));
            Select sel=new Select(martial);
            sel.selectByVisibleText(map.get("Martial St"));

            WebElement nationality=driver.findElement(By.xpath("//select[@name='personal[cmbNation]']"));
            Select s=new Select(nationality);
            s.selectByVisibleText(map.get("Nationality"));

            WebElement bd=driver.findElement(By.xpath("//input[@id='personal_DOB']"));
            bd.click();

            WebElement BY=driver.findElement(By.xpath(" //select[@class='ui-datepicker-year']"));
            Select Y=new Select(BY);
            Y.selectByVisibleText("2000");

            WebElement Bd=driver.findElement(By.xpath(" //select[@class='ui-datepicker-month']"));
            Select mon=new Select(Bd);
            mon.selectByVisibleText("May");

            List<WebElement>  birth=driver.findElements(By.xpath("//table/tbody/tr/td"));
            for(WebElement dates:birth){
                String birthdate=dates.getText();
                if(birthdate.equals("15")){
                    dates.click();
                    break;
                }
            }
            WebElement nick=driver.findElement(By.name("personal[txtEmpNickName]"));
            nick.sendKeys(map.get("Nick name"));

            if(map.get("Smoker").equals("Yes")){
                driver.findElement(By.name("personal[chkSmokeFlag]")).click();
            }
            WebElement military=driver.findElement(By.name("personal[txtMilitarySer]"));
            military.sendKeys(map.get("Military service"));

            WebElement save=driver.findElement(By.xpath("//input[@id='btnSave']"));
            save.click();



        }
        driver.quit();
    }
}