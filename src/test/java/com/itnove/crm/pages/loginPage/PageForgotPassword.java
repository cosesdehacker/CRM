package com.itnove.crm.pages.loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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


    public void forgotPassword(String user, String email) {
        driver.manage().window().maximize();

        forgotButton.click();
        quadreTextUserFP.click();
        quadreTextUserFP.sendKeys(user);
        quadreTextMailFP.click();
        quadreTextMailFP.sendKeys(email);
        botoSubmitFP.click();
    }

    public PageForgotPassword(WebDriver driver) {PageFactory.initElements(driver, this);
        this.driver = driver;}

}
