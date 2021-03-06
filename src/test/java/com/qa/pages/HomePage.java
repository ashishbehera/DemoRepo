package com.qa.pages;

import com.qa.util.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    @FindBy(xpath="//td[contains(text(),'User: Naveen K')]")
    WebElement userNameLabel;

    @FindBy(xpath="//a[contains(text(),'Contacts')]")
    WebElement contactsLink;

    @FindBy(xpath="//a[contains(text(),'New Contact')]")
    WebElement newContactLink;

    @FindBy(xpath="//a[contains(text(),'Deals')]")
    WebElement dealsLink;

    @FindBy(xpath="//a[contains(text(),'Tasks')]")
    WebElement tasksLink;

    //Initializing the Page Objects
    public HomePage()
    {
        PageFactory.initElements(driver,this);
    }

    public String verifyHomePageTitle()
    {
        return  driver.getTitle();
    }

    public boolean verifyCorrectUserName()
    {
        return userNameLabel.isDisplayed();
    }

    public  void clickOnNewContactLink()
    {
        Actions action=new Actions(driver);

        action.moveToElement(contactsLink).build().perform();
        newContactLink.click();

    }












}
