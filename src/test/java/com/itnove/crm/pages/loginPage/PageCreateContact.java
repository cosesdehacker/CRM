package com.itnove.crm.pages.loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PageCreateContact {

    private WebDriver driver;
    public WebDriverWait wait;

    @FindBy(id = "SAVE")
    public WebElement saveButton;

    @FindBy(id = "salutation")
    public WebElement firstNameSalutation;

    @FindBy(id = "first_name")
    public WebElement firstName;

    @FindBy(id = "last_name")
    public WebElement lastName;

    @FindBy(id = "phone_work")
    public WebElement phoneWork;

    @FindBy(id = "phone_mobile")
    public WebElement phoneMobile;

    @FindBy(id = "title")
    public WebElement title;

    @FindBy(id = "department")
    public WebElement department;

    @FindBy(id = "account_name")
    public WebElement accountName;

    @FindBy(id = "phone_fax")
    public WebElement phoneFax;

    @FindBy(id = "Contacts0emailAddress0")
    public WebElement email;

    @FindBy(id = "primary_address_street")
    public WebElement primaryAddressStreet;

    @FindBy(id = "primary_address_city")
    public WebElement primaryAddressCity;

    @FindBy(id = "primary_address_state")
    public WebElement primaryAddressState;

    @FindBy(id = "primary_address_postalcode")
    public WebElement primaryAddressPostalcode;

    @FindBy(id = "primary_address_country")
    public WebElement primaryAddressCountry;

    @FindBy(id = "alt_address_street")
    public WebElement otherAddressStreet;

    @FindBy(id = "alt_address_city")
    public WebElement otherAddressCity;

    @FindBy(id = "alt_address_state")
    public WebElement otherAddressState;

    @FindBy(id = "alt_address_postalcode")
    public WebElement otherAddressPostalcode;

    @FindBy(id = "alt_address_country")
    public WebElement otherAddressCountry;

    @FindBy(id = "description")
    public WebElement description;

    @FindBy(xpath = "id(\"btn_clr_assigned_user_name\")/img[1]")
    public WebElement clearAssignedTo;

    @FindBy(id = "assigned_user_name")
    public WebElement assignedTo;

    @FindBy(id = "lead_source")
    public WebElement leadSource;

    @FindBy(id = "report_to_name")
    public WebElement reportsTo;

    @FindBy(id = "campaign_name")
    public WebElement campaign;

    //*****************************


    public void fillInFields() {

        firstNameSalutation.click();
        firstNameSalutation.sendKeys("Mrs");

        firstName.click();
        firstName.sendKeys("Cristina");

        lastName.click();
        lastName.sendKeys("Matthews");

        phoneWork.click();
        phoneWork.sendKeys("33-33333333");

        phoneMobile.click();
        phoneMobile.sendKeys("11-11111111");

        title.click();
        title.sendKeys("Dr.");

        department.click();
        department.sendKeys("Cardiology");

        accountName.click();
        accountName.sendKeys("Maria");

        phoneFax.click();
        phoneFax.sendKeys("44-44444444");

        email.click();
        email.sendKeys("cristina@barcelonaactiva.cat");

        primaryAddressStreet.click();
        primaryAddressStreet.sendKeys("Main Street, 14");

        primaryAddressCity.click();
        primaryAddressCity.sendKeys("Delaware");

        primaryAddressState.click();
        primaryAddressState.sendKeys("Ohaio");

        primaryAddressPostalcode.click();
        primaryAddressPostalcode.sendKeys("43015");

        primaryAddressCountry.click();
        primaryAddressCountry.sendKeys("USA");

        otherAddressStreet.click();
        otherAddressStreet.sendKeys("London Street, 17");

        otherAddressCity.click();
        otherAddressCity.sendKeys("Delaware");

        otherAddressState.click();
        otherAddressState.sendKeys("Ohaio");

        otherAddressPostalcode.click();
        otherAddressPostalcode.sendKeys("43015");

        otherAddressCountry.click();
        otherAddressCountry.sendKeys("USA");

        description.click();
        description.sendKeys("Description 1");

        clearAssignedTo.click();

        assignedTo.click();
        assignedTo.sendKeys("Administrator");

        leadSource.click();
        leadSource.sendKeys("conference");

        reportsTo.click();
        reportsTo.sendKeys("Sally");

        campaign.click();
        campaign.sendKeys("Ohaio Committee");

        saveButton.click();

    }

    public void recoverDataContactIntroContact() throws InterruptedException {

        firstName.click();
        firstName.sendKeys("Abcdefg");

        lastName.click();
        lastName.sendKeys("Hijklmn");

        saveButton.click();

    }

    public void fillInFieldsMandatoryFieldsIncorrect() throws InterruptedException {

        phoneWork.click();
        phoneWork.sendKeys("23-23223223");

        saveButton.click();

    }

    public void fillInFieldsMandatoryFieldsCorrect() throws InterruptedException {

        lastName.click();
        lastName.sendKeys("Puig");

        saveButton.click();

    }

    public PageCreateContact(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}