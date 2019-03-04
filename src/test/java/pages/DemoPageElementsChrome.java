package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class DemoPageElementsChrome {

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
    @FindBy(how = How.CSS, using = ".text-primary")
    private WebElement demo;
    @FindBy(how = How.CSS, using = ".text-success")
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

    //banner
    @FindBy(how = How.CSS, using = ".flying-boxes")
    private WebElement banner;
    @FindBy(how = How.CSS, using = "[class='flying-box flying-center-left']")
    private WebElement flyingHotel;
    @FindBy(how = How.CSS, using = "[class='flying-box flying-center-right']")
    private WebElement flyingPlane;
    @FindBy(how = How.CSS, using = "[class='flying-box flying-top']")
    private WebElement flyingTop;
    @FindBy(how = How.CSS, using = "[class='flying-box flying-bottom']")
    private WebElement flyingCar;
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

    //first section
    @FindBy(how = How.CSS, using = "section:nth-child(5)")
    private WebElement firstSection;
    @FindBy(how = How.CSS, using = "[style='margin-top:50px']")
    private WebElement sectionH;
    @FindBy(how = How.CSS, using = "section:nth-child(5) > div > div > p")
    private WebElement sectionP;

    @FindBy(how = How.CSS, using = "div :nth-child(1) > div.boxed")
    private WebElement supportBox;
    @FindBy(how = How.CSS, using = "div :nth-child(1) > div.boxed > span")
    private WebElement support;
    @FindBy(how = How.CSS, using = "[class='fa fa-life-ring']")
    private WebElement supportPicture;
    @FindBy(how = How.CSS, using = "div :nth-child(1) > div.boxed > p")
    private WebElement supportText;

    @FindBy(how = How.CSS, using = "div :nth-child(2) > div.boxed")
    private WebElement opensourceBox;
    @FindBy(how = How.CSS, using = "div :nth-child(2) > div.boxed > span")
    private WebElement opensource;
    @FindBy(how = How.CSS, using = "[class='fa fa-code']")
    private WebElement opensourcePicture;
    @FindBy(how = How.CSS, using = "div :nth-child(2) > div.boxed > p")
    private WebElement opensourceText;

    @FindBy(how = How.CSS, using = "div :nth-child(3) > div.boxed")
    private WebElement responsiveBox;
    @FindBy(how = How.CSS, using = "div :nth-child(3) > div.boxed > span")
    private WebElement responsive;
    @FindBy(how = How.CSS, using = "[class='fa fa-mobile']")
    private WebElement responsivePicture;
    @FindBy(how = How.CSS, using = "div :nth-child(3) > div.boxed > p")
    private WebElement responsiveText;

    @FindBy(how = How.CSS, using = "div :nth-child(4) > div.boxed")
    private WebElement securityBox;
    @FindBy(how = How.CSS, using = "div :nth-child(4) > div.boxed > span")
    private WebElement security;
    @FindBy(how = How.CSS, using = "[class='fa fa-user-secret']")
    private WebElement securityPicture;
    @FindBy(how = How.CSS, using = "div :nth-child(4) > div.boxed > p")
    private WebElement securityText;

    @FindBy(how = How.CSS, using = "div.row > div:nth-child(6) > div")
    private WebElement flexibleBox;
    @FindBy(how = How.CSS, using = "div.row > div:nth-child(6) > div > span")
    private WebElement flexible;
    @FindBy(how = How.CSS, using = "[class='fa fa-codepen'")
    private WebElement flexiblePicture;
    @FindBy(how = How.CSS, using = "div.row > div:nth-child(6) > div > p")
    private WebElement flexibleText;

    @FindBy(how = How.CSS, using = "div.row > div:nth-child(7) > div")
    private WebElement multilingualBox;
    @FindBy(how = How.CSS, using = "div.row > div:nth-child(7) > div > span")
    private WebElement multilingual;
    @FindBy(how = How.CSS, using = "[class='fa fa-language']")
    private WebElement multilingualPicture;
    @FindBy(how = How.CSS, using = "div.row > div:nth-child(7) > div > p")
    private WebElement multilingualText;

    @FindBy(how = How.CSS, using = "div.row > div:nth-child(8) > div")
    private WebElement paymentGatewaysBox;
    @FindBy(how = How.CSS, using = "div.row > div:nth-child(8) > div > span")
    private WebElement paymentGateways;
    @FindBy(how = How.CSS, using = "[class='fa fa-credit-card']")
    private WebElement paymentGatewaysPicture;
    @FindBy(how = How.CSS, using = "div.row > div:nth-child(8) > div > p")
    private WebElement paymentGatewaysText;

    @FindBy(how = How.CSS, using = "div.row > div:nth-child(9) > div")
    private WebElement customizationBox;
    @FindBy(how = How.CSS, using = "div.row > div:nth-child(9) > div > span")
    private WebElement customization;
    @FindBy(how = How.CSS, using = "[class='fa fa-sliders']")
    private WebElement customizationPicture;
    @FindBy(how = How.CSS, using = "div.row > div:nth-child(9) > div > p")
    private WebElement customizationText;

    //features section
    @FindBy(how = How.CSS, using = "[class='features-section']")
    private WebElement featuresSection;
    @FindBy(how = How.CSS, using = "[class='features-section']>div>div>h2")
    private WebElement featuresSectionH;
    @FindBy(how = How.CSS, using = "[class='features-section']>div>div>p")
    private WebElement featuresSectionP;
    @FindBy(how = How.CSS, using = "[alt='frontend application']")
    private WebElement featuresSectionPicture;
    @FindBy(how = How.CSS, using = ".clearfix:nth-child(4)")
    private WebElement featuresSectionBanner;
    @FindBy(how = How.CSS, using = "[class='icon-circle fa fa-building']")
    private WebElement featuresSectionBannerHotels;
    @FindBy(how = How.CSS, using = ".features-section :nth-child(2) > div > h4")
    private WebElement featuresSectionBannerHotelsText;
    @FindBy(how = How.CSS, using = "[class='icon-circle fa fa-plane']")
    private WebElement featuresSectionBannerFlights;
    @FindBy(how = How.CSS, using = ".features-section :nth-child(3) > div > h4")
    private WebElement featuresSectionBannerFlightsText;
    @FindBy(how = How.CSS, using = "[class='icon-circle fa fa-briefcase']")
    private WebElement featuresSectionBannerTours;
    @FindBy(how = How.CSS, using = ".features-section :nth-child(4) > div > h4")
    private WebElement featuresSectionBannerToursText;
    @FindBy(how = How.CSS, using = "[class='icon-circle fa fa-cab'")
    private WebElement featuresSectionBannerCars;
    @FindBy(how = How.CSS, using = ".features-section :nth-child(5) > div > h4")
    private WebElement featuresSectionBannerCarsText;
    @FindBy(how = How.CSS, using = "[class='icon-circle fa fa-gift']")
    private WebElement featuresSectionBannerOffers;
    @FindBy(how = How.CSS, using = ".features-section :nth-child(6) > div > h4")
    private WebElement featuresSectionBannerOffersText;
    @FindBy(how = How.CSS, using = "[class='icon-circle fa fa-file']")
    private WebElement featuresSectionBannerBlog;
    @FindBy(how = How.CSS, using = ".features-section :nth-child(7) > div > h4")
    private WebElement featuresSectionBannerBlogText;
    @FindBy(how = How.CSS, using = "[class='icon-circle fa fa-envelope']")
    private WebElement featuresSectionBannerNewsletter;
    @FindBy(how = How.CSS, using = ".features-section :nth-child(8) > div > h4")
    private WebElement featuresSectionBannerNewsletterText;
    @FindBy(how = How.CSS, using = "[class='icon-circle fa fa-desktop']")
    private WebElement featuresSectionBannerCMS;
    @FindBy(how = How.CSS, using = ".features-section :nth-child(9) > div > h4")
    private WebElement featuresSectionBannerCMSText;
    @FindBy(how = How.CSS, using = ".wow.fadeInUp.center-block")
    private WebElement seeAllFeatures;

    String homePageURL = "https://phptravels.com/";

    private WebDriver driverChrome = Hooks.driverChrome;

    Actions actionChrome = new Actions(driverChrome);
    WebDriverWait wait = new WebDriverWait(driverChrome, 15);
    JavascriptExecutor js = (JavascriptExecutor) driverChrome;

    public void checkTopBarElementsAvailabilityOnDemoPage() {
        assertTrue(topBar.isDisplayed());
        assertTrue(logoImage.isDisplayed());

        assertTrue(news.isDisplayed());
        assertEquals("NEWS", news.getText());

        assertTrue(dataSlidePrev.isEnabled());
        assertTrue(dataSlideNext.isEnabled());

        //check carousel text
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[onmouseover$=\"'#e69900'\"]")));
        assertEquals("PHPTRAVELS laucnhed new version v6.6 and it's available now!", driverChrome.findElement(By.cssSelector("[onmouseover$=\"'#e69900'\"]")).getText());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[onmouseover$=\"'#33cc33'\"]")));
        assertEquals("PHPTRAVELS served 4500+ travel agencies this year!", driverChrome.findElement(By.cssSelector("[onmouseover$=\"'#33cc33'\"]")).getText());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[onmouseover$=\"'#61ddab'\"]")));
        assertEquals("Team PHPTRAVELS participated at PTM PAKISTAN TRAVEL MART Karachi Oct 2018!", driverChrome.findElement(By.cssSelector("[onmouseover$=\"'#61ddab'\"]")).getText());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[onmouseover$=\"'#4ed9f1'\"]")));
        assertEquals("PHPTRAVELS official partnership with iVisa.com fore more details click here!", driverChrome.findElement(By.cssSelector("[onmouseover$=\"'#4ed9f1'\"]")).getText());

        if (true) {
            assertTrue(forums.isEnabled());
            assertEquals("FORUMS", forums.getText());
            forums.click();
            wait.until(ExpectedConditions.numberOfWindowsToBe(2));
            ArrayList<String> tabsOne = new ArrayList<String>(driverChrome.getWindowHandles());
            driverChrome.switchTo().window(tabsOne.get(1));
            assertEquals("https://www.phptravels.info/", driverChrome.getCurrentUrl());
        } else {
            driverChrome.navigate().refresh();
            assertTrue(forums.isEnabled());
            assertEquals("FORUMS", forums.getText());
            forums.click();
            wait.until(ExpectedConditions.numberOfWindowsToBe(2));
            ArrayList<String> tabsOne = new ArrayList<String>(driverChrome.getWindowHandles());
            driverChrome.switchTo().window(tabsOne.get(1));
            assertEquals("https://www.phptravels.info/", driverChrome.getCurrentUrl());
        }

        assertTrue(forumsLogo.isDisplayed());
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

        driverChrome.get(homePageURL);
        assertTrue(blog.isEnabled());
        assertEquals("BLOG", blog.getText());
        blog.click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        ArrayList<String> tabsTwo = new ArrayList<String>(driverChrome.getWindowHandles());
        driverChrome.switchTo().window(tabsTwo.get(2));
        assertEquals("https://medium.com/phptravels", driverChrome.getCurrentUrl());

        driverChrome.get(homePageURL);
        assertTrue(clientArea.isEnabled());
        assertEquals("CLIENT AREA", clientArea.getText());
        clientArea.click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(4));
        ArrayList<String> tabsThree = new ArrayList<String>(driverChrome.getWindowHandles());
        driverChrome.switchTo().window(tabsThree.get(3));
        assertEquals("https://www.phptravels.org/clientarea.php", driverChrome.getCurrentUrl());
    }

    public void checkSocialMediaLinksElementsAvailabilityInTopBarOnDemoPage() {
        driverChrome.get(homePageURL);
        assertTrue(facebook.isEnabled());
        facebook.click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(5));
        ArrayList<String> tabsFour = new ArrayList<String>(driverChrome.getWindowHandles());
        driverChrome.switchTo().window(tabsFour.get(4));
        assertEquals("https://www.facebook.com/travelbusiness", driverChrome.getCurrentUrl());

        driverChrome.get(homePageURL);
        assertTrue(gmail.isEnabled());
        gmail.click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(6));
        ArrayList<String> tabsFive = new ArrayList<String>(driverChrome.getWindowHandles());
        driverChrome.switchTo().window(tabsFive.get(5));
        assertEquals("https://plus.google.com/+phptravels", driverChrome.getCurrentUrl());

        driverChrome.get(homePageURL);
        assertTrue(twitter.isEnabled());
        twitter.click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(7));
        ArrayList<String> tabsSix = new ArrayList<String>(driverChrome.getWindowHandles());
        driverChrome.switchTo().window(tabsSix.get(6));
        assertEquals("https://twitter.com/phptravels", driverChrome.getCurrentUrl());

        driverChrome.get(homePageURL);
        assertTrue(linkdin.isEnabled());
        linkdin.click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(8));
        ArrayList<String> tabsSeven = new ArrayList<String>(driverChrome.getWindowHandles());
        driverChrome.switchTo().window(tabsSeven.get(7));
        assertEquals("https://www.linkedin.com/company/phptravels", driverChrome.getCurrentUrl());

        driverChrome.get(homePageURL);
        assertTrue(instagram.isEnabled());
        instagram.click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(9));
        ArrayList<String> tabsEight = new ArrayList<String>(driverChrome.getWindowHandles());
        driverChrome.switchTo().window(tabsEight.get(8));
        assertEquals("https://www.instagram.com/phptravelsofficial/", driverChrome.getCurrentUrl());

