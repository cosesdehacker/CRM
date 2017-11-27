package com.itnove.crm.SuiteCreate.CreateDocument;

import com.itnove.crm.BaseTest;
import com.itnove.crm.pages.loginPage.PageCreateDocument;
import com.itnove.crm.pages.loginPage.PageDashboard;
import com.itnove.crm.pages.loginPage.PageLogin;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;


public class SCRM30CreateDocument_MandatoryFields_Correcte extends BaseTest{

    @Test
    public void testApp() throws InterruptedException, IOException {

        PageLogin pageLogin = new PageLogin(driver);
        pageLogin.login("user", "bitnami");

        PageDashboard pageDashboard = new PageDashboard(driver);
        pageDashboard.createButtonClick(hover);
        pageDashboard.hoverAndClick(pageDashboard.createDocument, hover);

        PageCreateDocument pageCreateDocument = new PageCreateDocument(driver);
        File file = new File(File.separator + "Users" + File.separator + "nasrodo" + File.separator + "Desktop" + File.separator + "document B.docx");
        pageCreateDocument.browseFileName(file.getAbsolutePath());

        pageCreateDocument.fillInFieldsMandatoryFieldsCorrect();

        pageCreateDocument.saveDocument();

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/Users/nasrodo/SCRM30.png"));

    }

}
