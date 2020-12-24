package tr.com.amazon.testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import tr.com.amazon.model.DriverManager;
import tr.com.amazon.model.DriverManagerFactory;
import tr.com.amazon.model.DriverType;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/"},
        glue = "cucumber.stepdefinitions",
        plugin = {"html:target/cucumber-html-report"},
        tags = "@Add_Product_To_Basket",
        stepNotifications = true,
         publish = true)

public class TestRunner {

    private static DriverManager driverManager ;
    public static WebDriver driver ;

    @BeforeClass
    public static void setUp(){
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
    }


    @After
    public void shutDown(){
        driverManager.quitDriver();
    }



}