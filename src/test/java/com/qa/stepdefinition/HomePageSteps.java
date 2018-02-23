package com.qa.stepdefinition;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class HomePageSteps extends TestBase {

    LoginPage loginPage;
    HomePage homePage;

    @Given("^user opens browser$")
    public void user_opens_browser() {
        TestBase.initization();
    }

    @Then("^user is on login page$")
    public void user_is_on_login_page() {
        loginPage = new LoginPage();
        String title = loginPage.validateLoginPageTitle();
        Assert.assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software", title);
    }

    @Then("^user logs into the application$")
    public void user_enters_username_and_password() {
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }

    @Then("^validate home page title$")
    public void validate_home_page_title() {
        String homeTitle = homePage.verifyHomePageTitle();
        Assert.assertEquals("CRMPRO", homeTitle);
    }

    @Then("^validate logged in username$")
    public void validate_logged_in_username() {
        boolean flag=homePage.verifyCorrectUserName();

        Assert.assertTrue(flag);
    }

}
