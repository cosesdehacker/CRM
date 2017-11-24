package com.itnove.crm.SuiteDashboard;

import com.itnove.crm.BaseTest;
import com.itnove.crm.pages.loginPage.PageDashboard;
import com.itnove.crm.pages.loginPage.PageLogin;
import org.junit.Test;

import java.io.IOException;

public class SCRM14Dash_Collaboration_opcionsDesplegable extends BaseTest {

    @Test
    public void testApp() throws InterruptedException, IOException {

        PageLogin pageLogin = new PageLogin(driver);
        pageLogin.login("user", "bitnami");

        Thread.sleep(3000);

        PageDashboard pageDashboard = new PageDashboard(driver);
        pageDashboard.clickCollaborationDesplegable();




    }

}



