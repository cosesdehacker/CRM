package com.itnove.crm.pages.loginPage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class PageDashboard {

    private WebDriver driver;
    public WebDriverWait wait;

    // BARRA NAVEGACIÓ SUPERIOR ESQUERRA

    @FindBy(xpath = "/html/body/div[2]/nav/div/div[2]/ul/li[1]")
    public WebElement homeIcon;

    @FindBy(id = "grouptab_0")
    public WebElement sales;

    @FindBy(id = "grouptab_1")
    public WebElement marketing;

    @FindBy(id = "grouptab_4")
    public WebElement collaboration;

    // BARRA NAVEGACIÓ SUPERIOR DRETA

    //CREATE

    @FindBy(xpath = "(.//*[@id='quickcreatetop']/a)[3]")
    public WebElement createButton;

    @FindBy(xpath = "(.//*[@id='quickcreatetop']/ul)[3]/li[1]/a")
    public WebElement createAccount;

    @FindBy(xpath = "(.//*[@id='quickcreatetop']/ul)[3]/li[2]/a")
    public WebElement createContact;


    //LUPA

    @FindBy(xpath = "id('ajaxHeader')/nav[1]/div[1]/div[5]/ul/li[2]")
    public WebElement lupa;

    @FindBy(xpath = "id('ajaxHeader')/nav[1]/div[1]/div[5]/ul/li[2]/div/form/div/input")
    public WebElement quadreTextLupa;

    @FindBy(xpath = "id('ajaxHeader')/nav[1]/div[1]/div[5]/ul/li[2]/div/form/div/span")
    public WebElement lupaPetita;

    @FindBy(xpath = "id('pagecontent')/form/input[3]")
    public WebElement quadreCercaLupaSecundari;

    @FindBy(xpath = "id('pagecontent')/table[1]/tbody[2]/tr/td[2]/a")
    public WebElement quadreNomLupaSecundari;

    @FindBy(xpath = "id('pagecontent')/div[1]/h2[1]")
    public WebElement titolResultat;

    //NOTIFICATIONS

    //USUARI

    @FindBy(xpath = "id('ajaxHeader')/nav[1]/div[1]/div[5]/ul/li[5]")
    public WebElement userIcon;

    @FindBy(xpath = "id('ajaxHeader')/nav[1]/div[1]/div[5]/ul/li[5]/ul/li[6]")
    public WebElement logOut;


    //*****************************


    //BARRA NAVEGACIÓ SUPERIOR ESQUERRA

    public void HoverEsquerraTopNav(Actions hover) {
        List<WebElement> topNavEsquerra = driver.findElements(By.className("topnav"));
        System.out.println(topNavEsquerra.size());

        for (int i = 2; i < (topNavEsquerra.size() + 2); i++) {
            WebElement elementTopNavEsquerra = driver.
                    findElement(By.xpath(".//*[@id=\"toolbar\"]/ul[1]/li[" + i + "]"));

            hover.moveToElement(elementTopNavEsquerra).build().perform();

        }
    }

    public void clickSalesDesplegable() throws InterruptedException {

        List<WebElement> desplegarSales = driver.findElements(By.xpath("id('grouptab_0')/../ul/li"));
        Actions hover = new Actions(driver);

        for (int i = 1; i < (desplegarSales.size()+1); i++) {
            String current = driver.getCurrentUrl();
            hover.moveToElement(sales).click().build().perform();
            Thread.sleep(2000);
            WebElement elementSales = driver.
                    findElement(By.xpath("id('grouptab_0')/../ul/li[" + i + "]"));
            hover.moveToElement(sales).moveToElement(elementSales).click().build().perform();
            Thread.sleep(2000);
            Assert.assertTrue(!(current.equals(driver.getCurrentUrl())));
        }

    }

    public void clickMarketingDesplegable() throws InterruptedException {

        List<WebElement> desplegarMarketing = driver.findElements(By.xpath("id('grouptab_1')/../ul/li"));
        Actions hover = new Actions(driver);

        for (int i = 1; i < (desplegarMarketing.size()+1); i++) {
            String current = driver.getCurrentUrl();
            hover.moveToElement(marketing).click().build().perform();
            Thread.sleep(2000);
            WebElement elementMarketing = driver.
                    findElement(By.xpath("id('grouptab_1')/../ul/li[" + i + "]"));
            hover.moveToElement(marketing).moveToElement(elementMarketing).click().build().perform();
            Thread.sleep(2000);
            Assert.assertTrue(!(current.equals(driver.getCurrentUrl())));
        }

    }

    public void clickCollaborationDesplegable() throws InterruptedException {

        List<WebElement> desplegarCollaboration = driver.findElements(By.xpath("id('grouptab_4')/../ul/li"));
        Actions hover = new Actions(driver);

        for (int i = 1; i < (desplegarCollaboration.size()+1); i++) {
            String current = driver.getCurrentUrl();
            hover.moveToElement(collaboration).click().build().perform();
            Thread.sleep(2000);
            WebElement elementCollaboration = driver.
                    findElement(By.xpath("id('grouptab_4')/../ul/li[" + i + "]"));
            hover.moveToElement(marketing).moveToElement(elementCollaboration).click().build().perform();
            Thread.sleep(2000);
            Assert.assertTrue(!(current.equals(driver.getCurrentUrl())));
        }

    }

    //LUPA

   public void lupa(String textCerca) throws InterruptedException {

       wait = (new WebDriverWait(driver, 10));

       lupa.click();
       quadreTextLupa.click();
       quadreTextLupa.sendKeys(textCerca);
       lupaPetita.click();
       Assert.assertTrue(quadreCercaLupaSecundari.getAttribute("value").equals(textCerca));

       quadreNomLupaSecundari.click();
       wait.until(ExpectedConditions.visibilityOf(titolResultat));
       Assert.assertTrue(titolResultat.getText().contains(textCerca.toUpperCase()));

   }

   //CREATE

    public void createButtonClick(Actions hover) throws InterruptedException {
           hover.moveToElement(createButton)
                   .moveToElement(createButton)
                   .click().build().perform();
    }

    public void hoverAndClickEveryCreate(WebDriver driver, Actions hover) throws InterruptedException {
        createButtonClick(hover);
        String listElements = "(.//*[@id='quickcreatetop']/ul)[3]/li";
        String lsl = listElements + "/a";
        List<WebElement> listOfCreates = driver.findElements(By.xpath(lsl));
        for (int i = 1; i <= listOfCreates.size(); i++) {
            createButtonClick(hover);
            WebElement eachCreateItem = driver.findElement(By.xpath(listElements + "[" + i + "]/a"));
            hover.moveToElement(createButton)
                    .moveToElement(eachCreateItem)
                    .click().build().perform();
            Thread.sleep(3000);
            System.out.println(i);
        }
    }

    public void hoverAndClick(WebElement element, Actions hover) {

        hover.moveToElement(element)
                .moveToElement(element)
                .click().build().perform();
    }

    //ICONA USUARI

    public void funcioLogOut() {

        userIcon.click();
        logOut.click();

   }

    public PageDashboard(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}