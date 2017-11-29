package com.itnove.crm.pages.loginPage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

    @FindBy (xpath = "//*[@id=\"pagination\"]/td/table/tbody/tr/td[3]/div")
    public WebElement numberPage;

    //*****************************

    public void chooseElementViewAccounts(Actions hover, String textCerca) throws InterruptedException {

        int counter = 0;
        boolean continuar = true;

        while (continuar) {

            counter++;

            List<WebElement> viewAccountsRows = driver.findElements(By.xpath("id('MassUpdate')/div[3]/table[1]/tbody[1]/tr"));

            mainouterloop:
            for (int i = 1; i < (viewAccountsRows.size() + 1); i++) {

                System.out.println("La pàgina" + counter + "té" + viewAccountsRows.size() + "files"); //

                List<WebElement> viewAccountsColumns = driver.
                        findElements(By.xpath("id('MassUpdate')/div[3]/table[1]/tbody[1]/tr[" + i + "]/td"));

                System.out.println("aquesta és la vegada número" + i + "que passo pel primer for"); //


                outerloop:
                for (int j = 1; j < (viewAccountsColumns.size() + 1); j++) {

                    System.out.println("La fila" + i + "té" + viewAccountsColumns.size() + "columnes"); //
                    System.out.println("aquesta és la vegada número" + i + "/" + j + "que passo pel segon for en la pàgina" + counter); //

                    WebElement viewAccountsColumn = driver.
                            findElement(By.xpath("id('MassUpdate')/div[3]/table[1]/tbody[1]/tr[" + i + "]/td[" + j + "]"));

                    if ((viewAccountsColumn.getAttribute("type")) != null) {

                        System.out.println("Aquest type no era null");

                        if (viewAccountsColumn.getAttribute("type").equals("name")) {

                            System.out.println("Aquest type es deia name");

                            WebElement checkName = driver.
                                    findElement(By.xpath("id('MassUpdate')/div[3]/table[1]/tbody[1]/tr[" + i + "]/td[" + j + "]/b/a"));

                            if (checkName.getText().contains(textCerca)) {

                                System.out.println("HE TROBAT EL NOM QUE CERCAVA!!!!!!!!!!!");
                                Thread.sleep(4000);

                                WebElement tickBoxChosenRow = driver.
                                        findElement(By.xpath("id('MassUpdate')/div[3]/table[1]/tbody[1]/" +
                                                "tr[" + i + "]/td[1]/input"));
                                tickBoxChosenRow.click();
                                Thread.sleep(4000);
                                bulkActions.click();
                                Thread.sleep(4000);

                                // ho fa tot fins aquí, però aleshores:
                                // 2 x (1511949978859	Marionette	DEBUG	Canceled page load listener because no navigation has been detected
                                //i no surt del bucle while tot i el canvi de boolean
                                hover.moveToElement(deleteButton).click().build().perform();
                                Thread.sleep(4000);

                                continuar = false;

                            } else {

                                System.out.println("Ara trenco el outerloop");

                                break outerloop;
                            }
                        }
                    }
                }
            }

            if (!properaFinestraViewAccounts.isEnabled()) {

                System.out.println("No em queden opcions per mirar");
                continuar = false;

            } else {

                System.out.println("Ara clico a la propera finestra");
                properaFinestraViewAccounts.click();
                Thread.sleep(8000);
            }

        }
    }

    public PageSales(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}