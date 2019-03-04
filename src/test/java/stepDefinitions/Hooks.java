package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Hooks {
    //chrome driver
    static String chromeDriverPath = "C:\\Users\\natalja.prudnikova\\IdeaProjects\\SeleniumWebdriver\\lib\\chromedriver.exe";
    //firefox mozilla driver
    static String geckoDriverPath = "C:\\Users\\natalja.prudnikova\\IdeaProjects\\SeleniumWebdriver\\lib\\geckodriver.exe";
    //internet explorer driver
    static String IEDriverServerPath = "C:\\Users\\natalja.prudnikova\\IdeaProjects\\SeleniumWebdriver\\lib\\IEDriverServer.exe";

    public static WebDriver driverChrome;
    public static WebDriver driverFirefox;
    public static WebDriver driverInternetExplorer;

    @Before
    public void openChromeWebDriver() {
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driverChrome = new ChromeDriver();
        driverChrome.manage().window().maximize();
        driverChrome.manage().deleteAllCookies();
    }

    @After
    public void closeWebDriverChrome() {
        driverChrome.quit();
    }

//    @Before
//    public void openFirefoxWebDriver() {
//        System.setProperty("webdriver.gecko.driver", geckoDriverPath);
//        driverFirefox = new FirefoxDriver();
//        driverFirefox.manage().window().maximize();
//        driverFirefox.manage().deleteAllCookies();
//    }
//
//    @After
//    public void closeWebDriverFirefox() {
//        driverFirefox.quit();
//    }
//
//    @Before
//    public void openInternetExplorerWebDriver() {
//        System.setProperty("webdriver.ie.driver", IEDriverServerPath);
//        driverInternetExplorer = new InternetExplorerDriver();
//        driverInternetExplorer.manage().window().maximize();
//        driverInternetExplorer.manage().deleteAllCookies();
//    }
//
//    @After
//    public void closeWebDriverIE() {
//        driverInternetExplorer.quit();
//    }
}
