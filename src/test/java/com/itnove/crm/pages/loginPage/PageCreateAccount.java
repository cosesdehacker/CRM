package com.itnove.crm.pages.loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageCreateAccount {

    private WebDriver driver;
    public WebDriverWait wait;

    @FindBy(id = "SAVE")
    public WebElement saveButton;

    @FindBy(id = "name")
    public WebElement name;

    @FindBy(id = "phone_office")
    public WebElement phoneOffice;

    @FindBy(id = "website")
    public WebElement website;

    @FindBy(id = "phone_fax")
    public WebElement fax;

    @FindBy(id = "Accounts0emailAddress0")
    public WebElement email;

    @FindBy(id = "billing_address_street")
    public WebElement billingAddressStreet;

    @FindBy(id = "billing_address_city")
    public WebElement billingAddressCity;

    @FindBy(id = "billing_address_state")
    public WebElement billingAddressState;

    @FindBy(id = "billing_address_postalcode")
    public WebElement billingAddressPostalcode;

    @FindBy(id = "billing_address_country")
    public WebElement billingAddressCountry;

    @FindBy(id = "shipping_address_street")
    public WebElement shippingAddressStreet;

    @FindBy(id = "shipping_address_city")
    public WebElement shippingAddressCity;

    @FindBy(id = "shipping_address_state")
    public WebElement shippingAddressState;

    @FindBy(id = "shipping_address_postalcode")
    public WebElement shippingAddressPostalcode;

    @FindBy(id = "shipping_address_country")
    public WebElement shippingAddressCountry;

    @FindBy(id = "description")
    public WebElement description;

    @FindBy(id = "assigned_user_name")
    public WebElement assignedTo;

    @FindBy(id = "account_type")
    public WebElement type;

    @FindBy(id = "industry")
    public WebElement industry;

    @FindBy(id = "annual_revenue")
    public WebElement annualRevenue;

    @FindBy(id = "employees")
    public WebElement employees;

    @FindBy(id = "parent_name")
    public WebElement memberOf;

    @FindBy(id = "campaign_name")
    public WebElement campaign;

    //*****************************

    public void fillInFields() {

    name.click();
    name.sendKeys();

    phoneOffice.click();
    phoneOffice.sendKeys();

    website.click();
    website.sendKeys();

    fax.click();
    fax.sendKeys();

    email.click();
    email.sendKeys();

    billingAddressStreet.click();
    billingAddressStreet.sendKeys();

    billingAddressCity.click();
    billingAddressCity.sendKeys();

    billingAddressState.click();
    billingAddressState.sendKeys();

    billingAddressPostalcode.click();
    billingAddressPostalcode.sendKeys();

    billingAddressCountry.click();
    billingAddressCountry.sendKeys();

    shippingAddressStreet.click();
    shippingAddressStreet.sendKeys();

    shippingAddressCity.click();
    shippingAddressCity.sendKeys();

    shippingAddressState.click();
    shippingAddressState.sendKeys();

    shippingAddressPostalcode.click();
    shippingAddressPostalcode.sendKeys();

    shippingAddressCountry.click();
    shippingAddressCountry.sendKeys();

    description.click();
    description.sendKeys();

    assignedTo.click();
    assignedTo.sendKeys();

    type.click();
    type.sendKeys();

    industry.click();
    industry.sendKeys();

    annualRevenue.click();
    annualRevenue.sendKeys();

    employees.click();
    employees.sendKeys();

    memberOf.click();
    memberOf.sendKeys();

    campaign.click();
    campaign.sendKeys();

    saveButton.click();

    }

    public PageCreateAccount(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}