//package runners;
//
//import org.junit.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//public class FirefoxWebDriver {
//    public static String geckoDriverPath = "C:\\Users\\natalja.prudnikova\\IdeaProjects\\SeleniumWebdriver\\lib\\geckodriver.exe";
//    public static WebDriver driver;
//
//    @Test
//    public void openFirefoxWebDriver() throws InterruptedException {
//        System.setProperty("webdriver.gecko.driver", geckoDriverPath);
//        driver = new FirefoxDriver();
//        driver.get("https://www.google.lv");
//
//        Thread.sleep(2000);
//        driver.quit();
//    }
//}
