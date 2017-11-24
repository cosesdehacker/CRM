package com.itnove.crm.SuiteDashboard;

import com.itnove.crm.BaseTest;
import com.itnove.crm.pages.loginPage.PageDashboard;
import com.itnove.crm.pages.loginPage.PageLogin;
import org.junit.Test;

import java.io.IOException;

public class SCRM10Dash_Sales_opcionsDesplegable extends BaseTest {

    @Test
    public void testApp() throws InterruptedException, IOException {

        PageLogin access = new PageLogin(driver);
        access.login("user", "bitnami");

        Thread.sleep(3000);

        PageDashboard pageDashboard = new PageDashboard(driver);
        pageDashboard.clickSalesDesplegable();




    }

}



