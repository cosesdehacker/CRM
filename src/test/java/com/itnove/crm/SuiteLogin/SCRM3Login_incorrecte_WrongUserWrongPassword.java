package com.itnove.crm.SuiteLogin;

import com.itnove.crm.BaseTest;
import com.itnove.crm.pages.loginPage.PageLogin;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.io.IOException;

public class SCRM3Login_incorrecte_WrongUserWrongPassword extends BaseTest {

    @Test
    public void testApp() throws InterruptedException, IOException {

        PageLogin pageLogin = new PageLogin(driver);
        pageLogin.login("user1", "bitnami1");

        WebElement liniaError = driver.findElement(By.xpath("/html/body"));
        wait.until(ExpectedConditions.visibilityOf(liniaError));

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/Users/nasrodo/SCRM3.png"));

    }
}
