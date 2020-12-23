package tr.com.amazon.testrunner;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import tr.com.amazon.model.DriverManager;
import tr.com.amazon.model.DriverManagerFactory;
import tr.com.amazon.model.DriverType;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/"},
        glue = "cucumber.stepdefinitions",
        plugin = {"html:target/cucumber-html-report"},
        tags = "@LoginTest",
        stepNotifications = true)

public class TestRunner {

//    protected static WebDriver driver;
    private DriverManager driverManager ;
    public WebDriver driver ;


    @BeforeClass
    public void setUp(){

        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();

    }


    @AfterClass
    public void shutDown(){
        driverManager.quitDriver();
    }



}