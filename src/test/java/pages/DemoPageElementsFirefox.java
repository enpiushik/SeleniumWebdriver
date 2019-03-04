package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDefinitions.Hooks;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class DemoPageElementsFirefox {

    @FindBy(how = How.CSS, using = ".top-bar.hidden-sm.hidden-xs")
    private WebElement topBar;
    @FindBy(how = How.CSS, using = "[src='https://phptravels.com/assets/img/logo.png']")
    private WebElement logoImage;
    @FindBy(how = How.CSS, using = "[class='carousel-controls'] > span")
    private WebElement news;
    @FindBy(how = How.CSS, using = "[data-slide='prev']")
    private WebElement dataSlidePrev;
    @FindBy(how = How.CSS, using = "[data-slide='next']")
    private WebElement dataSlideNext;

    //FORUMS
    @FindBy(how = How.CSS, using = "[href$='info/']")
    private WebElement forums;
    @FindBy(how = How.CSS, using = "[src='styles/default/xenforo/logo.png']")
    private WebElement forumsLogo;
    @FindBy(how = How.CSS, using = ".navTabs")
    private WebElement navigationTabs;
    @FindBy(how = How.CSS, using = "[class='navTab home PopupClosed']>a")
    private WebElement navHome;
    @FindBy(how = How.CSS, using = "[class='navTab forums selected']>a")
    private WebElement navForums;
    @FindBy(how = How.CSS, using = "[href$='info/members/'][class='navLink']")
    private WebElement navMembers;
    @FindBy(how = How.CSS, using = "[class='tabLinks forumsTabLinks']")
    private WebElement tabLinks;
    @FindBy(how = How.CSS, using = "[href='search/?type=post']")
    private WebElement searchForums;
    @FindBy(how = How.CSS, using = "[href='find-new/posts'][rel='nofollow']")
    private WebElement recentPosts;
    @FindBy(how = How.CSS, using = "[type='search']")
    private WebElement search;
    @FindBy(how = How.CSS, using = "[class='forum_list']>div>div")
    private WebElement pageContent;
    @FindBy(how = How.CSS, using = ".mainContainer")
    private WebElement mainContainer;
    @FindBy(how = How.CSS, using = ".breadBoxTop")
    private WebElement breadBoxTop;
    @FindBy(how = How.CSS, using = "[class='titleBar']>h1")
    private WebElement titleBar;
    @FindBy(how = How.CSS, using = "[class='node category level_1 node_6']")
    private WebElement sectionMain;
    @FindBy(how = How.CSS, using = "[href='.#public-forums.6']")
    private WebElement publicForums;
    @FindBy(how = How.CSS, using = "[class='nodeList']")
    private WebElement nodeList;
    @FindBy(how = How.CSS, using = "[class='sidebar']")
    private WebElement sidebar;
    @FindBy(how = How.CSS, using = "[class='inner']")
    private WebElement sectionLoginButton;
    @FindBy(how = How.CSS, using = "[class='section membersOnline userList']")
    private WebElement sectionMembersOnline;
    @FindBy(how = How.CSS, using = "[class='section threadList']")
    private WebElement newPosts;
    @FindBy(how = How.CSS, using = "[class='section profilePostList']")
    private WebElement newProfilePosts;
    @FindBy(how = How.CSS, using = "[class='section']")
    private WebElement forumStatistic;
    @FindBy(how = How.CSS, using = "[class='section infoBlock sharePage']")
    private WebElement shareThisPage;

    @FindBy(how = How.CSS, using = "[href$='medium.com/phptravels']")
    private WebElement blog;
    @FindBy(how = How.CSS, using = "[href$='phptravels.org'][class='link-ca']")
    private WebElement clientArea;

    @FindBy(how = How.CSS, using = "[class='fa fa-facebook']")
    private WebElement facebook;
    @FindBy(how = How.CSS, using = "[class='fa fa-google-plus']")
    private WebElement gmail;
    @FindBy(how = How.CSS, using = "[class='fa fa-twitter']")
    private WebElement twitter;
    @FindBy(how = How.CSS, using = "[class='fa fa-linkedin']")
    private WebElement linkdin;
    @FindBy(how = How.CSS, using = "[class='fa fa-instagram']")
    private WebElement instagram;
    @FindBy(how = How.CSS, using = "[class='fa fa-rss']")
    private WebElement sitemap;

    @FindBy(how = How.XPATH, using = "/html/body/header/div[2]")
    private WebElement header;
    @FindBy(how = How.CSS, using = "[class='text-primary']")
    private WebElement demo;
    @FindBy(how = How.CSS, using = "[class='text-success']")
    private WebElement pricing;
    @FindBy(how = How.CSS, using = "li:nth-child(3) > span > span")
    private WebElement features;
    @FindBy(how = How.CSS, using = "li:nth-child(4) > span > span")
    private WebElement product;
    @FindBy(how = How.CSS, using = "li:nth-child(5) > span > span")
    private WebElement hosting;
    @FindBy(how = How.CSS, using = "li:nth-child(6) > span > span")
    private WebElement services;
    @FindBy(how = How.CSS, using = "li:nth-child(7) > span > span")
    private WebElement company;
    @FindBy(how = How.CSS, using = ".login > span")
    private WebElement login;

    @FindBy(how = How.CSS, using = ".flying-boxes")
    private WebElement banner;
    @FindBy(how = How.CSS, using = "[class='hero-slogan']")
    private WebElement checkout;
    @FindBy(how = How.CSS, using = "[class='btn btn-hero btn-light-blue'] [class='hero-slogan']")
    private WebElement explore;

    @FindBy(how = How.CSS, using = ".flickity-slider")
    private WebElement smallBanner;
    @FindBy(how = How.CSS, using = "[alt='hotels']")
    private WebElement hotels;
    @FindBy(how = How.CSS, using = "[alt='flights']")
    private WebElement flights;
    @FindBy(how = How.CSS, using = "[alt='tours']")
    private WebElement tours;
    @FindBy(how = How.CSS, using = "[alt='cars']")
    private WebElement cars;
    @FindBy(how = How.CSS, using = "[alt='visa']")
    private WebElement visa;
    @FindBy(how = How.CSS, using = "[alt='offers']")
    private WebElement offers;
    @FindBy(how = How.CSS, using = "[alt='blog']")
    private WebElement blogBanner;
    @FindBy(how = How.CSS, using = "[alt='CMS']")
    private WebElement CMS;
    @FindBy(how = How.CSS, using = "[alt='newsletter']")
    private WebElement newsletter;
    @FindBy(how = How.CSS, using = "[alt='multie language']")
    private WebElement multieLanguage;
    @FindBy(how = How.CSS, using = "[alt='multi currencies']")
    private WebElement multiCurrencies;
    @FindBy(how = How.CSS, using = "[alt='Mobile Applications']")
    private WebElement mobileApplications;
    @FindBy(how = How.CSS, using = "[alt='Free Support']")
    private WebElement freeSupport;
    @FindBy(how = How.CSS, using = "[alt='Lifetime Updates']")
    private WebElement lifetimeUpdates;

    String homePageURL = "https://phptravels.com/";

    private WebDriver driverFirefox = Hooks.driverFirefox;

    Actions actionFirefox = new Actions(driverFirefox);
    WebDriverWait wait = new WebDriverWait(driverFirefox, 15);

    public void checkTopBarElementsAvailabilityOnDemoPage() {
        assertTrue(topBar.isDisplayed());
        assertTrue(logoImage.isDisplayed());

        assertTrue(news.isDisplayed());
        assertEquals("NEWS", news.getText());

        assertTrue(dataSlidePrev.isEnabled());
        assertTrue(dataSlideNext.isEnabled());

        assertTrue(forums.isEnabled());
        assertEquals("FORUMS", forums.getText());
        forums.click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> tabsOne = new ArrayList<String>(driverFirefox.getWindowHandles());
        driverFirefox.switchTo().window(tabsOne.get(1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[src='styles/default/xenforo/logo.png']")));
        assertEquals("https://www.phptravels.info/", driverFirefox.getCurrentUrl());
        assertTrue((forumsLogo).isDisplayed());

        assertTrue(navigationTabs.isDisplayed());
        assertTrue(navHome.isEnabled());
        assertEquals("Home", navHome.getText());
        assertTrue(navForums.isEnabled());
        assertEquals("Forums", navForums.getText());
        assertTrue(navMembers.isEnabled());
        assertEquals("Members", navMembers.getText());
        assertTrue(tabLinks.isDisplayed());
        assertTrue(searchForums.isEnabled());
        assertEquals("Search Forums", searchForums.getText());
        assertTrue(recentPosts.isEnabled());
        assertEquals("Recent Posts", recentPosts.getText());
        assertTrue(search.isEnabled());
        assertTrue(pageContent.isDisplayed());
        assertTrue(mainContainer.isDisplayed());
        assertTrue(breadBoxTop.isDisplayed());
        assertTrue(titleBar.isDisplayed());
        assertEquals("PHPTRAVELS Forums", titleBar.getText());
        assertTrue(sectionMain.isDisplayed());
        assertTrue(publicForums.isEnabled());
        assertEquals("Public Forums", publicForums.getText());
        assertTrue(nodeList.isDisplayed());
        assertTrue(sidebar.isDisplayed());
        assertTrue(sectionLoginButton.isEnabled());
        assertEquals("Sign up now!", sectionLoginButton.getText());
        assertTrue(sectionMembersOnline.isDisplayed());
        assertTrue(newPosts.isDisplayed());
        assertTrue(newProfilePosts.isDisplayed());
        assertTrue(forumStatistic.isDisplayed());
        assertTrue(shareThisPage.isDisplayed());

        driverFirefox.get(homePageURL);
        assertTrue(blog.isEnabled());
        assertEquals("BLOG", blog.getText());
        blog.click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        ArrayList<String> tabsTwo = new ArrayList<String>(driverFirefox.getWindowHandles());
        driverFirefox.switchTo().window(tabsTwo.get(2));
        wait.until(ExpectedConditions.urlToBe("https://medium.com/phptravels"));
        assertEquals("https://medium.com/phptravels", driverFirefox.getCurrentUrl());

        driverFirefox.get(homePageURL);
        assertTrue(clientArea.isEnabled());
        assertEquals("CLIENT AREA", clientArea.getText());
        clientArea.click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(4));
        ArrayList<String> tabsThree = new ArrayList<String>(driverFirefox.getWindowHandles());
        driverFirefox.switchTo().window(tabsThree.get(3));
        wait.until(ExpectedConditions.urlToBe("https://www.phptravels.org/clientarea.php"));
        assertEquals("https://www.phptravels.org/clientarea.php", driverFirefox.getCurrentUrl());
    }

    public void checkSocialMediaLinksElementsAvailabilityInTopBarOnDemoPage() {
        driverFirefox.get(homePageURL);
        assertTrue(facebook.isEnabled());
        facebook.click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(5));
        ArrayList<String> tabsFour = new ArrayList<String>(driverFirefox.getWindowHandles());
        driverFirefox.switchTo().window(tabsFour.get(4));
        wait.until(ExpectedConditions.urlToBe("https://www.facebook.com/travelbusiness"));
        assertEquals("https://www.facebook.com/travelbusiness", driverFirefox.getCurrentUrl());

        driverFirefox.get(homePageURL);
        assertTrue(gmail.isEnabled());
        gmail.click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(6));
        ArrayList<String> tabsFive = new ArrayList<String>(driverFirefox.getWindowHandles());
        driverFirefox.switchTo().window(tabsFive.get(5));
        wait.until(ExpectedConditions.urlToBe("https://plus.google.com/+phptravels"));
        assertEquals("https://plus.google.com/+phptravels", driverFirefox.getCurrentUrl());

        driverFirefox.get(homePageURL);
        assertTrue(twitter.isEnabled());
        twitter.click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(7));
        ArrayList<String> tabsSix = new ArrayList<String>(driverFirefox.getWindowHandles());
        driverFirefox.switchTo().window(tabsSix.get(6));
        wait.until(ExpectedConditions.urlToBe("https://twitter.com/phptravels"));
        assertEquals("https://twitter.com/phptravels", driverFirefox.getCurrentUrl());

        driverFirefox.get(homePageURL);
        assertTrue(linkdin.isEnabled());
        linkdin.click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(8));
        ArrayList<String> tabsSeven = new ArrayList<String>(driverFirefox.getWindowHandles());
        driverFirefox.switchTo().window(tabsSeven.get(7));
        wait.until(ExpectedConditions.urlToBe("https://www.linkedin.com/company/phptravels"));
        assertEquals("https://www.linkedin.com/company/phptravels", driverFirefox.getCurrentUrl());

        driverFirefox.get(homePageURL);
        assertTrue(instagram.isEnabled());
        instagram.click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(9));
        ArrayList<String> tabsEight = new ArrayList<String>(driverFirefox.getWindowHandles());
        driverFirefox.switchTo().window(tabsEight.get(8));
        wait.until(ExpectedConditions.urlToBe("https://www.instagram.com/phptravelsofficial/"));
        assertEquals("https://www.instagram.com/phptravelsofficial/", driverFirefox.getCurrentUrl());

