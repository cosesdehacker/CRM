package com.itnove.crm;

import com.itnove.crm.pages.loginPage.PageDashboard;
import com.itnove.crm.pages.loginPage.PageLogin;
import org.junit.Test;

import java.io.IOException;

public class SCRM10Dash_Sales_opcionsDesplegable extends BaseTest {

    @Test
    public void testApp() throws InterruptedException, IOException {
        driver.navigate().to("http://crm.votarem.lu/index.php?module=Users&action=Login");
        driver.manage().window().fullscreen();

        PageLogin access = new PageLogin(driver);
        access.login("user", "bitnami");

        Thread.sleep(3000);

        PageDashboard pageDashboard = new PageDashboard(driver);
        pageDashboard.clickSalesDesplegable();




    }

}



