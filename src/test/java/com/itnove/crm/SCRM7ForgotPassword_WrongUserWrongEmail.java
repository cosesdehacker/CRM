package com.itnove.crm;

import com.itnove.crm.pages.loginPage.PageForgotPassword;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.io.IOException;

public class SCRM7ForgotPassword_WrongUserWrongEmail extends BaseTest {

    @Test
    public void testApp() throws InterruptedException, IOException {
        driver.navigate().to("http://crm.votarem.lu/index.php?module=Users&action=Login");
        PageForgotPassword recover = new PageForgotPassword(driver);
        recover.forgotPassword("user1", "cristina1@barcelonaactiva.cat");

        WebElement liniaerror = driver.findElement(By.id("generate_success"));
        wait.until(ExpectedConditions.visibilityOf(liniaerror));

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/Users/nasrodo/SCRM7.png"));



    }
}
