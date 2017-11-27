package com.itnove.crm.pages.loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PageCreateDocument {

    private WebDriver driver;
    public WebDriverWait wait;

    @FindBy(id = "filename_file")
    public WebElement fileName;

    @FindBy(id = "SAVE")
    public WebElement saveButton;

    @FindBy(xpath = "id(\"detailpanel_-1\")/div[1]/div[1]/div[6]/div[2]/input")
    public WebElement revision;

    @FindBy(id = "template_type")
    public WebElement templateType;

    @FindBy(id = "is_template")
    public WebElement templateTick;

    @FindBy(id = "active_date")
    public WebElement publishDate;

    @FindBy(id = "exp_date")
    public WebElement expirationDate;

    @FindBy(id = "category_id")
    public WebElement categoria;

    @FindBy(id = "subcategory_id")
    public WebElement subcategoria;

    @FindBy(id = "description")
    public WebElement description;

    @FindBy(xpath = "id(\"detailpanel_-1\")/div[1]/div[1]/div[23]/div[2]/input[3]")
    public WebElement relatedDoc;

    @FindBy(id = "related_doc_rev_id")
    public WebElement relatedDocumentRevision;

    @FindBy(id = "assigned_user_name")
    public WebElement assignedTo;

    //*****************************



    public void browseFileName(String nom){

        fileName.sendKeys(nom);
    }

    public void fillInFields() throws InterruptedException {

        List<WebElement> opcionsStatusDropdown = driver.findElements(By.xpath("//*[@id=\"status_id\"]/option"));

        for (int i = 1; i < (opcionsStatusDropdown.size()+1); i++) {
            WebElement opcioStatus =
                    driver.findElement(
                            By.xpath("//*[@id=\"status_id\"]/option[" + i + "]"));
            if (opcioStatus.getAttribute("value").equals("Draft")) {

                opcioStatus.click();

            }
        }

        revision.click();
        revision.clear();
        revision.sendKeys("2");

        templateType.click();

        List<WebElement> opcionsDocumentTypeDropdown = driver.findElements(By.xpath("id('template_type')/option"));

        outerloop:

        for (int i =1; i < opcionsDocumentTypeDropdown.size()+1; i++) {

            WebElement opcioDocumentType =
                    driver.findElement(By.xpath("id('template_type')/option[" + i + "]"));

            if (opcioDocumentType.getAttribute("value").equalsIgnoreCase("EULA")) {
                opcioDocumentType.click();
                break outerloop;
            }

        }

        templateTick.click();

        publishDate.click();
        publishDate.clear();
        publishDate.sendKeys("2017-11-26");

        expirationDate.click();
        expirationDate.clear();
        expirationDate.sendKeys("2018-03-26");

        categoria.click();

        List<WebElement> opcionsCategoryDropdown = driver.findElements(By.xpath("id('category_id')/option"));

        System.out.println(opcionsCategoryDropdown.size());

        outlooper:
        for (int i = 1; i < (opcionsCategoryDropdown.size()+1); i++) {
            WebElement opcioCategory = driver.findElement(By.xpath("id(\"category_id\")/option[" + i + "]"));
            if (opcioCategory.getAttribute("value").equalsIgnoreCase("Knowledege Base")) {

                opcioCategory.click();
                break outlooper;
            }
        }

        subcategoria.click();

        List<WebElement> opcionsSubcategoryDropdown = driver.findElements(By.xpath("id('subcategory_id')/option"));

        System.out.println(opcionsSubcategoryDropdown.size());

        outlooper:
        for (int i = 1; i < (opcionsSubcategoryDropdown.size()+1); i++) {
            WebElement opcioSubcategory = driver.findElement(By.xpath("id(\"subcategory_id\")/option[" + i + "]"));
            if (opcioSubcategory.getAttribute("value").equalsIgnoreCase("Marketing collateral")) {

                opcioSubcategory.click();
                break outlooper;
            }

        }

        description.click();
        description.sendKeys("Document about anything");

        assignedTo.click();
        assignedTo.clear();
        assignedTo.sendKeys("Cristina");


    }

    public void fillInFieldsMandatoryFieldsCorrect() throws InterruptedException {

        revision.click();
        revision.clear();
        revision.sendKeys("3");

        publishDate.click();
        publishDate.clear();
        publishDate.sendKeys("2017-11-21");

    }

    public void fillInFieldsMandatoryFieldsIncorrect() throws InterruptedException {

        description.click();
        description.sendKeys("Anything");

    }

    public void browseRelatedDocName(String nom) throws InterruptedException {

        relatedDoc.sendKeys(nom);

        Thread.sleep(6000);
    }

    public void saveDocument(){

        saveButton.click();
    }


    public PageCreateDocument(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}