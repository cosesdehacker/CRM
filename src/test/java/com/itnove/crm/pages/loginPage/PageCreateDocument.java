package com.itnove.crm.pages.loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class PageCreateDocument {

    private WebDriver driver;
    public WebDriverWait wait;

    @FindBy(id = "SAVE")
    public WebElement saveButton;

    @FindBy(id = "filename_file")
    public WebElement fileName;

    @FindBy(id = "status_id")
    public WebElement statusID;

    @FindBy(id = "document_name")
    public WebElement documentName;

    @FindBy(xpath = "id(\"detailpanel_-1\")/div[1]/div[1]/div[6]/div[2]/input[1]")
    public WebElement revision;

    @FindBy(id = "template_type")
    public WebElement documentType;

    @FindBy(id = "is_template")
    public WebElement templateTick;

    @FindBy(id = "active_date")
    public WebElement publishDate;

    @FindBy(id = "exp_date")
    public WebElement expirationDate;

    @FindBy(id = "category_id")
    public WebElement category;

    @FindBy(id = "subcategory_id")
    public WebElement subcategory;

    @FindBy(id = "description")
    public WebElement description;

    @FindBy(xpath = "id(\"detailpanel_-1\")/div[1]/div[1]/div[23]/div[2]/input[1]")
    public WebElement relatedDoc;

    @FindBy(id = "related_doc_rev_id")
    public WebElement relatedDocumentRevision;

    @FindBy(id = "assigned_user_name")
    public WebElement assignedTo;

    //*****************************

    public void fillInFields() {

        /* CREATEDOCUMENTPAGEGUILLEM

        @FindBy(id = "filename_file")
    public WebElement filename;

    @FindBy(xpath = "(.//*[@id='SAVE'])[1]")
    public WebElement saveButton;

        public void browseFile(String name){
            filename.sendKeys(name);
        }

        public void saveDocument(){
            saveButton.click();
        }

    public CreateDocumentPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    CLASSE CREATEDOCUMENT GUILLEM

    @Test
    public void testApp() throws InterruptedException {

        CreateDocumentPage createDocumentPage = new CreateDocumentPage(driver);
        File file = new File("src" + File.separator + "main" + File.separator + "resources" + File.separator + "2-logo-B_activa.png");
        createDocumentPage.browseFile(file.getAbsolutePath());
        createDocumentPage.saveDocument();
     }
}
        */


        fileName.click();

        File file = new File("nasrodo" + File.separator + "Desktop" + File.separator + "documentA.docx");
        fileName.sendKeys(file.getAbsolutePath());


        statusID.click();
        statusID.sendKeys("active");

        documentName.click();
        documentName.sendKeys("Document A");

        revision.click();
        revision.sendKeys("2");

        documentType.click();
        documentType.sendKeys("EULA");

        templateTick.click();

        publishDate.click();
        publishDate.sendKeys("26/11/2017");

        expirationDate.click();
        expirationDate.sendKeys("26703/2018");

        category.click();
        category.sendKeys("Sales");

        subcategory.click();
        subcategory.sendKeys("Marketing collateral");

        description.click();
        description.sendKeys("Document about anything");

        relatedDoc.click();
        relatedDoc.sendKeys("Documento molon");

        relatedDocumentRevision.click();

        assignedTo.click();
        assignedTo.sendKeys("Cristina");

        saveButton.click();

    }

    public void recoverDataDocumentIntroDocument() throws InterruptedException {

        fileName.click();
        fileName.sendKeys("Lluisa");

        documentName.click();
        documentName.sendKeys("lluisa.wordpress.com");

        revision.click();
        revision.sendKeys("44-44444444");

        publishDate.click();
        publishDate.sendKeys("Delaware");

        saveButton.click();

    }

    public PageCreateDocument(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}