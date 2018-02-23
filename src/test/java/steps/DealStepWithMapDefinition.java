/*
package steps;

import cucumber.api.DataTable;
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

import java.util.List;
import java.util.Map;

import static java.lang.Thread.sleep;

public class DealStepWithMapDefinition {

    String titleHomePage=null;
    public static WebDriver driver;

    @Before
    public  void start() {
        System.setProperty("webdriver.gecko.driver","D:\\Automation\\CucumberProjectDirectories\\FreeCRMBDDFramework\\src\\test\\Resources\\geckodriver.exe");
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("marionette",true);
        driver=new FirefoxDriver(capabilities);
    }

    @Given("^User is already on Login Page$")
    public void user_already_login_page() throws InterruptedException
    {

        driver.get("https://www.freecrm.com");
        sleep(10000);
    }
    @When("^title of login page is Free CRM$")
    public void title_of_login_page_is_free_CRM()
    {
        String title1=driver.getTitle();
        System.out.println("Title is: "+title1);
        Assert.assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software",title1);
    }

    @Then("^user enters username and password$")
    public void user_enters_username_and_password(DataTable credntials){

       // Map<String,String> data=(Map<String,String> )credntials.asMaps(String.class,String.class);

        for(Map<String,String> data:credntials.asMaps(String.class,String.class)) {
            driver.findElement(By.name("username")).sendKeys(data.get("username"));
            driver.findElement(By.name("password")).sendKeys(data.get("password"));
        }

    }

    @Then("^user clicks on login button$")
    public void user_clicks_on_login_button() throws InterruptedException {
        WebElement loginBtn=driver.findElement(By.xpath(".//*[@type='submit']"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",loginBtn);
        sleep(15000);


    }

    @Then("^user is on home page$")
    public void user_is_on_home_page()  {
        String title=driver.getTitle();
        System.out.println("Home Page title is: "+title);
        Assert.assertEquals("CRMPRO",title);
    }

    @Then("^user moves to new deal page$")
    public void user_moves_to_new_deal_page() throws Throwable {
        WebElement fr = driver.findElement(By.name("mainpanel"));

        driver.switchTo().frame(fr);
        WebElement  contactMenu=driver.findElement(By.xpath("//a[contains(text(),'Deals')]"));
        Actions actions=new Actions(driver);
        actions.moveToElement(contactMenu).build().perform();
        driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
        sleep(5000);
    }

    @Then("^user enters deal deatils$")
    public void user_enters_deal_details(DataTable dealData) throws Throwable {

        for(Map<String,String> data:dealData.asMaps(String.class,String.class)) {
            driver.findElement(By.id("title")).sendKeys(data.get("title"));
            driver.findElement(By.id("amount")).sendKeys(data.get("amount"));
            driver.findElement(By.id("probability")).sendKeys(data.get("probability"));
            driver.findElement(By.id("commission")).sendKeys(data.get("commission"));
            driver.findElement(By.xpath(".//*[@value='Save']")).click();

            //Move to new deal page
            WebElement  contactMenu=driver.findElement(By.xpath("//a[contains(text(),'Deals')]"));
            Actions actions=new Actions(driver);
            actions.moveToElement(contactMenu).build().perform();
            driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
            sleep(5000);

        }

        List<List<String>> data=dealData.raw();


        sleep(10000);
    }

    @Then("^close the browser$")
    public void close_the_browser() throws Throwable {
        driver.close();

    }

}
*/
