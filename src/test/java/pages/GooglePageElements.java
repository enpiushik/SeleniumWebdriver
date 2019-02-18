package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GooglePageElements {

    @FindBy(how = How.CSS, using = "[class='gb_P'][data-pid='23']")
    private WebElement gmailLink;

    @FindBy(how = How.CSS, using = "[class='gb_P'][data-pid='2']")
    private WebElement picturesLink;

    @FindBy(how = How.CSS, using = ".gb_b.gb_xc")
    private WebElement menuButton;

    @FindBy(how = How.CSS, using = ".gb_Ve.gb_Ba.gb_Tb")
    private WebElement loginButton;

    @FindBy(how = How.ID, using = "hplogo")
    private WebElement logo;

    @FindBy(how = How.CSS, using = ".a4bIc:nth-child(1)")
    private WebElement searchBox;

    @FindBy(how = How.CSS, using = "[class='JC0tCe']")
    private WebElement microphone;

    @FindBy(how = How.CSS, using = ".FPdoLc.VlcLAe input:nth-child(1)")
    private WebElement searchButton;

    @FindBy(how = How.CSS, using = ".FPdoLc.VlcLAe input:nth-child(2)")
    private WebElement luckButton;

    @FindBy(how = How.CSS, using = "[class='ctr-p'] [id='SIvCob']")
    private WebElement language;

    public void checkGmailLink() {
        assertTrue(gmailLink.isDisplayed());
        assertEquals("Gmail", gmailLink.getText());
        assertEquals("https://mail.google.com/mail/?tab=wm", gmailLink.getAttribute("href"));
    }

    public void checkPicturesLink() {
        assertTrue(picturesLink.isDisplayed());
        assertEquals("Images", picturesLink.getText());
        assertEquals("https://www.google.lv/imghp?hl=en&tab=wi", picturesLink.getAttribute("href"));
    }

    public void checkMenuButton() {
        assertTrue(menuButton.isDisplayed());
    }

    public void checkLoginButton() {
        assertTrue(loginButton.isDisplayed());
        assertEquals("Sign in", loginButton.getText());
        assertEquals("https://accounts.google.com/ServiceLogin?hl=en&passive=true&continue=https://www.google.lv/", loginButton.getAttribute("href"));
    }

    public void checkLogo() {
        assertTrue(logo.isDisplayed());
    }

    public void checkSearchBox() {
        assertTrue(searchBox.isDisplayed());
    }

    public void checkMicrophone() {
        assertTrue(microphone.isDisplayed());
    }

    public void checkSearchButton() {
        assertTrue(searchButton.isDisplayed());
        assertEquals("Google Search", searchButton.getAttribute("value"));
    }

    public void checkLuckButton() {
        assertTrue(luckButton.isDisplayed());
        assertEquals("I'm Feeling Lucky", luckButton.getAttribute("value"));
    }

    public void checkLanguage() {
        assertTrue(language.isDisplayed());
    }
}
