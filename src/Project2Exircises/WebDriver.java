package Project2Exircises;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface RemoteWebDriver extends WebDriver{
    void navigate();

}
interface TakesScreenShot extends RemoteWebDriver{
    void screenShot();
}
class ChromeDriver implements RemoteWebDriver,TakesScreenShot{

    @Override
    public void open() {
        System.out.println("Open Chrome ");
    }

    @Override
    public void close() {
        System.out.println("Close Chrome");
    }

    @Override
    public String getTitle() {
        return "Chrome Title";
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to Chrome");
    }
    @Override
    public void screenShot() {
        System.out.println("Take Screen shots for Chrome ");
    }
}
class FireFoxDriver implements RemoteWebDriver,TakesScreenShot{

    @Override
    public void open() {
        System.out.println("Open FireFox");
    }

    @Override
    public void close() {
        System.out.println("Close FireFox");
    }

    @Override
    public String getTitle() {
        return "FireFox Title";
    }

    @Override
    public void navigate() {
        System.out.println(" Navigate to FireFox Url");
    }

    @Override
    public void screenShot() {
        System.out.println("FireFox Screen shots");
    }
}
class SafariDriver implements RemoteWebDriver,TakesScreenShot{

    @Override
    public void open() {
        System.out.println("Open Safari Browser");
    }

    @Override
    public void close() {
        System.out.println("Close Safari Browser");
    }

    @Override
    public String getTitle() {
        return "Safari Title";
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to Safari");
    }

    @Override
    public void screenShot() {
        System.out.println("Safari Screen shots");
    }
}