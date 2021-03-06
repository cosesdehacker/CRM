package com.itnove.crm.SuiteForgotPassword;

import com.itnove.crm.BaseTest;
import com.itnove.crm.pages.loginPage.PageForgotPassword;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.io.IOException;

public class SCRM8ForgotPassword_ValidUserWrongEmail extends BaseTest {

    @Test
    public void testApp() throws InterruptedException, IOException {

        PageForgotPassword pageForgotPassword = new PageForgotPassword(driver);
        pageForgotPassword.forgotPassword("user", "cristina1@barcelonaactiva.cat");

        WebElement liniaerror = driver.findElement(By.id("generate_success"));
        wait.until(ExpectedConditions.visibilityOf(liniaerror));

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/Users/nasrodo/SCRM8.png"));



    }
}
