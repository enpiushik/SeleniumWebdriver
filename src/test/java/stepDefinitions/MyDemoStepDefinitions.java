package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoPageElementsChrome;
import pages.DemoPageElementsFirefox;

import static org.junit.Assert.*;

public class MyDemoStepDefinitions {
    private WebDriver driverChrome = Hooks.driverChrome;
    private WebDriver driverFirefox = Hooks.driverFirefox;
    private WebDriver driverInternetExplorer = Hooks.driverInternetExplorer;

    static DemoPageElementsChrome demoPageElementsChrome;
    static DemoPageElementsFirefox demoPageElementsFirefox;

    public MyDemoStepDefinitions() {
        demoPageElementsChrome = PageFactory.initElements(Hooks.driverChrome, DemoPageElementsChrome.class);
//        demoPageElementsFirefox = PageFactory.initElements(Hooks.driverFirefox, DemoPageElementsFirefox.class);
    }

    String url = "https://phptravels.com/";
    String firstModal = "onesignal-popover-cancel-button";
    String secondModal = ".mc-closeModal";
    String livechat = "chat-widget-container";

    @Given("^I am on demo home page Chrome$")
    public void iAmOnDemoHomePageChrome() {
        driverChrome.get(url);
        assertEquals(url, driverChrome.getCurrentUrl());

        WebDriverWait wait = new WebDriverWait(driverChrome, 80);
        //close first and second modals
        wait.until(ExpectedConditions.elementToBeClickable(By.id(firstModal)));
        driverChrome.findElement(By.id(firstModal)).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(secondModal)));
        driverChrome.findElement(By.cssSelector(secondModal)).click();

        //livechat visibility
//        wait.until(ExpectedConditions.elementToBeClickable(By.id(livechat)));
//        assertTrue(driverChrome.findElement(By.id(livechat)).isEnabled());
    }

    @When("^I am checking elements in topBar Chrome$")
    public void iAmCheckingElementsInTopBarChrome() {
        demoPageElementsChrome.checkTopBarElementsAvailabilityOnDemoPage();
//        demoPageElementsChrome.checkSocialMediaLinksElementsAvailabilityInTopBarOnDemoPage();
    }

    @Then("^I am checking elements in header on demo web page Chrome$")
    public void iAmCheckingElementsInHeaderOnDemoWebPageChrome() {
//        demoPageElementsChrome.checkElementsAvailabilityInHeaderOnDemoPage();
//        demoPageElementsChrome.checkFeaturesElementsOnDemoPage();
//        demoPageElementsChrome.checkProductElementsOnDemoPage();
//        demoPageElementsChrome.checkHostingElementsOnDemoPage();
//        demoPageElementsChrome.checkServicesElementsOnDemoPage();
//        demoPageElementsChrome.checkCompanyElementsOnDemoPage();
    }

    @And("^I am checking elements in banner on demo web page Chrome$")
    public void iAmCheckingElementsInBannerOnDemoWebPageChrome() {
//        demoPageElementsChrome.checkBannerElementsOnDemoPage();
    }

    @Then("^I am checking first section elements on demo web page Chrome$")
    public void iAmCheckingFirstSectionElementsOnDemoWebPageChrome() throws InterruptedException {
//        demoPageElementsChrome.checkFirstSectionElementsOnDemoPage();
//        demoPageElementsChrome.checkFeaturesSectionElementsOnDemoPage();
    }

    @Given("^I am on demo home page Firefox$")
    public void iAmOnDemoHomePageFirefox() {
        driverFirefox.get(url);
        assertEquals(url, driverFirefox.getCurrentUrl());

        WebDriverWait wait = new WebDriverWait(driverFirefox, 90);
        //close first and second modals
        wait.until(ExpectedConditions.elementToBeClickable(By.id(firstModal)));
        driverFirefox.findElement(By.id(firstModal)).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(secondModal)));
        driverFirefox.findElement(By.cssSelector(secondModal)).click();

        //livechat visibility
//        wait.until(ExpectedConditions.elementToBeClickable(By.id(livechat)));
//        assertTrue(driverFirefox.findElement(By.id(livechat)).isEnabled());
    }

    @When("^I am checking elements on demo web page Firefox$")
    public void iAmCheckingElementsOnDemoWebPageFirefox() {
        demoPageElementsFirefox.checkTopBarElementsAvailabilityOnDemoPage();
        demoPageElementsFirefox.checkSocialMediaLinksElementsAvailabilityInTopBarOnDemoPage();
        demoPageElementsFirefox.checkElementsAvailabilityInHeaderOnDemoPage();
        demoPageElementsFirefox.checkFeaturesElementsOnDemoPage();
        demoPageElementsFirefox.checkProductElementsOnDemoPage();
        demoPageElementsFirefox.checkHostingElementsOnDemoPage();
        demoPageElementsFirefox.checkServicesElementsOnDemoPage();
        demoPageElementsFirefox.checkCompanyElementsOnDemoPage();
        demoPageElementsFirefox.checkBannerElementsOnDemoPage();
    }

    @Given("^I am on demo home page IE$")
    public void iAmOnDemoHomePageIE() {
        driverInternetExplorer.get(url);
        assertEquals(url, driverInternetExplorer.getCurrentUrl());

        //livechat visibility
        WebDriverWait wait = new WebDriverWait(driverInternetExplorer, 60);
        wait.until(ExpectedConditions.elementToBeClickable(By.id(livechat)));
        assertTrue(driverInternetExplorer.findElement(By.id(livechat)).isEnabled());
    }
}
