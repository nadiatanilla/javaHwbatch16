package class22Abstract;

public abstract class WebDriver {
   abstract void openBrowser();
   abstract void loadURL(String url);
   abstract void performTesting();
   abstract void closeBrowser();

}
class ChromeDriver extends WebDriver{
    @Override
    void openBrowser(){
        System.out.println("jhhjjjhh");
    }
    @Override
    void loadURL(String url){
        System.out.println("hhhhjjhh");
    }
    @Override
    void closeBrowser(){
        System.out.println("hjkkkk");
    }

    @Override
    void performTesting() {
        System.out.println("ddfggg");
    }
}