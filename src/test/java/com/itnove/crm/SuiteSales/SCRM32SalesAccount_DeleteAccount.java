package com.itnove.crm.SuiteSales;

import com.itnove.crm.BaseTest;
import com.itnove.crm.pages.loginPage.PageCreateContact;
import com.itnove.crm.pages.loginPage.PageDashboard;
import com.itnove.crm.pages.loginPage.PageLogin;
import com.itnove.crm.pages.loginPage.PageSales;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;


public class SCRM32SalesAccount_DeleteAccount extends BaseTest{

    @Test
    public void testApp() throws InterruptedException, IOException {

        PageLogin pageLogin = new PageLogin(driver);
        pageLogin.login("user", "bitnami");

        PageDashboard pageDashboard = new PageDashboard(driver);
        pageDashboard.chooseFromSales("Accounts");

        PageSales pageSales = new PageSales(driver);
        pageSales.chooseElementViewAccounts(hover, "Poiuyt");

        //assert

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/Users/nasrodo/SCRM32.png"));


    }

}
