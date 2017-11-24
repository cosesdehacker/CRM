package com.itnove.crm.SuiteDashboard;

import com.itnove.crm.BaseTest;
import com.itnove.crm.pages.loginPage.PageDashboard;
import com.itnove.crm.pages.loginPage.PageLogin;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class SCRM16Dash_Logout extends BaseTest {

    @Test
    public void testApp() throws InterruptedException, IOException {

        PageLogin pageLogin = new PageLogin(driver);
        pageLogin.login("user", "bitnami");

        Thread.sleep(3000);

        PageDashboard pageDashboard = new PageDashboard(driver);
        pageDashboard.funcioLogOut();

        pageLogin.logout();

        WebElement quadreTextUser = driver.findElement(By.id("user_name"));
        Assert.assertTrue(quadreTextUser.isDisplayed());

    }

    }





