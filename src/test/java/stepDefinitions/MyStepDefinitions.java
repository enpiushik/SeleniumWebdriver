package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.GooglePageElements;

import java.io.IOException;

import static org.junit.Assert.*;

public class MyStepDefinitions {
    private WebDriver driverChrome = Hooks.driverChrome;
    private WebDriver driverFirefox = Hooks.driverFirefox;
    private WebDriver driverInternetExplorer = Hooks.driverInternetExplorer;

    static GooglePageElements googlePageElementsChrome;
    static GooglePageElements googlePageElementsFireFox;
    static GooglePageElements googlePageElementsInternetExplorer;

    public MyStepDefinitions() {
        googlePageElementsChrome = PageFactory.initElements(Hooks.driverChrome, GooglePageElements.class);
        googlePageElementsFireFox = PageFactory.initElements(Hooks.driverFirefox, GooglePageElements.class);
        googlePageElementsInternetExplorer = PageFactory.initElements(Hooks.driverInternetExplorer, GooglePageElements.class);
    }

    @Given("^I am on google home page$")
    public void iAmOnGoogleHomePage() throws IOException {
        String url = "https://www.google.lv/";

        driverChrome.get(url);
        assertEquals(url, driverChrome.getCurrentUrl());

        driverFirefox.get(url);
        assertEquals(url, driverFirefox.getCurrentUrl());

        driverInternetExplorer.get(url);
        assertEquals(url, driverInternetExplorer.getCurrentUrl());
    }

    @When("^I am checking elements availability on google web page Chrome$")
    public void iAmCheckingElementsAvailabilityOnGoogleWebPageChrome() throws IOException {
        driverChrome.findElement(By.cssSelector("#SIvCob :nth-child(3)")).click();
        googlePageElementsChrome.checkGmailLink();
        googlePageElementsChrome.checkPicturesLink();
        googlePageElementsChrome.checkMenuButton();
        googlePageElementsChrome.checkLoginButton();
        googlePageElementsChrome.checkLogo();
        googlePageElementsChrome.checkSearchBox();
        googlePageElementsChrome.checkMicrophone();
        googlePageElementsChrome.checkSearchButton();
        googlePageElementsChrome.checkLuckButton();
        googlePageElementsChrome.checkLanguage();
    }

    @Then("^I am checking elements availability on google web page Firefox$")
    public void iAmCheckingElementsAvailabilityOnGoogleWebPageFirefox() throws IOException {
        driverFirefox.findElement(By.cssSelector("#SIvCob :nth-child(3)")).click();
        googlePageElementsFireFox.checkGmailLink();
        googlePageElementsFireFox.checkPicturesLink();
        googlePageElementsFireFox.checkMenuButton();
        googlePageElementsFireFox.checkLoginButton();
        googlePageElementsFireFox.checkLogo();
        googlePageElementsFireFox.checkSearchBox();
        googlePageElementsFireFox.checkSearchButton();
        googlePageElementsFireFox.checkLuckButton();
        googlePageElementsFireFox.checkLanguage();
    }

    @And("^I am checking elements availability on google web page Internet Explorer$")
    public void iAmCheckingElementsAvailabilityOnGoogleWebPageInternetExplorer() throws IOException {
        googlePageElementsInternetExplorer.checkGmailLink();
        googlePageElementsInternetExplorer.checkPicturesLink();
        googlePageElementsInternetExplorer.checkMenuButton();
        googlePageElementsInternetExplorer.checkLoginButton();
        googlePageElementsInternetExplorer.checkLogo();
        googlePageElementsInternetExplorer.checkSearchBox();
        googlePageElementsInternetExplorer.checkSearchButton();
        googlePageElementsInternetExplorer.checkLuckButton();
        googlePageElementsInternetExplorer.checkLanguage();
    }
}
