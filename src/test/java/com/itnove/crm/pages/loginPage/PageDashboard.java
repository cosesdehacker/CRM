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

    //SALES

    @FindBy(xpath = ".//*[@id=\"moduleTab_9_Home\"]")
    public WebElement HomeSales;

    @FindBy(xpath = "//*[@id='grouptab_0']/../ul/li[2]")
    public WebElement AccountsSales;

    @FindBy(id = "//*[@id='grouptab_0']/../ul/li[3]")
    public WebElement ContactsSales;

    @FindBy(xpath = "//*[@id='grouptab_0']/../ul/li[4]")
    public WebElement OpportunitiesSales;

    @FindBy(xpath = "//*[@id='grouptab_0']/../ul/li[5]")
    public WebElement LeadsSales;

    //*****


    public void llistaSalesTopNav() {

        Actions hover = new Actions(driver);
        wait = (new WebDriverWait(driver, 10));


        sales.click();
        wait.until(ExpectedConditions.visibilityOf(HomeSales));

        String current1 = driver.getCurrentUrl();
        HomeSales.click();
            wait.until(ExpectedConditions.visibilityOf(sales));
        Assert.assertTrue(!(current1.equals(driver.getCurrentUrl())));

        sales.click();
            wait.until(ExpectedConditions.visibilityOf(AccountsSales));

        String current2 = driver.getCurrentUrl();
        AccountsSales.click();
            wait.until(ExpectedConditions.visibilityOf(sales));
        Assert.assertTrue(!(current2.equals(driver.getCurrentUrl())));

        sales.click();
            wait.until(ExpectedConditions.visibilityOf(ContactsSales));

        String current3 = driver.getCurrentUrl();
        ContactsSales.click();
            wait.until(ExpectedConditions.alertIsPresent());
            wait.until(ExpectedConditions.visibilityOf(sales));
        Assert.assertTrue(!(current3.equals(driver.getCurrentUrl())));

        hover.moveToElement(sales).build().perform();
            wait.until(ExpectedConditions.visibilityOf(OpportunitiesSales));

        String current4 = driver.getCurrentUrl();
        OpportunitiesSales.click();
            wait.until(ExpectedConditions.visibilityOf(sales));
        Assert.assertTrue(!(current4.equals(driver.getCurrentUrl())));

        hover.moveToElement(sales).build().perform();
            wait.until(ExpectedConditions.visibilityOf(LeadsSales));

        String current5 = driver.getCurrentUrl();
        LeadsSales.click();
            wait.until(ExpectedConditions.visibilityOf(sales));
        Assert.assertTrue(!(current5.equals(driver.getCurrentUrl())));

          // OPCIÓ JORDI PERALTA

         /* List<WebElement> llistaSales = driver.findElements(By.xpath("//*[@id='grouptab_0']/../ul/li"));


        for (int i = 1; i<llistaSales.size()+1; i++) {
            String current = driver.getCurrentUrl();
            sales.click();
            WebElement elementCheck = driver.findElement(By.xpath("//*[@id='grouptab_0']/../ul/li[" + i + "]"));
            elementCheck.click();
            Assert.assertTrue(!(current.equals(driver.getCurrentUrl())));

            }*/

        }

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

    public PageDashboard(WebDriver driver) { PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}