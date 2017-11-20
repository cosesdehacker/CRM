package com.itnove.crm.pages.loginPage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;


public class PageForgotPassword {

    private WebDriver driver;

    @FindBy(xpath = "//html[1]/body[1]/div[1]/div[2]/div[1]/form[1]/div[4]")
    public WebElement forgotButton;

    @FindBy(id = "fp_user_name")
    public WebElement quadreTextUserFP;

    @FindBy(id = "fp_user_mail")
    public WebElement quadreTextMailFP;

    @FindBy(id = "generate_pwd_button")
    public WebElement botoSubmitFP;


    public void ValidValidFP() {
        driver.manage().window().maximize();

        //Point newPoint = new Point(415, 463);
        //driver.manage().window().setPosition(newPoint);

        forgotButton.click();
        quadreTextUserFP.click();
        quadreTextUserFP.sendKeys("user");
        quadreTextMailFP.click();
        quadreTextMailFP.sendKeys("cristina@barcelonaactiva.cat");
        botoSubmitFP.click();
    }

    public void WrongValidFP() {
        driver.manage().window().maximize();

        forgotButton.click();
        quadreTextUserFP.click();
        quadreTextUserFP.sendKeys("user1");
        quadreTextMailFP.click();
        quadreTextMailFP.sendKeys("cristina@barcelonaactiva.cat");
        botoSubmitFP.click();
    }

    public void ValidWrongFP() {
        driver.manage().window().maximize();

        forgotButton.click();
        quadreTextUserFP.click();
        quadreTextUserFP.sendKeys("user");
        quadreTextMailFP.click();
        quadreTextMailFP.sendKeys("cristina1@barcelonaactiva.cat");
        botoSubmitFP.click();
    }

    public void WrongWrongFP() {
        driver.manage().window().maximize();

        forgotButton.click();
        quadreTextUserFP.click();
        quadreTextUserFP.sendKeys("user1");
        quadreTextMailFP.click();
        quadreTextMailFP.sendKeys("cristina1@barcelonaactiva.cat");
        botoSubmitFP.click();
    }

    public PageForgotPassword(WebDriver driver) {PageFactory.initElements(driver, this);
        this.driver = driver;}

}
