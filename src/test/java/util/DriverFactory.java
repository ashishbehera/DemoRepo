package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverFactory {
    public static WebDriver driver;

    public static WebDriver initializeDriver()
    {
        if(driver==null)
        {
            System.setProperty("webdriver.gecko.driver","D:\\Automation\\CucumberProjectDirectories\\FreeCRMBDDFramework\\src\\test\\Resources\\geckodriver.exe");
            DesiredCapabilities capabilities=new DesiredCapabilities();
            capabilities.setCapability("marionette",true);
            driver=new FirefoxDriver(capabilities);
        }
        return driver;
    }

    public static WebDriver getDriver()
    {
        driver=initializeDriver();
        return driver;
    }


}
