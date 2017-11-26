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

    @FindBy(xpath = "id(\"btn_clr_assigned_user_name\")/img[1]")
    public WebElement assignedToClear;

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
        name.sendKeys("Lluisa");

        phoneOffice.click();
        phoneOffice.sendKeys("33-33333333");

        website.click();
        website.sendKeys("lluisa.wordpress.com");

        fax.click();
        fax.sendKeys("44-44444444");

        email.click();
        email.sendKeys("cristina@barcelonaactiva.cat");

        billingAddressStreet.click();
        billingAddressStreet.sendKeys("Main Street 14");

        billingAddressCity.click();
        billingAddressCity.sendKeys("Delaware");

        billingAddressState.click();
        billingAddressState.sendKeys("Ohaio");

        billingAddressPostalcode.click();
        billingAddressPostalcode.sendKeys("43015");

        billingAddressCountry.click();
        billingAddressCountry.sendKeys("USA");

        shippingAddressStreet.click();
        shippingAddressStreet.sendKeys("London Street 17");

        shippingAddressCity.click();
        shippingAddressCity.sendKeys("Delaware");

        shippingAddressState.click();
        shippingAddressState.sendKeys("Ohaio");

        shippingAddressPostalcode.click();
        shippingAddressPostalcode.sendKeys("43015");

        shippingAddressCountry.click();
        shippingAddressCountry.sendKeys("USA");

        description.click();
        description.sendKeys("Description 1");

        assignedToClear.click();

        assignedTo.click();
        assignedTo.sendKeys("Administrator");

        type.click();
        type.sendKeys("Parcel");

        industry.click();
        industry.sendKeys("Food");

        annualRevenue.click();
        annualRevenue.sendKeys("Average");

        employees.click();
        employees.sendKeys("30");

        memberOf.click();
        memberOf.sendKeys("Ohaio Committee");

        campaign.click();
        campaign.sendKeys("Ohaio Committee");

        saveButton.click();

    }

    public void recoverDataAccountIntroAccount() throws InterruptedException {

        name.click();
        name.sendKeys("Poiuyt");

        phoneOffice.click();
        phoneOffice.sendKeys("99-99999999");

        saveButton.click();

    }

    public PageCreateAccount(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}