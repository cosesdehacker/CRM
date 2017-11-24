package com.itnove.crm.SuiteLogin;

import com.itnove.crm.BaseTest;
import com.itnove.crm.pages.loginPage.PageLogin;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SCRM1Login_CorrecteTest extends BaseTest {

    @Test
    public void testApp() throws InterruptedException {

        PageLogin pageLogin = new PageLogin(driver);
        pageLogin.login("user", "bitnami");
        Assert.assertTrue((driver.getCurrentUrl().equals("http://crm.votarem.lu/index.php?module=Home&action=index")));


    }
}
