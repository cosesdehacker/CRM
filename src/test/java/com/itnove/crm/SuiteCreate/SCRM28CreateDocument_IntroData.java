package com.itnove.crm.SuiteCreate;

import com.itnove.crm.BaseTest;
import com.itnove.crm.pages.loginPage.PageCreateAccount;
import com.itnove.crm.pages.loginPage.PageCreateDocument;
import com.itnove.crm.pages.loginPage.PageDashboard;
import com.itnove.crm.pages.loginPage.PageLogin;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;


public class SCRM28CreateDocument_IntroData extends BaseTest{

    @Test
    public void testApp() throws InterruptedException, IOException {

        PageLogin pageLogin = new PageLogin(driver);
        pageLogin.login("user", "bitnami");

        PageDashboard pageDashboard = new PageDashboard(driver);
        pageDashboard.createButtonClick(hover);
        pageDashboard.hoverAndClick(pageDashboard.createDocument, hover);

        PageCreateDocument pageCreateDocument = new PageCreateDocument(driver);
        pageCreateDocument.fillInFields();

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/Users/nasrodo/SCRM28.png"));



    }

}
