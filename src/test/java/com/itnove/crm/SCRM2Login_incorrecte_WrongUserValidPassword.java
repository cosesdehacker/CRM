package com.itnove.crm;

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

public class SCRM2Login_incorrecte_WrongUserValidPassword extends BaseTest {

    @Test
    public void testApp() throws InterruptedException, IOException {
        driver.navigate().to("http://crm.votarem.lu/index.php?module=Users&action=Login");
        PageLogin access = new PageLogin(driver);
        access.login("user1", "bitnami");

        WebElement liniaError = driver.findElement(By.xpath("/html/body"));
        wait.until(ExpectedConditions.visibilityOf(liniaError));

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/Users/nasrodo/SCRM2.png"));



    }
}
