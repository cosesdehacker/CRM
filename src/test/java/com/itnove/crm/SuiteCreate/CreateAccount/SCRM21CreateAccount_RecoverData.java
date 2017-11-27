package com.itnove.crm.SuiteCreate.CreateAccount;

import com.itnove.crm.BaseTest;
import com.itnove.crm.pages.loginPage.PageCreateAccount;
import com.itnove.crm.pages.loginPage.PageCreateContact;
import com.itnove.crm.pages.loginPage.PageDashboard;
import com.itnove.crm.pages.loginPage.PageLogin;
import org.junit.Test;

import java.io.IOException;


public class SCRM21CreateAccount_RecoverData extends BaseTest{

    @Test
    public void testApp() throws InterruptedException, IOException {

        PageLogin pageLogin = new PageLogin(driver);
        pageLogin.login("user", "bitnami");

        PageDashboard pageDashboard = new PageDashboard(driver);
        pageDashboard.createButtonClick(hover);
        pageDashboard.hoverAndClick(pageDashboard.createAccount, hover);

        PageCreateAccount pageCreateAccount = new PageCreateAccount(driver);
        pageCreateAccount.recoverDataAccountIntroAccount();

        pageDashboard.lupa("Poiuyt");

    }

}