//        driverChrome.get(homePageURL);
//        assertTrue(sitemap.isEnabled());
//        sitemap.click();
//        wait.until(ExpectedConditions.numberOfWindowsToBe(10));
//        ArrayList<String> tabsNine = new ArrayList<String>(driverChrome2.getWindowHandles());
//        driverChrome2.switchTo().window(tabsNine.get(9));
//        assertEquals("https://phptravels.com/sitemap.xml", driverChrome2.getCurrentUrl());
    }

    public void checkElementsAvailabilityInHeaderOnDemoPage() {
        driverChrome.get(homePageURL);

        assertTrue(header.isDisplayed());

        assertTrue(demo.isEnabled());
        assertEquals("DEMO", demo.getText());
        demo.click();
        assertEquals("https://phptravels.com/demo/", driverChrome.getCurrentUrl());

        assertTrue(pricing.isEnabled());
        assertEquals("PRICING", pricing.getText());
        pricing.click();
        assertEquals("https://phptravels.com/order/", driverChrome.getCurrentUrl());

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
        WebElement getFeatures = driverChrome.findElement(By.cssSelector("[class='has-drop']>[class='lvl-1']>span"));
        WebElement getFeaturesDropdownMenu = driverChrome.findElement(By.cssSelector("div[class='menu-dropdown']"));

        actionChrome.moveToElement(getFeatures).moveToElement(getFeaturesDropdownMenu).build().perform();
        assertTrue(getFeaturesDropdownMenu.isEnabled());

        WebElement getHotelsModuleFromFeaturesMenu = driverChrome.findElement(By.cssSelector("a[href$='hotels-module-features/']"));
        actionChrome.moveToElement(getFeatures)
                .moveToElement(getHotelsModuleFromFeaturesMenu).build().perform();
        assertTrue(getHotelsModuleFromFeaturesMenu.isEnabled());
        assertEquals("Hotels Module", getHotelsModuleFromFeaturesMenu.getText());
        getHotelsModuleFromFeaturesMenu.click();
        assertEquals("https://phptravels.com/hotels-module-features/", driverChrome.getCurrentUrl());

        WebElement getFlightsModuleFromFeaturesMenu = driverChrome.findElement(By.cssSelector("a[href$='flights-module-features/']"));
        actionChrome.moveToElement(driverChrome.findElement(By.cssSelector("[class='has-drop']>[class='lvl-1']>span")))
                .moveToElement(getFlightsModuleFromFeaturesMenu).build().perform();
        assertTrue(getFlightsModuleFromFeaturesMenu.isEnabled());
        assertEquals("Flights Module", getFlightsModuleFromFeaturesMenu.getText());
        getFlightsModuleFromFeaturesMenu.click();
        assertEquals("https://phptravels.com/flights-module-features/", driverChrome.getCurrentUrl());

        WebElement getToursFromFeatureMenu = driverChrome.findElement(By.cssSelector("a[href$='tours-module-features/']"));
        actionChrome.moveToElement(driverChrome.findElement(By.cssSelector("[class='has-drop']>[class='lvl-1']>span")))
                .moveToElement(getToursFromFeatureMenu).build().perform();
        assertTrue(getToursFromFeatureMenu.isEnabled());
        assertEquals("Tours Module", getToursFromFeatureMenu.getText());
        getToursFromFeatureMenu.click();
        assertEquals("https://phptravels.com/tours-module-features/", driverChrome.getCurrentUrl());

        WebElement getCarsModuleFromFeaturesMenu = driverChrome.findElement(By.cssSelector("a[href$='cars-module-features/']"));
        actionChrome.moveToElement(driverChrome.findElement(By.cssSelector("[class='has-drop']>[class='lvl-1']>span")))
                .moveToElement(getCarsModuleFromFeaturesMenu).build().perform();
        assertTrue(getCarsModuleFromFeaturesMenu.isEnabled());
        assertEquals("Cars Module", getCarsModuleFromFeaturesMenu.getText());
        getCarsModuleFromFeaturesMenu.click();
        assertEquals("https://phptravels.com/cars-module-features/", driverChrome.getCurrentUrl());

        WebElement getOffersModuleFromFeaturesMenu = driverChrome.findElement(By.cssSelector("a[href$='offers-module-features/']"));
        actionChrome.moveToElement(driverChrome.findElement(By.cssSelector("[class='has-drop']>[class='lvl-1']>span")))
                .moveToElement(getOffersModuleFromFeaturesMenu).build().perform();
        assertTrue(getOffersModuleFromFeaturesMenu.isEnabled());
        assertEquals("Offers Module", getOffersModuleFromFeaturesMenu.getText());
        getOffersModuleFromFeaturesMenu.click();
        assertEquals("https://phptravels.com/offers-module-features/", driverChrome.getCurrentUrl());

        WebElement getBlogModuleFromFeaturesMenu = driverChrome.findElement(By.cssSelector("a[href$='blog-module-features/']"));
        actionChrome.moveToElement(driverChrome.findElement(By.cssSelector("[class='has-drop']>[class='lvl-1']>span")))
                .moveToElement(getBlogModuleFromFeaturesMenu).build().perform();
        assertTrue(getBlogModuleFromFeaturesMenu.isEnabled());
        assertEquals("Blog Module", getBlogModuleFromFeaturesMenu.getText());
        getBlogModuleFromFeaturesMenu.click();
        assertEquals("https://phptravels.com/blog-module-features/", driverChrome.getCurrentUrl());

        WebElement getNewsletterModuleFromFeaturesMenu = driverChrome.findElement(By.cssSelector("a[href$='newsletter-module-features/']"));
        actionChrome.moveToElement(driverChrome.findElement(By.cssSelector("[class='has-drop']>[class='lvl-1']>span")))
                .moveToElement(getNewsletterModuleFromFeaturesMenu).build().perform();
        assertTrue(getNewsletterModuleFromFeaturesMenu.isEnabled());
        assertEquals("Newsletter Module", getNewsletterModuleFromFeaturesMenu.getText());
        getNewsletterModuleFromFeaturesMenu.click();
        assertEquals("https://phptravels.com/newsletter-module-features/", driverChrome.getCurrentUrl());

        WebElement getCMSModuleFromFeaturesMenu = driverChrome.findElement(By.cssSelector("a[href$='cms-module-features/']"));
        actionChrome.moveToElement(driverChrome.findElement(By.cssSelector("[class='has-drop']>[class='lvl-1']>span")))
                .moveToElement(getCMSModuleFromFeaturesMenu).build().perform();
        assertTrue(getCMSModuleFromFeaturesMenu.isEnabled());
        assertEquals("CMS Module", getCMSModuleFromFeaturesMenu.getText());
        getCMSModuleFromFeaturesMenu.click();
        assertEquals("https://phptravels.com/cms-module-features/", driverChrome.getCurrentUrl());
    }

    public void checkProductElementsOnDemoPage() {
        //check all product elements
        WebElement getProduct = driverChrome.findElement(By.cssSelector("li:nth-child(4) > span > span"));
        WebElement getProductDropdownMenu = driverChrome.findElement(By.cssSelector("li:nth-child(4) > div"));

        actionChrome.moveToElement(getProduct).moveToElement(getProductDropdownMenu).build().perform();
        assertTrue(getProductDropdownMenu.isEnabled());

        WebElement getDocumentationFromProductMenu = driverChrome.findElement(By.cssSelector("a[href$='documentation/']"));
        actionChrome.moveToElement(getProduct)
                .moveToElement(getDocumentationFromProductMenu).build().perform();
        assertTrue(getDocumentationFromProductMenu.isEnabled());
        assertEquals("Documentation", getDocumentationFromProductMenu.getText());
        getDocumentationFromProductMenu.click();
        assertEquals("https://phptravels.com/documentation/", driverChrome.getCurrentUrl());

        WebElement getFeaturesFromProductMenu = driverChrome.findElement(By.cssSelector("a[href='https://phptravels.com/features/']"));
        actionChrome.moveToElement(driverChrome.findElement(By.cssSelector("li:nth-child(4) > span > span")))
                .moveToElement(getFeaturesFromProductMenu).build().perform();
        assertTrue(getFeaturesFromProductMenu.isEnabled());
        assertEquals("Features", getFeaturesFromProductMenu.getText());
        getFeaturesFromProductMenu.click();
        assertEquals("https://phptravels.com/features/", driverChrome.getCurrentUrl());

        WebElement getTechnologyFromProductMenu = driverChrome.findElement(By.cssSelector("a[href$='technology/']"));
        actionChrome.moveToElement(driverChrome.findElement(By.cssSelector("li:nth-child(4) > span > span")))
                .moveToElement(getTechnologyFromProductMenu).build().perform();
        assertTrue(getTechnologyFromProductMenu.isEnabled());
        assertEquals("Technology", getTechnologyFromProductMenu.getText());
        getTechnologyFromProductMenu.click();
        assertEquals("https://phptravels.com/technology/", driverChrome.getCurrentUrl());

        WebElement getRequirementsFromProductMenu = driverChrome.findElement(By.cssSelector("a[href$='requirements/']"));
        actionChrome.moveToElement(driverChrome.findElement(By.cssSelector("li:nth-child(4) > span > span")))
                .moveToElement(getRequirementsFromProductMenu).build().perform();
        assertTrue(getRequirementsFromProductMenu.isEnabled());
        assertEquals("Requirements", getRequirementsFromProductMenu.getText());
        getRequirementsFromProductMenu.click();
        assertEquals("https://phptravels.com/requirements/", driverChrome.getCurrentUrl());

        WebElement getChangelogFromProductMenu = driverChrome.findElement(By.cssSelector("a[href$='change-log/']"));
        actionChrome.moveToElement(driverChrome.findElement(By.cssSelector("li:nth-child(4) > span > span")))
                .moveToElement(getChangelogFromProductMenu).build().perform();
        assertTrue(getChangelogFromProductMenu.isEnabled());
        assertEquals("Changelog", getChangelogFromProductMenu.getText());
        getChangelogFromProductMenu.click();
        assertEquals("https://phptravels.com/change-log/", driverChrome.getCurrentUrl());

        WebElement getUpdatesFromProductMenu = driverChrome.findElement(By.cssSelector("a[href$='updates/']"));
        actionChrome.moveToElement(driverChrome.findElement(By.cssSelector("li:nth-child(4) > span > span")))
                .moveToElement(getUpdatesFromProductMenu).build().perform();
        assertTrue(getUpdatesFromProductMenu.isEnabled());
        assertEquals("Updates", getUpdatesFromProductMenu.getText());
        getUpdatesFromProductMenu.click();
        assertEquals("https://phptravels.com/updates/", driverChrome.getCurrentUrl());

        WebElement getDesktopAppFromProductMenu = driverChrome.findElement(By.cssSelector("a[href$='desktop-application/']"));
        actionChrome.moveToElement(driverChrome.findElement(By.cssSelector("li:nth-child(4) > span > span")))
                .moveToElement(getDesktopAppFromProductMenu).build().perform();
        assertTrue(getDesktopAppFromProductMenu.isEnabled());
        assertEquals("Desktop App", getDesktopAppFromProductMenu.getText());
        getDesktopAppFromProductMenu.click();
        assertEquals("https://phptravels.com/desktop-application/", driverChrome.getCurrentUrl());

        WebElement getMobileAppFromProductMenu = driverChrome.findElement(By.cssSelector("a[href$='mobile-applications/']"));
        actionChrome.moveToElement(driverChrome.findElement(By.cssSelector("li:nth-child(4) > span > span")))
                .moveToElement(getMobileAppFromProductMenu).build().perform();
        assertTrue(getMobileAppFromProductMenu.isEnabled());
        assertEquals("Mobile App", getMobileAppFromProductMenu.getText());
        getMobileAppFromProductMenu.click();
        assertEquals("https://phptravels.com/mobile-applications/", driverChrome.getCurrentUrl());

        WebElement getHowToStartFromProductMenu = driverChrome.findElement(By.cssSelector("a[href$='how-to-get-started//']"));
        actionChrome.moveToElement(driverChrome.findElement(By.cssSelector("li:nth-child(4) > span > span")))
                .moveToElement(getHowToStartFromProductMenu).build().perform();
        assertTrue(getHowToStartFromProductMenu.isEnabled());
        assertEquals("How to Start", getHowToStartFromProductMenu.getText());
        getHowToStartFromProductMenu.click();
        assertEquals("https://phptravels.com/how-to-get-started//", driverChrome.getCurrentUrl());
    }

    public void checkHostingElementsOnDemoPage() {
        //check all hosting elements
        WebElement getHosting = driverChrome.findElement(By.cssSelector("li:nth-child(5) > span > span"));
        WebElement getHostingDropdownMenu = driverChrome.findElement(By.cssSelector("li:nth-child(5) > div"));

        actionChrome.moveToElement(getHosting).moveToElement(getHostingDropdownMenu).build().perform();
        assertTrue(getHostingDropdownMenu.isEnabled());

        WebElement getSharedHostingFromHostingMenu = driverChrome.findElement(By.cssSelector("a[href$='shared-hosting/']"));
        actionChrome.moveToElement(getHosting)
                .moveToElement(getHostingDropdownMenu).build().perform();
        assertTrue(getSharedHostingFromHostingMenu.isEnabled());
        assertEquals("Shared Hosting", getSharedHostingFromHostingMenu.getText());
        getSharedHostingFromHostingMenu.click();
        assertEquals("https://phptravels.com/shared-hosting/", driverChrome.getCurrentUrl());

        WebElement getVPSFromHostingMenu = driverChrome.findElement(By.cssSelector("a[href$='vps-hosting/']"));
        actionChrome.moveToElement(driverChrome.findElement(By.cssSelector("li:nth-child(5) > span > span")))
                .moveToElement(getVPSFromHostingMenu).build().perform();
        assertTrue(getVPSFromHostingMenu.isEnabled());
        assertEquals("VPS Hosting", getVPSFromHostingMenu.getText());
        getVPSFromHostingMenu.click();
        assertEquals("https://phptravels.com/vps-hosting/", driverChrome.getCurrentUrl());

        WebElement getDedicatedServersFromHostingMenu = driverChrome.findElement(By.cssSelector("a[href$='dedicated-servers/']"));
        actionChrome.moveToElement(driverChrome.findElement(By.cssSelector("li:nth-child(5) > span > span")))
                .moveToElement(getDedicatedServersFromHostingMenu).build().perform();
        assertTrue(getDedicatedServersFromHostingMenu.isEnabled());
        assertEquals("Dedicated Servers", getDedicatedServersFromHostingMenu.getText());
        getDedicatedServersFromHostingMenu.click();
        assertEquals("https://phptravels.com/dedicated-servers/", driverChrome.getCurrentUrl());
    }

    public void checkServicesElementsOnDemoPage() {
        //checking all services elements
        WebElement getServices = driverChrome.findElement(By.cssSelector("li:nth-child(6) > span > span"));
        WebElement getServicesDropdownMenu = driverChrome.findElement(By.cssSelector("li:nth-child(6) > div"));

        actionChrome.moveToElement(getServices).moveToElement(getServicesDropdownMenu).build().perform();
        assertTrue(getServicesDropdownMenu.isEnabled());

        WebElement getProductServicesFromServicesMenu = driverChrome.findElement(By.cssSelector("a[href$='services/']"));
        actionChrome.moveToElement(getServices)
                .moveToElement(getServicesDropdownMenu).build().perform();
        assertTrue(getProductServicesFromServicesMenu.isEnabled());
        assertEquals("Product Services", getProductServicesFromServicesMenu.getText());
        getProductServicesFromServicesMenu.click();
        assertEquals("https://phptravels.com/services/", driverChrome.getCurrentUrl());

        WebElement getIntegrationsFromServicesMenu = driverChrome.findElement(By.cssSelector("a[href$='integrations/']"));
        actionChrome.moveToElement(driverChrome.findElement(By.cssSelector("li:nth-child(6) > span > span")))
                .moveToElement(getIntegrationsFromServicesMenu).build().perform();
        assertTrue(getIntegrationsFromServicesMenu.isEnabled());
        assertEquals("Integrations", getIntegrationsFromServicesMenu.getText());
        getIntegrationsFromServicesMenu.click();
        assertEquals("https://phptravels.com/integrations/", driverChrome.getCurrentUrl());

        WebElement getCustomizationsFromHServicesMenu = driverChrome.findElement(By.cssSelector("a[href$='customizations/']"));
        actionChrome.moveToElement(driverChrome.findElement(By.cssSelector("li:nth-child(6) > span > span")))
                .moveToElement(getCustomizationsFromHServicesMenu).build().perform();
        assertTrue(getCustomizationsFromHServicesMenu.isEnabled());
        assertEquals("Customizations", getCustomizationsFromHServicesMenu.getText());
        getCustomizationsFromHServicesMenu.click();
        assertEquals("https://phptravels.com/customizations/", driverChrome.getCurrentUrl());

        WebElement getAPIXMLIntegrationFromServicesgMenu = driverChrome.findElement(By.cssSelector("a[href$='expedia-xml-api-integration/']"));
        actionChrome.moveToElement(driverChrome.findElement(By.cssSelector("li:nth-child(6) > span > span")))
                .moveToElement(getAPIXMLIntegrationFromServicesgMenu).build().perform();
        assertTrue(getAPIXMLIntegrationFromServicesgMenu.isEnabled());
        assertEquals("API XML Integration", getAPIXMLIntegrationFromServicesgMenu.getText());
        getAPIXMLIntegrationFromServicesgMenu.click();
        assertEquals("https://phptravels.com/expedia-xml-api-integration/", driverChrome.getCurrentUrl());

        WebElement getProvidersFromServicesMenu = driverChrome.findElement(By.cssSelector("a[href$='providers/']"));
        actionChrome.moveToElement(driverChrome.findElement(By.cssSelector("li:nth-child(6) > span > span")))
                .moveToElement(getProvidersFromServicesMenu).build().perform();
        assertTrue(getProvidersFromServicesMenu.isEnabled());
        assertEquals("Providers", getProvidersFromServicesMenu.getText());
        getProvidersFromServicesMenu.click();
        assertEquals("https://phptravels.com/providers/", driverChrome.getCurrentUrl());
    }

    public void checkCompanyElementsOnDemoPage() {
        //checking all company elements
        WebElement getCompany = driverChrome.findElement(By.cssSelector("li:nth-child(7) > span > span"));
        WebElement getCompanyDropdownMenu = driverChrome.findElement(By.cssSelector("li:nth-child(7) > div"));

        actionChrome.moveToElement(getCompany).moveToElement(getCompanyDropdownMenu).build().perform();
        assertTrue(getCompanyDropdownMenu.isEnabled());

        WebElement getAboutUsFromCompanyMenu = driverChrome.findElement(By.cssSelector("a[href$='about-us/']"));
        actionChrome.moveToElement(getCompany)
                .moveToElement(getCompanyDropdownMenu).build().perform();
        assertTrue(getAboutUsFromCompanyMenu.isEnabled());
        assertEquals("About Us", getAboutUsFromCompanyMenu.getText());
        getAboutUsFromCompanyMenu.click();
        assertEquals("https://phptravels.com/about-us/", driverChrome.getCurrentUrl());

        WebElement getContactUsFromCompanyMenu = driverChrome.findElement(By.cssSelector("a[href$='contact-us/']"));
        actionChrome.moveToElement(driverChrome.findElement(By.cssSelector("li:nth-child(7) > span > span")))
                .moveToElement(getContactUsFromCompanyMenu).build().perform();
        assertTrue(getContactUsFromCompanyMenu.isEnabled());
        assertEquals("Contact Us", getContactUsFromCompanyMenu.getText());
        getContactUsFromCompanyMenu.click();
        assertEquals("https://phptravels.com/contact-us/", driverChrome.getCurrentUrl());

        WebElement getTheTeamFromCompanyMenu = driverChrome.findElement(By.cssSelector("a[href$='the-team/']"));
        actionChrome.moveToElement(driverChrome.findElement(By.cssSelector("li:nth-child(7) > span > span")))
                .moveToElement(getTheTeamFromCompanyMenu).build().perform();
        assertTrue(getTheTeamFromCompanyMenu.isEnabled());
        assertEquals("The Team", getTheTeamFromCompanyMenu.getText());
        getTheTeamFromCompanyMenu.click();
        assertEquals("https://phptravels.com/the-team/", driverChrome.getCurrentUrl());

        WebElement getAffiliateFromCompanyMenu = driverChrome.findElement(By.cssSelector("a[href$='affiliate/']"));
        actionChrome.moveToElement(driverChrome.findElement(By.cssSelector("li:nth-child(7) > span > span")))
                .moveToElement(getAffiliateFromCompanyMenu).build().perform();
        assertTrue(getAffiliateFromCompanyMenu.isEnabled());
        assertEquals("Affiliate", getAffiliateFromCompanyMenu.getText());
        getAffiliateFromCompanyMenu.click();
        assertEquals("https://phptravels.com/affiliate/", driverChrome.getCurrentUrl());

        WebElement getMediaKitFromCompanyMenu = driverChrome.findElement(By.cssSelector("a[href$='media-kit/']"));
        actionChrome.moveToElement(driverChrome.findElement(By.cssSelector("li:nth-child(7) > span > span")))
                .moveToElement(getMediaKitFromCompanyMenu).build().perform();
        assertTrue(getMediaKitFromCompanyMenu.isEnabled());
        assertEquals("Media Kit", getMediaKitFromCompanyMenu.getText());
        getMediaKitFromCompanyMenu.click();
        assertEquals("https://phptravels.com/media-kit/", driverChrome.getCurrentUrl());

        WebElement getCareersJobsFromCompanyMenu = driverChrome.findElement(By.cssSelector("a[href$='jobs/']"));
        actionChrome.moveToElement(driverChrome.findElement(By.cssSelector("li:nth-child(7) > span > span")))
                .moveToElement(getCareersJobsFromCompanyMenu).build().perform();
        assertTrue(getCareersJobsFromCompanyMenu.isEnabled());
        assertEquals("Careers / Jobs", getCareersJobsFromCompanyMenu.getText());
        getCareersJobsFromCompanyMenu.click();
        assertEquals("https://phptravels.com/jobs/", driverChrome.getCurrentUrl());

        WebElement getPrivacyPolicyFromCompanyMenu = driverChrome.findElement(By.cssSelector("[href='https://phptravels.com/privacy-statement/']"));
        actionChrome.moveToElement(driverChrome.findElement(By.cssSelector("li:nth-child(7) > span > span")))
                .moveToElement(getPrivacyPolicyFromCompanyMenu).build().perform();
        assertTrue(getPrivacyPolicyFromCompanyMenu.isEnabled());
        assertEquals("Privacy Policy", getPrivacyPolicyFromCompanyMenu.getText());
        getPrivacyPolicyFromCompanyMenu.click();
        assertEquals("https://phptravels.com/privacy-statement/", driverChrome.getCurrentUrl());

        WebElement getTermsConditionsFromCompanyMenu = driverChrome.findElement(By.cssSelector("a[href$='terms-and-conditions/']"));
        actionChrome.moveToElement(driverChrome.findElement(By.cssSelector("li:nth-child(7) > span > span")))
                .moveToElement(getTermsConditionsFromCompanyMenu).build().perform();
        assertTrue(getTermsConditionsFromCompanyMenu.isEnabled());
        assertEquals("Terms & Conditions", getTermsConditionsFromCompanyMenu.getText());
        getTermsConditionsFromCompanyMenu.click();
        assertEquals("https://phptravels.com/terms-and-conditions/", driverChrome.getCurrentUrl());

        WebElement getBlogArticlesFromCompanyMenu = driverChrome.findElement(By.cssSelector("a[href$='blog/']"));
        actionChrome.moveToElement(driverChrome.findElement(By.cssSelector("li:nth-child(7) > span > span")))
                .moveToElement(getBlogArticlesFromCompanyMenu).build().perform();
        assertTrue(getBlogArticlesFromCompanyMenu.isEnabled());
        assertEquals("Blog Articles", getBlogArticlesFromCompanyMenu.getText());
        getBlogArticlesFromCompanyMenu.click();
        assertEquals("https://phptravels.com/blog/", driverChrome.getCurrentUrl());

        driverChrome.get(homePageURL);
        WebElement getForumFromCompanyMenu = driverChrome.findElement(By.cssSelector("a[href$='phptravels.info']"));
        actionChrome.moveToElement(driverChrome.findElement(By.cssSelector("li:nth-child(7) > span > span")))
                .moveToElement(getForumFromCompanyMenu).build().perform();
        assertTrue(getForumFromCompanyMenu.isEnabled());
        assertEquals("Forums", getForumFromCompanyMenu.getText());
        getForumFromCompanyMenu.click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(10));
        ArrayList<String> tabs = new ArrayList<String>(driverChrome.getWindowHandles());
        driverChrome.switchTo().window(tabs.get(9));
        assertEquals("http://www.phptravels.info/", driverChrome.getCurrentUrl());
    }

    public void checkBannerElementsOnDemoPage() {
        driverChrome.get(homePageURL);
        assertTrue(banner.isDisplayed());

        assertTrue(flyingHotel.isDisplayed());
        assertTrue(flyingPlane.isDisplayed());
        assertTrue(flyingTop.isDisplayed());
        assertTrue(flyingCar.isDisplayed());

        assertTrue(checkout.isEnabled());
        assertEquals("CHECKOUT\nPRICING", checkout.getText());
        checkout.click();
        assertEquals("https://phptravels.com/order/", driverChrome.getCurrentUrl());

        driverChrome.get(homePageURL);
        assertTrue(explore.isEnabled());
        assertEquals("EXPLORE\nDEMO", explore.getText());
        explore.click();
        assertEquals("https://phptravels.com/demo/", driverChrome.getCurrentUrl());

        driverChrome.get(homePageURL);
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

    public void checkFirstSectionElementsOnDemoPage() throws InterruptedException {
        js.executeScript("arguments[0].scrollIntoView();", sectionH);
        assertTrue(firstSection.isDisplayed());
        assertTrue(sectionH.isDisplayed());
        assertEquals("WORLD'S LEADING BOOKING SOFTWARE", sectionH.getText());

        js.executeScript("arguments[0].scrollIntoView();", sectionP);
        Thread.sleep(2000);
        assertTrue(sectionP.isDisplayed());
        assertEquals("We offer the most cutting-edge online booking solutions on the market. Mobile, Tablet, Laptop & Desktop\n" +
                "Users enjoy a fully tailored experience while browsing our travel portal. we boast your travel business with our technology.", sectionP.getText());

        assertTrue(supportBox.isDisplayed());
        assertTrue(support.isDisplayed());
        assertEquals("SUPPORT", support.getText());
        assertTrue(supportPicture.isDisplayed());
        assertTrue(supportText.isDisplayed());
        assertEquals("Dedicated and expert support team to track, communicate and help youwith livechat, skype, whatsapp and ticket system in real-time 24/7.", supportText.getText());

        assertTrue(opensourceBox.isDisplayed());
        assertTrue(opensource.isDisplayed());
        assertEquals("OPENSOURCE", opensource.getText());
        assertTrue(opensourcePicture.isDisplayed());
        assertTrue(opensourceText.isDisplayed());
        assertEquals("Developed using latest technologies, PHP, JS, JQUERY, HTML5, BOOTSTRAP And Codeigniter framework with HMVC coding pattern.", opensourceText.getText());

        assertTrue(responsiveBox.isDisplayed());
        assertTrue(responsive.isDisplayed());
        assertEquals("RESPONSIVE", responsive.getText());
        assertTrue(responsivePicture.isDisplayed());
        assertTrue(responsiveText.isDisplayed());
        assertEquals("Responsive themes for seamless full-blow user experience by managing steady look and feel of site across devices.", responsiveText.getText());

        assertTrue(securityBox.isDisplayed());
        assertTrue(security.isDisplayed());
        assertEquals("SECURITY", security.getText());
        assertTrue(securityPicture.isDisplayed());
        assertTrue(securityText.isDisplayed());
        assertEquals("We take security seriously and back our product with a Security Bounty Program to encourage responsible disclosure by researchers.", securityText.getText());

        assertTrue(flexibleBox.isDisplayed());
        assertTrue(flexible.isDisplayed());
        assertEquals("FLEXIBLE", flexible.getText());
        assertTrue(flexiblePicture.isDisplayed());
        assertTrue(flexibleText.isDisplayed());
        assertEquals("With our streamlined technology we give you unprecidented level of control. user-friendly fast easy to understand and manage.", flexibleText.getText());

        assertTrue(multilingualBox.isDisplayed());
        assertTrue(multilingual.isDisplayed());
        assertEquals("MULTI-LINGUAL", multilingual.getText());
        assertTrue(multilingualPicture.isDisplayed());
        assertTrue(multilingualText.isDisplayed());
        assertEquals("Ability to add, edit or customize any language as per your requirements. RTL & LTR both versions available with editable option.", multilingualText.getText());

        assertTrue(paymentGatewaysBox.isDisplayed());
        assertTrue(paymentGateways.isDisplayed());
        assertEquals("PAYMENT GATEWAYS", paymentGateways.getText());
        assertTrue(paymentGatewaysPicture.isDisplayed());
        assertTrue(paymentGatewaysText.isDisplayed());
        assertEquals("Supports with all the payment gateways carried by major e-payments to power your customers transfer payments hassle free.", paymentGatewaysText.getText());

        assertTrue(customizationBox.isDisplayed());
        assertTrue(customization.isDisplayed());
        assertEquals("CUSTOMIZATION", customization.getText());
        assertTrue(customizationPicture.isDisplayed());
        assertTrue(customizationText.isDisplayed());
        assertEquals("A flexible and powerful templating engine and many built-in options allow you to fully customize the system to your needs.", customizationText.getText());
    }

    public void checkFeaturesSectionElementsOnDemoPage() {
        js.executeScript("arguments[0].scrollIntoView();", featuresSection);
        assertTrue(featuresSection.isDisplayed());
        assertTrue(featuresSectionH.isDisplayed());
        assertEquals("PHPTRAVELS MAIN MODULES", featuresSectionH.getText());

        js.executeScript("arguments[0].scrollIntoView();", featuresSectionP);
        assertTrue(featuresSectionP.isDisplayed());
        assertEquals("Our extensive moduler system coverage will help you to use what you need\n" +
                "so you can focus on what matters most for you.", featuresSectionP.getText());

        assertTrue(featuresSectionPicture.isDisplayed());
        assertTrue(featuresSectionBanner.isDisplayed());

        assertTrue(featuresSectionBannerHotels.isEnabled());
        assertTrue(featuresSectionBannerHotelsText.isDisplayed());
        assertEquals("HOTELS", featuresSectionBannerHotelsText.getText());

        assertTrue(featuresSectionBannerFlights.isEnabled());
        assertTrue(featuresSectionBannerFlightsText.isDisplayed());
        assertEquals("FLIGHTS", featuresSectionBannerFlightsText.getText());

        assertTrue(featuresSectionBannerTours.isEnabled());
        assertTrue(featuresSectionBannerToursText.isDisplayed());
        assertEquals("TOURS", featuresSectionBannerToursText.getText());

        assertTrue(featuresSectionBannerCars.isEnabled());
        assertTrue(featuresSectionBannerCarsText.isDisplayed());
        assertEquals("CARS", featuresSectionBannerCarsText.getText());

        assertTrue(featuresSectionBannerOffers.isEnabled());
        assertTrue(featuresSectionBannerOffersText.isDisplayed());
        assertEquals("OFFERS", featuresSectionBannerOffersText.getText());

        assertTrue(featuresSectionBannerBlog.isEnabled());
        assertTrue(featuresSectionBannerBlogText.isDisplayed());
        assertEquals("BLOG", featuresSectionBannerBlogText.getText());

        assertTrue(featuresSectionBannerNewsletter.isEnabled());
        assertTrue(featuresSectionBannerNewsletterText.isDisplayed());
        assertEquals("NEWSLETTER", featuresSectionBannerNewsletterText.getText());

        assertTrue(featuresSectionBannerCMS.isEnabled());
        assertTrue(featuresSectionBannerCMSText.isDisplayed());
        assertEquals("CMS", featuresSectionBannerCMSText.getText());

        assertTrue(seeAllFeatures.isEnabled());
        assertEquals("SEE ALL OUR AWESOME FEATURES", seeAllFeatures.getText());
    }
}

