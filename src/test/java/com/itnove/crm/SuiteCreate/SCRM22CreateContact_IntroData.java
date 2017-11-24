package com.itnove.crm.SuiteCreate;

import com.itnove.crm.BaseTest;
import com.itnove.crm.pages.loginPage.PageCreateContact;
import com.itnove.crm.pages.loginPage.PageDashboard;
import com.itnove.crm.pages.loginPage.PageLogin;
import org.junit.Test;

import java.io.IOException;


public class SCRM22CreateContact_IntroData extends BaseTest{

    @Test
    public void testApp() throws InterruptedException, IOException {

        PageLogin pageLogin = new PageLogin(driver);
        pageLogin.login("user", "bitnami");

        PageDashboard pageDashboard = new PageDashboard(driver);
        pageDashboard.createButtonClick(hover);
        pageDashboard.hoverAndClick(pageDashboard.createContact, hover);

        PageCreateContact pageCreateContact = new PageCreateContact(driver);
        pageCreateContact.fillInFields();







    }

}