//        driverFirefox.get(homePageURL);
//        assertTrue(sitemap.isEnabled());
//        sitemap.click();
//        wait.until(ExpectedConditions.numberOfWindowsToBe(10));
//        ArrayList<String> tabsNine = new ArrayList<String>(driverFirefox.getWindowHandles());
//        driverFirefox.switchTo().window(tabsNine.get(9));
//        wait.until(ExpectedConditions.urlToBe("https://phptravels.com/sitemap.xml"));
//        assertEquals("https://phptravels.com/sitemap.xml", driverFirefox.getCurrentUrl());
    }

    public void checkElementsAvailabilityInHeaderOnDemoPage() {
        driverFirefox.get(homePageURL);

        assertTrue(header.isDisplayed());

        assertTrue(demo.isEnabled());
        assertEquals("DEMO", demo.getText());
        demo.click();
        wait.until(ExpectedConditions.urlToBe("https://phptravels.com/demo/"));
        assertEquals("https://phptravels.com/demo/", driverFirefox.getCurrentUrl());

        assertTrue(pricing.isEnabled());
        assertEquals("PRICING", pricing.getText());
        pricing.click();
        wait.until(ExpectedConditions.urlToBe("https://phptravels.com/order/"));
        assertEquals("https://phptravels.com/order/", driverFirefox.getCurrentUrl());

        assertTrue(features.isDisplayed());
        assertEquals("FEATURES", features.getText());

        assertTrue(product.isDisplayed());
        assertEquals("PRODUCT", product.getText());

        assertTrue(hosting.isDisplayed());
        assertEquals("HOSTING", hosting.getText());

        assertTrue(services.isDisplayed());
        assertEquals("SERVICES", services.getText());

        assertTrue(company.isDisplayed());
        assertEquals("COMPANY", company.getText());

        assertTrue(login.isDisplayed());
        assertEquals("LOGIN", login.getText());
    }

    public void checkFeaturesElementsOnDemoPage() {
        //check all features elements
        WebElement getFeatures = driverFirefox.findElement(By.cssSelector("[class='has-drop']>[class='lvl-1']>span"));
        WebElement getFeaturesDropdownMenu = driverFirefox.findElement(By.cssSelector("div[class='menu-dropdown']"));

        actionFirefox.moveToElement(getFeatures).moveToElement(getFeaturesDropdownMenu).build().perform();
        assertTrue(getFeaturesDropdownMenu.isEnabled());

        WebElement getHotelsModuleFromFeaturesMenu = driverFirefox.findElement(By.cssSelector("a[href$='hotels-module-features/']"));
        actionFirefox.moveToElement(getFeatures).perform();
        actionFirefox.moveToElement(getHotelsModuleFromFeaturesMenu).build().perform();
        assertTrue(getHotelsModuleFromFeaturesMenu.isEnabled());
        assertEquals("Hotels Module", getHotelsModuleFromFeaturesMenu.getText());
        getHotelsModuleFromFeaturesMenu.click();
        assertEquals("https://phptravels.com/hotels-module-features/", driverFirefox.getCurrentUrl());

        WebElement getFlightsModuleFromFeaturesMenu = driverFirefox.findElement(By.cssSelector("a[href$='flights-module-features/']"));
        actionFirefox.moveToElement(driverFirefox.findElement(By.cssSelector("[class='has-drop']>[class='lvl-1']>span"))).perform();
        actionFirefox.moveToElement(getFlightsModuleFromFeaturesMenu).build().perform();
        assertTrue(getFlightsModuleFromFeaturesMenu.isEnabled());
        assertEquals("Flights Module", getFlightsModuleFromFeaturesMenu.getText());
        getFlightsModuleFromFeaturesMenu.click();
        assertEquals("https://phptravels.com/flights-module-features/", driverFirefox.getCurrentUrl());

        WebElement getToursFromFeatureMenu = driverFirefox.findElement(By.cssSelector("a[href$='tours-module-features/']"));
        actionFirefox.moveToElement(driverFirefox.findElement(By.cssSelector("[class='has-drop']>[class='lvl-1']>span")))
                .moveToElement(getToursFromFeatureMenu).build().perform();
        assertTrue(getToursFromFeatureMenu.isEnabled());
        assertEquals("Tours Module", getToursFromFeatureMenu.getText());
        getToursFromFeatureMenu.click();
        assertEquals("https://phptravels.com/tours-module-features/", driverFirefox.getCurrentUrl());

        WebElement getCarsModuleFromFeaturesMenu = driverFirefox.findElement(By.cssSelector("a[href$='cars-module-features/']"));
        actionFirefox.moveToElement(driverFirefox.findElement(By.cssSelector("[class='has-drop']>[class='lvl-1']>span")))
                .moveToElement(getCarsModuleFromFeaturesMenu).build().perform();
        assertTrue(getCarsModuleFromFeaturesMenu.isEnabled());
        assertEquals("Cars Module", getCarsModuleFromFeaturesMenu.getText());
        getCarsModuleFromFeaturesMenu.click();
        assertEquals("https://phptravels.com/cars-module-features/", driverFirefox.getCurrentUrl());

        WebElement getOffersModuleFromFeaturesMenu = driverFirefox.findElement(By.cssSelector("a[href$='offers-module-features/']"));
        actionFirefox.moveToElement(driverFirefox.findElement(By.cssSelector("[class='has-drop']>[class='lvl-1']>span")))
                .moveToElement(getOffersModuleFromFeaturesMenu).build().perform();
        assertTrue(getOffersModuleFromFeaturesMenu.isEnabled());
        assertEquals("Offers Module", getOffersModuleFromFeaturesMenu.getText());
        getOffersModuleFromFeaturesMenu.click();
        assertEquals("https://phptravels.com/offers-module-features/", driverFirefox.getCurrentUrl());

        WebElement getBlogModuleFromFeaturesMenu = driverFirefox.findElement(By.cssSelector("a[href$='blog-module-features/']"));
        actionFirefox.moveToElement(driverFirefox.findElement(By.cssSelector("[class='has-drop']>[class='lvl-1']>span")))
                .moveToElement(getBlogModuleFromFeaturesMenu).build().perform();
        assertTrue(getBlogModuleFromFeaturesMenu.isEnabled());
        assertEquals("Blog Module", getBlogModuleFromFeaturesMenu.getText());
        getBlogModuleFromFeaturesMenu.click();
        assertEquals("https://phptravels.com/blog-module-features/", driverFirefox.getCurrentUrl());

        WebElement getNewsletterModuleFromFeaturesMenu = driverFirefox.findElement(By.cssSelector("a[href$='newsletter-module-features/']"));
        actionFirefox.moveToElement(driverFirefox.findElement(By.cssSelector("[class='has-drop']>[class='lvl-1']>span")))
                .moveToElement(getNewsletterModuleFromFeaturesMenu).build().perform();
        assertTrue(getNewsletterModuleFromFeaturesMenu.isEnabled());
        assertEquals("Newsletter Module", getNewsletterModuleFromFeaturesMenu.getText());
        getNewsletterModuleFromFeaturesMenu.click();
        assertEquals("https://phptravels.com/newsletter-module-features/", driverFirefox.getCurrentUrl());

        WebElement getCMSModuleFromFeaturesMenu = driverFirefox.findElement(By.cssSelector("a[href$='cms-module-features/']"));
        actionFirefox.moveToElement(driverFirefox.findElement(By.cssSelector("[class='has-drop']>[class='lvl-1']>span")))
                .moveToElement(getCMSModuleFromFeaturesMenu).build().perform();
        assertTrue(getCMSModuleFromFeaturesMenu.isEnabled());
        assertEquals("CMS Module", getCMSModuleFromFeaturesMenu.getText());
        getCMSModuleFromFeaturesMenu.click();
        assertEquals("https://phptravels.com/cms-module-features/", driverFirefox.getCurrentUrl());
    }

    public void checkProductElementsOnDemoPage() {
        //check all product elements
        WebElement getProduct = driverFirefox.findElement(By.cssSelector("li:nth-child(4) > span > span"));
        WebElement getProductDropdownMenu = driverFirefox.findElement(By.cssSelector("li:nth-child(4) > div"));

        actionFirefox.moveToElement(getProduct).moveToElement(getProductDropdownMenu).build().perform();
        assertTrue(getProductDropdownMenu.isEnabled());

        WebElement getDocumentationFromProductMenu = driverFirefox.findElement(By.cssSelector("a[href$='documentation/']"));
        actionFirefox.moveToElement(getProduct)
                .moveToElement(getDocumentationFromProductMenu).build().perform();
        assertTrue(getDocumentationFromProductMenu.isEnabled());
        assertEquals("Documentation", getDocumentationFromProductMenu.getText());
        getDocumentationFromProductMenu.click();
        assertEquals("https://phptravels.com/documentation/", driverFirefox.getCurrentUrl());

        WebElement getFeaturesFromProductMenu = driverFirefox.findElement(By.cssSelector("a[href='https://phptravels.com/features/']"));
        actionFirefox.moveToElement(driverFirefox.findElement(By.cssSelector("li:nth-child(4) > span > span")))
                .moveToElement(getFeaturesFromProductMenu).build().perform();
        assertTrue(getFeaturesFromProductMenu.isEnabled());
        assertEquals("Features", getFeaturesFromProductMenu.getText());
        getFeaturesFromProductMenu.click();
        assertEquals("https://phptravels.com/features/", driverFirefox.getCurrentUrl());

        WebElement getTechnologyFromProductMenu = driverFirefox.findElement(By.cssSelector("a[href$='technology/']"));
        actionFirefox.moveToElement(driverFirefox.findElement(By.cssSelector("li:nth-child(4) > span > span")))
                .moveToElement(getTechnologyFromProductMenu).build().perform();
        assertTrue(getTechnologyFromProductMenu.isEnabled());
        assertEquals("Technology", getTechnologyFromProductMenu.getText());
        getTechnologyFromProductMenu.click();
        assertEquals("https://phptravels.com/technology/", driverFirefox.getCurrentUrl());

        WebElement getRequirementsFromProductMenu = driverFirefox.findElement(By.cssSelector("a[href$='requirements/']"));
        actionFirefox.moveToElement(driverFirefox.findElement(By.cssSelector("li:nth-child(4) > span > span")))
                .moveToElement(getRequirementsFromProductMenu).build().perform();
        assertTrue(getRequirementsFromProductMenu.isEnabled());
        assertEquals("Requirements", getRequirementsFromProductMenu.getText());
        getRequirementsFromProductMenu.click();
        assertEquals("https://phptravels.com/requirements/", driverFirefox.getCurrentUrl());

        WebElement getChangelogFromProductMenu = driverFirefox.findElement(By.cssSelector("a[href$='change-log/']"));
        actionFirefox.moveToElement(driverFirefox.findElement(By.cssSelector("li:nth-child(4) > span > span")))
                .moveToElement(getChangelogFromProductMenu).build().perform();
        assertTrue(getChangelogFromProductMenu.isEnabled());
        assertEquals("Changelog", getChangelogFromProductMenu.getText());
        getChangelogFromProductMenu.click();
        assertEquals("https://phptravels.com/change-log/", driverFirefox.getCurrentUrl());

        WebElement getUpdatesFromProductMenu = driverFirefox.findElement(By.cssSelector("a[href$='updates/']"));
        actionFirefox.moveToElement(driverFirefox.findElement(By.cssSelector("li:nth-child(4) > span > span")))
                .moveToElement(getUpdatesFromProductMenu).build().perform();
        assertTrue(getUpdatesFromProductMenu.isEnabled());
        assertEquals("Updates", getUpdatesFromProductMenu.getText());
        getUpdatesFromProductMenu.click();
        assertEquals("https://phptravels.com/updates/", driverFirefox.getCurrentUrl());

        WebElement getDesktopAppFromProductMenu = driverFirefox.findElement(By.cssSelector("a[href$='desktop-application/']"));
        actionFirefox.moveToElement(driverFirefox.findElement(By.cssSelector("li:nth-child(4) > span > span")))
                .moveToElement(getDesktopAppFromProductMenu).build().perform();
        assertTrue(getDesktopAppFromProductMenu.isEnabled());
        assertEquals("Desktop App", getDesktopAppFromProductMenu.getText());
        getDesktopAppFromProductMenu.click();
        assertEquals("https://phptravels.com/desktop-application/", driverFirefox.getCurrentUrl());

        WebElement getMobileAppFromProductMenu = driverFirefox.findElement(By.cssSelector("a[href$='mobile-applications/']"));
        actionFirefox.moveToElement(driverFirefox.findElement(By.cssSelector("li:nth-child(4) > span > span")))
                .moveToElement(getMobileAppFromProductMenu).build().perform();
        assertTrue(getMobileAppFromProductMenu.isEnabled());
        assertEquals("Mobile App", getMobileAppFromProductMenu.getText());
        getMobileAppFromProductMenu.click();
        assertEquals("https://phptravels.com/mobile-applications/", driverFirefox.getCurrentUrl());

        WebElement getHowToStartFromProductMenu = driverFirefox.findElement(By.cssSelector("a[href$='how-to-get-started//']"));
        actionFirefox.moveToElement(driverFirefox.findElement(By.cssSelector("li:nth-child(4) > span > span")))
                .moveToElement(getHowToStartFromProductMenu).build().perform();
        assertTrue(getHowToStartFromProductMenu.isEnabled());
        assertEquals("How to Start", getHowToStartFromProductMenu.getText());
        getHowToStartFromProductMenu.click();
        assertEquals("https://phptravels.com/how-to-get-started//", driverFirefox.getCurrentUrl());
    }

    public void checkHostingElementsOnDemoPage() {
        //check all hosting elements
        WebElement getHosting = driverFirefox.findElement(By.cssSelector("li:nth-child(5) > span > span"));
        WebElement getHostingDropdownMenu = driverFirefox.findElement(By.cssSelector("li:nth-child(5) > div"));

        actionFirefox.moveToElement(getHosting).moveToElement(getHostingDropdownMenu).build().perform();
        assertTrue(getHostingDropdownMenu.isEnabled());

        WebElement getSharedHostingFromHostingMenu = driverFirefox.findElement(By.cssSelector("a[href$='shared-hosting/']"));
        actionFirefox.moveToElement(getHosting)
                .moveToElement(getHostingDropdownMenu).build().perform();
        assertTrue(getSharedHostingFromHostingMenu.isEnabled());
        assertEquals("Shared Hosting", getSharedHostingFromHostingMenu.getText());
        getSharedHostingFromHostingMenu.click();
        assertEquals("https://phptravels.com/shared-hosting/", driverFirefox.getCurrentUrl());

        WebElement getVPSFromHostingMenu = driverFirefox.findElement(By.cssSelector("a[href$='vps-hosting/']"));
        actionFirefox.moveToElement(driverFirefox.findElement(By.cssSelector("li:nth-child(5) > span > span")))
                .moveToElement(getVPSFromHostingMenu).build().perform();
        assertTrue(getVPSFromHostingMenu.isEnabled());
        assertEquals("VPS Hosting", getVPSFromHostingMenu.getText());
        getVPSFromHostingMenu.click();
        assertEquals("https://phptravels.com/vps-hosting/", driverFirefox.getCurrentUrl());

        WebElement getDedicatedServersFromHostingMenu = driverFirefox.findElement(By.cssSelector("a[href$='dedicated-servers/']"));
        actionFirefox.moveToElement(driverFirefox.findElement(By.cssSelector("li:nth-child(5) > span > span")))
                .moveToElement(getDedicatedServersFromHostingMenu).build().perform();
        assertTrue(getDedicatedServersFromHostingMenu.isEnabled());
        assertEquals("Dedicated Servers", getDedicatedServersFromHostingMenu.getText());
        getDedicatedServersFromHostingMenu.click();
        assertEquals("https://phptravels.com/dedicated-servers/", driverFirefox.getCurrentUrl());
    }

    public void checkServicesElementsOnDemoPage() {
        //checking all services elements
        WebElement getServices = driverFirefox.findElement(By.cssSelector("li:nth-child(6) > span > span"));
        WebElement getServicesDropdownMenu = driverFirefox.findElement(By.cssSelector("li:nth-child(6) > div"));

        actionFirefox.moveToElement(getServices).moveToElement(getServicesDropdownMenu).build().perform();
        assertTrue(getServicesDropdownMenu.isEnabled());

        WebElement getProductServicesFromServicesMenu = driverFirefox.findElement(By.cssSelector("a[href$='services/']"));
        actionFirefox.moveToElement(getServices)
                .moveToElement(getServicesDropdownMenu).build().perform();
        assertTrue(getProductServicesFromServicesMenu.isEnabled());
        assertEquals("Product Services", getProductServicesFromServicesMenu.getText());
        getProductServicesFromServicesMenu.click();
        assertEquals("https://phptravels.com/services/", driverFirefox.getCurrentUrl());

        WebElement getIntegrationsFromServicesMenu = driverFirefox.findElement(By.cssSelector("a[href$='integrations/']"));
        actionFirefox.moveToElement(driverFirefox.findElement(By.cssSelector("li:nth-child(6) > span > span")))
                .moveToElement(getIntegrationsFromServicesMenu).build().perform();
        assertTrue(getIntegrationsFromServicesMenu.isEnabled());
        assertEquals("Integrations", getIntegrationsFromServicesMenu.getText());
        getIntegrationsFromServicesMenu.click();
        assertEquals("https://phptravels.com/integrations/", driverFirefox.getCurrentUrl());

        WebElement getCustomizationsFromHServicesMenu = driverFirefox.findElement(By.cssSelector("a[href$='customizations/']"));
        actionFirefox.moveToElement(driverFirefox.findElement(By.cssSelector("li:nth-child(6) > span > span")))
                .moveToElement(getCustomizationsFromHServicesMenu).build().perform();
        assertTrue(getCustomizationsFromHServicesMenu.isEnabled());
        assertEquals("Customizations", getCustomizationsFromHServicesMenu.getText());
        getCustomizationsFromHServicesMenu.click();
        assertEquals("https://phptravels.com/customizations/", driverFirefox.getCurrentUrl());

        WebElement getAPIXMLIntegrationFromServicesgMenu = driverFirefox.findElement(By.cssSelector("a[href$='expedia-xml-api-integration/']"));
        actionFirefox.moveToElement(driverFirefox.findElement(By.cssSelector("li:nth-child(6) > span > span")))
                .moveToElement(getAPIXMLIntegrationFromServicesgMenu).build().perform();
        assertTrue(getAPIXMLIntegrationFromServicesgMenu.isEnabled());
        assertEquals("API XML Integration", getAPIXMLIntegrationFromServicesgMenu.getText());
        getAPIXMLIntegrationFromServicesgMenu.click();
        assertEquals("https://phptravels.com/expedia-xml-api-integration/", driverFirefox.getCurrentUrl());

        WebElement getProvidersFromServicesMenu = driverFirefox.findElement(By.cssSelector("a[href$='providers/']"));
        actionFirefox.moveToElement(driverFirefox.findElement(By.cssSelector("li:nth-child(6) > span > span")))
                .moveToElement(getProvidersFromServicesMenu).build().perform();
        assertTrue(getProvidersFromServicesMenu.isEnabled());
        assertEquals("Providers", getProvidersFromServicesMenu.getText());
        getProvidersFromServicesMenu.click();
        assertEquals("https://phptravels.com/providers/", driverFirefox.getCurrentUrl());
    }

    public void checkCompanyElementsOnDemoPage() {
        //checking all company elements
        WebElement getCompany = driverFirefox.findElement(By.cssSelector("li:nth-child(7) > span > span"));
        WebElement getCompanyDropdownMenu = driverFirefox.findElement(By.cssSelector("li:nth-child(7) > div"));

        actionFirefox.moveToElement(getCompany).moveToElement(getCompanyDropdownMenu).build().perform();
        assertTrue(getCompanyDropdownMenu.isEnabled());

        WebElement getAboutUsFromCompanyMenu = driverFirefox.findElement(By.cssSelector("a[href$='about-us/']"));
        actionFirefox.moveToElement(getCompany)
                .moveToElement(getCompanyDropdownMenu).build().perform();
        assertTrue(getAboutUsFromCompanyMenu.isEnabled());
        assertEquals("About Us", getAboutUsFromCompanyMenu.getText());
        getAboutUsFromCompanyMenu.click();
        assertEquals("https://phptravels.com/about-us/", driverFirefox.getCurrentUrl());

        WebElement getContactUsFromCompanyMenu = driverFirefox.findElement(By.cssSelector("a[href$='contact-us/']"));
        actionFirefox.moveToElement(driverFirefox.findElement(By.cssSelector("li:nth-child(7) > span > span")))
                .moveToElement(getContactUsFromCompanyMenu).build().perform();
        assertTrue(getContactUsFromCompanyMenu.isEnabled());
        assertEquals("Contact Us", getContactUsFromCompanyMenu.getText());
        getContactUsFromCompanyMenu.click();
        assertEquals("https://phptravels.com/contact-us/", driverFirefox.getCurrentUrl());

        WebElement getTheTeamFromCompanyMenu = driverFirefox.findElement(By.cssSelector("a[href$='the-team/']"));
        actionFirefox.moveToElement(driverFirefox.findElement(By.cssSelector("li:nth-child(7) > span > span")))
                .moveToElement(getTheTeamFromCompanyMenu).build().perform();
        assertTrue(getTheTeamFromCompanyMenu.isEnabled());
        assertEquals("The Team", getTheTeamFromCompanyMenu.getText());
        getTheTeamFromCompanyMenu.click();
        assertEquals("https://phptravels.com/the-team/", driverFirefox.getCurrentUrl());

        WebElement getAffiliateFromCompanyMenu = driverFirefox.findElement(By.cssSelector("a[href$='affiliate/']"));
        actionFirefox.moveToElement(driverFirefox.findElement(By.cssSelector("li:nth-child(7) > span > span")))
                .moveToElement(getAffiliateFromCompanyMenu).build().perform();
        assertTrue(getAffiliateFromCompanyMenu.isEnabled());
        assertEquals("Affiliate", getAffiliateFromCompanyMenu.getText());
        getAffiliateFromCompanyMenu.click();
        assertEquals("https://phptravels.com/affiliate/", driverFirefox.getCurrentUrl());

        WebElement getMediaKitFromCompanyMenu = driverFirefox.findElement(By.cssSelector("a[href$='media-kit/']"));
        actionFirefox.moveToElement(driverFirefox.findElement(By.cssSelector("li:nth-child(7) > span > span")))
                .moveToElement(getMediaKitFromCompanyMenu).build().perform();
        assertTrue(getMediaKitFromCompanyMenu.isEnabled());
        assertEquals("Media Kit", getMediaKitFromCompanyMenu.getText());
        getMediaKitFromCompanyMenu.click();
        assertEquals("https://phptravels.com/media-kit/", driverFirefox.getCurrentUrl());

        WebElement getCareersJobsFromCompanyMenu = driverFirefox.findElement(By.cssSelector("a[href$='jobs/']"));
        actionFirefox.moveToElement(driverFirefox.findElement(By.cssSelector("li:nth-child(7) > span > span")))
                .moveToElement(getCareersJobsFromCompanyMenu).build().perform();
        assertTrue(getCareersJobsFromCompanyMenu.isEnabled());
        assertEquals("Careers / Jobs", getCareersJobsFromCompanyMenu.getText());
        getCareersJobsFromCompanyMenu.click();
        assertEquals("https://phptravels.com/jobs/", driverFirefox.getCurrentUrl());

        WebElement getPrivacyPolicyFromCompanyMenu = driverFirefox.findElement(By.cssSelector("[href='https://phptravels.com/privacy-statement/']"));
        actionFirefox.moveToElement(driverFirefox.findElement(By.cssSelector("li:nth-child(7) > span > span")))
                .moveToElement(getPrivacyPolicyFromCompanyMenu).build().perform();
        assertTrue(getPrivacyPolicyFromCompanyMenu.isEnabled());
        assertEquals("Privacy Policy", getPrivacyPolicyFromCompanyMenu.getText());
        getPrivacyPolicyFromCompanyMenu.click();
        assertEquals("https://phptravels.com/privacy-statement/", driverFirefox.getCurrentUrl());

        WebElement getTermsConditionsFromCompanyMenu = driverFirefox.findElement(By.cssSelector("a[href$='terms-and-conditions/']"));
        actionFirefox.moveToElement(driverFirefox.findElement(By.cssSelector("li:nth-child(7) > span > span")))
                .moveToElement(getTermsConditionsFromCompanyMenu).build().perform();
        assertTrue(getTermsConditionsFromCompanyMenu.isEnabled());
        assertEquals("Terms & Conditions", getTermsConditionsFromCompanyMenu.getText());
        getTermsConditionsFromCompanyMenu.click();
        assertEquals("https://phptravels.com/terms-and-conditions/", driverFirefox.getCurrentUrl());

        WebElement getBlogArticlesFromCompanyMenu = driverFirefox.findElement(By.cssSelector("a[href$='blog/']"));
        actionFirefox.moveToElement(driverFirefox.findElement(By.cssSelector("li:nth-child(7) > span > span")))
                .moveToElement(getBlogArticlesFromCompanyMenu).build().perform();
        assertTrue(getBlogArticlesFromCompanyMenu.isEnabled());
        assertEquals("Blog Articles", getBlogArticlesFromCompanyMenu.getText());
        getBlogArticlesFromCompanyMenu.click();
        assertEquals("https://phptravels.com/blog/", driverFirefox.getCurrentUrl());

        driverFirefox.get(homePageURL);
        WebElement getForumFromCompanyMenu = driverFirefox.findElement(By.cssSelector("a[href$='phptravels.info']"));
        actionFirefox.moveToElement(driverFirefox.findElement(By.cssSelector("li:nth-child(7) > span > span")))
                .moveToElement(getForumFromCompanyMenu).build().perform();
        assertTrue(getForumFromCompanyMenu.isEnabled());
        assertEquals("Forums", getForumFromCompanyMenu.getText());
        getForumFromCompanyMenu.click();
        ArrayList<String> tabs = new ArrayList<String>(driverFirefox.getWindowHandles());
        driverFirefox.switchTo().window(tabs.get(9));
        assertEquals("http://www.phptravels.info/", driverFirefox.getCurrentUrl());
    }

    public void checkBannerElementsOnDemoPage() {
        driverFirefox.get(homePageURL);
        assertTrue(banner.isDisplayed());

        assertTrue(checkout.isEnabled());
        assertEquals("CHECKOUT\nPRICING", checkout.getText());
        checkout.click();
        assertEquals("https://phptravels.com/order/", driverFirefox.getCurrentUrl());

        driverFirefox.get(homePageURL);
        assertTrue(explore.isEnabled());
        assertEquals("EXPLORE\nDEMO", explore.getText());
        explore.click();
        assertEquals("https://phptravels.com/demo/", driverFirefox.getCurrentUrl());

        driverFirefox.get(homePageURL);
        assertTrue(smallBanner.isDisplayed());
        assertTrue(hotels.isDisplayed());
        assertTrue(flights.isDisplayed());
        assertTrue(tours.isDisplayed());
        assertTrue(cars.isDisplayed());
        assertTrue(visa.isDisplayed());
        assertTrue(offers.isDisplayed());
        assertTrue(blogBanner.isDisplayed());
        assertTrue(CMS.isDisplayed());
        assertTrue(newsletter.isDisplayed());
        assertTrue(multieLanguage.isDisplayed());
        assertTrue(multiCurrencies.isDisplayed());
        assertTrue(mobileApplications.isDisplayed());
        assertTrue(freeSupport.isDisplayed());
        assertTrue(lifetimeUpdates.isDisplayed());
    }
}

