package com.itnove.crm.pages.loginPage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PageSales {

    private WebDriver driver;
    public WebDriverWait wait;

    @FindBy (id = "actionLinkTop")
    public WebElement bulkActions;

    @FindBy (id = "delete_listview_top")
    public WebElement deleteButton;

    @FindBy (id = "listViewNextButton_top")
    public  WebElement properaFinestraViewAccounts;

    //*****************************

    public void chooseElementViewAccounts() {

        List<WebElement> viewAccountsRows = driver.findElements(By.xpath("id('MassUpdate')/div[3]/table[1]/tbody[1]/tr"));

        mainouterloop:
        for (int i = 1; i < (viewAccountsRows.size() + 1); i++) {

            List<WebElement> viewAccountsColumns = driver.
                    findElements(By.xpath("id('MassUpdate')/div[3]/table[1]/tbody[1]/tr[" + i + "]/td"));

            outerloop:
            for (int j = 1; j < (viewAccountsColumns.size() + 1); j++) {

                WebElement viewAccountsColumn = driver.
                        findElement(By.xpath("id('MassUpdate')/div[3]/table[1]/tbody[1]/tr[" + i + "]/td[" + j + "]"));

                if ((viewAccountsColumn.getAttribute("type")) != null) {

                    if (viewAccountsColumn.getAttribute("type").equals("name")) {

                        WebElement checkName = driver.
                                findElement(By.xpath("id('MassUpdate')/div[3]/table[1]/tbody[1]/tr[" + i + "]/td[" + j + "]/b/a"));

                        if (checkName.getText().contains("Poiuyt")) {
                            WebElement tickBoxChosenRow = driver.
                                    findElement(By.xpath("id('MassUpdate')/div[3]/table[1]/tbody[1]/" +
                                            "tr[" + i + "]/td" + j + "]/input"));
                            tickBoxChosenRow.click();
                            bulkActions.click();
                            deleteButton.click();

                            break mainouterloop;

                        } else {

                            break outerloop;
                        }
                    }
                }
            }
        }

        properaFinestraViewAccounts.click();

        //i li vull dir que torno a començar
    }
    public PageSales(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}