package com.itnove.crm.SuiteCreate;

import com.itnove.crm.BaseTest;
import com.itnove.crm.pages.loginPage.PageDashboard;
import com.itnove.crm.pages.loginPage.PageLogin;
import org.junit.Test;

import java.io.IOException;


public class SCRM21CreateAccount_RecoverData extends BaseTest{

    @Test
    public void testApp() throws InterruptedException, IOException {

        PageLogin pageLogin = new PageLogin(driver);
        pageLogin.login("user", "bitnami");


        //PageCreateAccount pageCreateAccount = new PageCreateAccount(driver);
        //pageCreateAccount.



    }

}
