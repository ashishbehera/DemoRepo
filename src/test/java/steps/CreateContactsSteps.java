/*
package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import util.DriverFactory;

import java.util.List;

import static java.lang.Thread.*;

public class CreateContactsSteps  {

    String titleHomePage=null;
    public static WebDriver driver;

    @Before
    public  void start() {
        System.setProperty("webdriver.gecko.driver","D:\\Automation\\CucumberProjectDirectories\\FreeCRMBDDFramework\\src\\test\\Resources\\geckodriver.exe");
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("marionette",true);
        driver=new FirefoxDriver(capabilities);
    }

    @When("^title of login page is Free CRM$")
    public void title_of_login_page_is_free_CRM()
    {
        String title1=driver.getTitle();
        System.out.println("Title is: "+title1);
        Assert.assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software",title1);
    }

    @Then("^user enters username as \\\"([^\\\"]*)\\\" and password as \\\"([^\\\"]*)\\\"$")
    public void user_enters_username_and_password(String username,String password){
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);

    }

    @Then("^user clicks on login button$")
    public void user_clicks_on_login_button() throws InterruptedException {
        WebElement loginBtn=driver.findElement(By.xpath(".//*[@type='submit']"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",loginBtn);
        sleep(5000);


    }

    @Then("^user is on home page$")
    public void user_is_on_home_page()  {
        String title=driver.getTitle();
        System.out.println("Home Page title is: "+title);
        Assert.assertEquals("CRMPRO",title);
    }



    @Given("^User is already on Login Page$")
    public void user_already_login_page() throws InterruptedException
    {

        driver.get("https://www.freecrm.com");
        sleep(10000);
    }

    @Given("^User is already on Home Page$")
    public void user_is_already_on_Home_Page() throws Throwable {
        String titleHomePage=driver.getTitle();
        System.out.println("Home Page title is: "+titleHomePage);
        Assert.assertEquals("CRMPRO",titleHomePage);
    }

    @When("^mouse over on contacts link$")
    public void mouse_over_on_contacts_link() throws Throwable {

        WebElement fr = driver.findElement(By.name("mainpanel"));

        driver.switchTo().frame(fr);
        WebElement  contactMenu=driver.findElement(By.xpath(".//*[@id='navmenu']/ul/li[4]/a"));
        Actions actions=new Actions(driver);
        actions.moveToElement(contactMenu).build().perform();
    }

    @Then("^user clicks on New Contact link$")
    public void user_clicks_on_New_Contact_link() throws Throwable {

    */
/*    WebElement fr = driver.findElement(By.name("mainpanel"));

        driver.switchTo().frame(fr);*//*

        driver.findElement(By.xpath(".//*[contains(@title,'New Contact')]")).click();
        sleep(5000);
    }

    @Then("^user enters firstname and lastname$")
    public void user_enters_firstname_and_lastname() throws Throwable {
        driver.findElement(By.id("first_name")).sendKeys("Ashish");
        driver.findElement(By.id("surname")).sendKeys("Behera");

    }

    @Then("^user clicks on save button$")
    public void user_clicks_on_save_button() throws Throwable {
        driver.findElement(By.xpath(".//*[@value='Save']")).click();
        sleep(5000);

    }

    @Then("^verify new contact created$")
    public void verify_new_contact_created() throws Throwable {
        List<WebElement> list= driver.findElements(By.xpath("//.[@class='tabs_header']"));
        String msgData=list.get(0).getText().trim().toString();
        System.out.println("Contact Header after save: "+msgData);
        Assert.assertEquals("Ashish Behera",msgData);


    }
    @Then("^close the browser$")
    public void close_the_browser() throws Throwable {
        //driver.close();

    }


    @Then("^user moves to new contact page$")
    public void user_moves_to_new_contact_page() throws Throwable {
        WebElement fr = driver.findElement(By.name("mainpanel"));

        driver.switchTo().frame(fr);
        WebElement  contactMenu=driver.findElement(By.xpath(".//*[@id='navmenu']/ul/li[4]/a"));
        Actions actions=new Actions(driver);
        actions.moveToElement(contactMenu).build().perform();
        driver.findElement(By.xpath(".//*[contains(@title,'New Contact')]")).click();
        sleep(5000);
    }

    @Then("^user enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_and_and(String firstname, String lastname, String position) throws Throwable {
        driver.findElement(By.id("first_name")).sendKeys(firstname);
        driver.findElement(By.id("surname")).sendKeys(lastname);
        driver.findElement(By.id("company_position")).sendKeys(position);
        driver.findElement(By.xpath(".//*[@value='Save']")).click();
        sleep(10000);



    }

    @After
    public  void stop()
    {
        driver.quit();
    }



}
*/
