package Class23Interface;

public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}
  class ChromeDriver implements WebDriver{

      @Override
      public void openBrowser() {
          System.out.println("Open it");
      }

      @Override
      public void closeBrowser() {
          System.out.println("Close it");
      }

      @Override
      public void maximizeWindow() {
          System.out.println("Maximize it");
      }

      @Override
      public void findElement() {
          System.out.println("Find element");
      }
  }
  class fireFoxDriver implements WebDriver{

      @Override
      public void openBrowser() {
          System.out.println("Open fireFox browser");
      }

      @Override
      public void closeBrowser() {
          System.out.println("Close fire Fox browser");
      }

      @Override
      public void maximizeWindow() {
          System.out.println("Maximize fire fox window");
      }

      @Override
      public void findElement() {
          System.out.println("find element in fire Fox browser");
      }
  }
