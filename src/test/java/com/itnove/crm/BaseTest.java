package com.itnove.crm;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class BaseTest {
    public RemoteWebDriver driver;
    public WebDriverWait wait;
    public Actions hover;

    @Before
    public void setUp() throws IOException {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        System.setProperty("webdriver.chrome.driver", "src" + File.separator + "main" + File.separator + "resources" + File.separator + "chromedriver-macos");
        driver = new ChromeDriver(capabilities);
        //DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        //System.setProperty("webdriver.gecko.driver", "src" + File.separator + "main" + File.separator + "resources" + File.separator + "geckodriver-macos");
        //driver = new FirefoxDriver(capabilities);
        wait = (new WebDriverWait(driver, 10));
        hover = new Actions(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
