package com.itnove.crm.pages.loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PageLogin {

    private WebDriver driver;

    @FindBy(id = "user_name")
    public WebElement quadreTextUser;

    @FindBy(id = "user_password")
    public WebElement quadreTextPassword;

    @FindBy(id = "bigbutton")
    public WebElement botoLogin;


    public void ValidValid() {
        quadreTextUser.click();
        quadreTextUser.sendKeys("user");
        quadreTextPassword.click();
        quadreTextPassword.sendKeys("bitnami");
        botoLogin.click();
    }

    public void WrongValid() {
        quadreTextUser.click();
        quadreTextUser.sendKeys("user1");
        quadreTextPassword.click();
        quadreTextPassword.sendKeys("bitnami");
        botoLogin.click();
    }

    public void ValidWrong() {
        quadreTextUser.click();
        quadreTextUser.sendKeys("user");
        quadreTextPassword.click();
        quadreTextPassword.sendKeys("bitnami1");
        botoLogin.click();
    }

    public void WrongWrong() {
        quadreTextUser.click();
        quadreTextUser.sendKeys("user1");
        quadreTextPassword.click();
        quadreTextPassword.sendKeys("bitnami1");
        botoLogin.click();
    }

    public PageLogin(WebDriver driver) {PageFactory.initElements(driver, this);
    this.driver = driver;}

}
