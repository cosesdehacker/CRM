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

    @FindBy(id = "assigned_user_name")
    public WebElement assignedTo;

    @FindBy(id = "lead_source")
    public WebElement leadSource;

    @FindBy(id = "report_to_name")
    public WebElement reportsTo;

    @FindBy(id = "campaign")
    public WebElement campaign;

    //*****************************


    public void fillInFields() {

        firstNameSalutation.click();
        firstNameSalutation.sendKeys();

        firstName.click();
        firstName.sendKeys("Maria");

        lastName.click();
        lastName.sendKeys();

        phoneWork.click();
        phoneWork.sendKeys();

        phoneMobile.click();
        phoneMobile.sendKeys();

        title.click();
        title.sendKeys();

        department.click();
        department.sendKeys();

        accountName.click();
        accountName.sendKeys();

        phoneFax.click();
        phoneFax.sendKeys();

        email.click();
        email.sendKeys();

        primaryAddressStreet.click();
        primaryAddressStreet.sendKeys();

        primaryAddressCity.click();
        primaryAddressCity.sendKeys();

        primaryAddressState.click();
        primaryAddressState.sendKeys();

        primaryAddressPostalcode.click();
        primaryAddressPostalcode.sendKeys();

        primaryAddressCountry.click();
        primaryAddressCountry.sendKeys();

        otherAddressStreet.click();
        otherAddressStreet.sendKeys();

        otherAddressCity.click();
        otherAddressCity.sendKeys();

        otherAddressState.click();
        otherAddressState.sendKeys();

        otherAddressPostalcode.click();
        otherAddressPostalcode.sendKeys();

        otherAddressCountry.click();
        otherAddressCountry.sendKeys();

        description.click();
        description.sendKeys();

        assignedTo.click();
        assignedTo.sendKeys();

        leadSource.click();
        leadSource.sendKeys();

        reportsTo.click();
        reportsTo.sendKeys();

        campaign.click();
        campaign.sendKeys();

        saveButton.click();

        }



    public PageCreateContact(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}