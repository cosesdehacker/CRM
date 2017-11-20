package com.itnove.crm;

import com.itnove.crm.pages.loginPage.PageLogin;
import org.junit.Assert;
import org.junit.Test;

public class SCRM1Login_CorrecteTest extends BaseTest {

    @Test
    public void testApp() throws InterruptedException {

        driver.navigate().to("http://crm.votarem.lu/index.php?module=Users&action=Login");
        PageLogin access = new PageLogin(driver);
        access.ValidValid();

        Thread.sleep(6000);
        Assert.assertTrue((driver.getCurrentUrl().equals("http://crm.votarem.lu/index.php?module=Home&action=index")));

    }
}
