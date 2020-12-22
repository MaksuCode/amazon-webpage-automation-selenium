package tr.com.amazon.testrunner;

import io.cucumber.java.BeforeStep;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/"},
        glue = "cucumber.stepdefinitions",
        plugin = {"html:target/cucumber-html-report"},
        tags = "@LoginTest",
        stepNotifications = true)

public class TestRunner {

    protected static WebDriver driver;

    @BeforeClass
    public static void setUp(){

        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }



    @AfterClass
    public static void shutDown(){
//        driver.quit();
    }



}