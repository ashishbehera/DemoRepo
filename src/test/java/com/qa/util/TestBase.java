package com.qa.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public  static WebDriver driver;
    public static Properties prop;

    public TestBase()
    {
        try
        {
            prop = new Properties();
            FileInputStream fis =new FileInputStream("D:\\Automation\\CucumberProjectDirectories\\FreeCRMBDDFramework\\src\\test\\java\\com\\qa\\config\\config.properties");
            prop.load(fis);

        }catch (IOException ex)
        {
            ex.getMessage();
        }
    }

    public static void initization()
    {
        String broswerName=prop.getProperty("browser");

        if(broswerName.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","D:\\Automation\\CucumberProjectDirectories\\FreeCRMBDDFramework\\src\\test\\Resources\\chromedriver.exe");
            driver = new ChromeDriver();
        }else if(broswerName.equalsIgnoreCase("FF"))
        {
            System.setProperty("webdriver.gecko.driver","D:\\Automation\\CucumberProjectDirectories\\FreeCRMBDDFramework\\src\\test\\Resources\\geckodriver.exe");
            DesiredCapabilities capabilities=new DesiredCapabilities();
            capabilities.setCapability("marionette",true);
            driver = new FirefoxDriver(capabilities);

        }

       // driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);

        driver.get(prop.getProperty("url"));

    }


}
