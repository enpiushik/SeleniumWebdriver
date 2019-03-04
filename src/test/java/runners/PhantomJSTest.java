package runners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import static org.junit.Assert.assertEquals;

public class PhantomJSTest {

    public static void main(String[] args) {
        String phantomDriverPath = "C:\\Users\\natalja.prudnikova\\IdeaProjects\\SeleniumWebdriver\\lib\\phantomjs.exe";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, phantomDriverPath);
        WebDriver driverPhantomJS = new PhantomJSDriver(capabilities);

        String url = "https://www.google.lv/";
        driverPhantomJS.get(url);
        assertEquals(url, driverPhantomJS.getCurrentUrl());
        driverPhantomJS.manage().window().maximize();

        System.out.println("This is web page tittle: " + driverPhantomJS.getTitle());
        assertEquals("Google", driverPhantomJS.getTitle());

        System.out.println("This is web page source: " + driverPhantomJS.getPageSource());

        driverPhantomJS.quit();
    }
}
