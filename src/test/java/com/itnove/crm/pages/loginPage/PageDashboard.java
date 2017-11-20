package com.itnove.crm.pages.loginPage; //NO FUNCIONA... JA NO SÉ QUÈ MÉS PROVAR

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


    @FindBy(xpath = "/html/body/div[2]/nav/div/div[2]/ul/li[1]")
    public WebElement homeIcon;

    @FindBy(id = "grouptab_0")
    public WebElement sales;

    @FindBy(id = "grouptab_1")
    public WebElement marketing;

    @FindBy(id = "grouptab_2")
    public WebElement support1;

    @FindBy(id = "grouptab_3")
    public WebElement activities;

    @FindBy(id = "grouptab_4")
    public WebElement collaboration;

    @FindBy(id = "grouptab_5")
    public WebElement all;

    //*****

  /*  //SALES

    @FindBy(xpath = ".//*[@id=\"moduleTab_9_Home\"]")
    public WebElement HomeSales;

    @FindBy(xpath = "//*[@id='grouptab_0']/../ul/li[2]")
    public WebElement AccountsSales;

    @FindBy(id = "//*[@id='grouptab_0']/../ul/li[3]")
    public WebElement ContactsSales;

    @FindBy(xpath = "//*[@id='grouptab_0']/../ul/li[4]")
    public WebElement OpportunitiesSales;

    @FindBy(xpath = "//*[@id='grouptab_0']/../ul/li[5]")
    public WebElement LeadsSales; */

    //*****


    public void HoverEsquerraTopNav() {

        Actions hover = new Actions(driver);


        List<WebElement> topNavEsquerra = driver.findElements(By.className("topnav"));
        System.out.println(topNavEsquerra.size());

        for (int i = 2; i < (topNavEsquerra.size() + 2); i++) {
            WebElement elementTopNavEsquerra = driver.
                    findElement(By.xpath(".//*[@id=\"toolbar\"]/ul[1]/li[" + i + "]"));

            hover.moveToElement(elementTopNavEsquerra).build().perform();

        }
    }

        public void clickSalesDesplegable() {
        List<WebElement> desplegarSales = driver.findElements(By.xpath("id('grouptab_0')/../ul/li"));

        for (int i = 1; i < (desplegarSales.size()+1); i++) {

            String current = driver.getCurrentUrl();
            sales.click();

            WebElement elementSales = driver.
                    findElement(By.xpath("id('grouptab_0')/../ul/li[" + i + "]"));
            elementSales.click();

            Assert.assertTrue(!(current.equals(driver.getCurrentUrl())));


        }

    }

    public PageDashboard(WebDriver driver) { PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}