package Project2Exircises;

public class WebDriverTest {
    public static void main(String[] args) {
        ChromeDriver chrome=new ChromeDriver();
         chrome.open();
         chrome.close();
         chrome.getTitle();
         chrome.navigate();
         chrome.screenShot();
        System.out.println("*********************** FireFox*********************");
        FireFoxDriver fox=new FireFoxDriver();
        fox.open();
        fox.close();
        fox.getTitle();
        fox.navigate();
        fox.screenShot();

        System.out.println("**********************Safari**************************");
        SafariDriver safari=new SafariDriver();
        safari.open();
        safari.close();
        safari.getTitle();
        safari.navigate();
        safari.screenShot();
    }
}