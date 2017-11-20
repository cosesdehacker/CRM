package com.itnove.crm.pages.loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PageLogin {

    private WebDriver driver;

    @FindBy(id = "user_name")
    public WebElement quadreTextUser;

    @FindBy(id = "user_password")
    public WebElement quadreTextPassword;

    @FindBy(id = "bigbutton")
    public WebElement botoLogin;


    public void login(String user, String pswd) {
        quadreTextUser.click();
        quadreTextUser.sendKeys(user);
        quadreTextPassword.click();
        quadreTextPassword.sendKeys(pswd);
        botoLogin.click();

    }


    public PageLogin(WebDriver driver) {PageFactory.initElements(driver, this);
    this.driver = driver;}

}
