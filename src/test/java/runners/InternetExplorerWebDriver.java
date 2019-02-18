//package runners;
//
//import org.junit.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//
//public class InternetExplorerWebDriver {
//    public static String IEDriverServerPath = "C:\\Users\\natalja.prudnikova\\IdeaProjects\\SeleniumWebdriver\\lib\\IEDriverServer.exe";
//    public static WebDriver driver;
//
//    @Test
//    public void openInternetExplorerWebDriver() throws InterruptedException {
//        System.setProperty("webdriver.ie.driver", IEDriverServerPath);
//        driver = new InternetExplorerDriver();
//        driver.get("https://www.google.lv");
//
//        Thread.sleep(2000);
//        driver.quit();
//    }
//}
