package com.itnove.crm;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public RemoteWebDriver driver;
    public WebDriverWait wait;
    public Actions hover;
    public int timeOut = 13;

    @Before
    public void setUp() throws IOException {

        String browser = System.getProperty("browser");

        // aquests if són per poder definir per la terminal per quin navegador volem que passin els tests

        if(browser != null && browser.equalsIgnoreCase("chrome")) {

            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            System.setProperty("webdriver.chrome.driver", "src" + File.separator + "main" + File.separator + "resources" + File.separator + "chromedriver-macos");
            driver = new ChromeDriver(capabilities);

        } else {

            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
            System.setProperty("webdriver.gecko.driver", "src" + File.separator + "main" + File.separator + "resources" + File.separator + "geckodriver-macos");
            driver = new FirefoxDriver(capabilities);

        }

        wait = (new WebDriverWait(driver, timeOut));
        hover = new Actions(driver);

        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(timeOut, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(timeOut, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);

        driver.navigate().to("http://crm.votarem.lu/index.php?module=Users&action=Login");
        driver.manage().window().fullscreen();

    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
