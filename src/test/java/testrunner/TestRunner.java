package testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import tests.Changing_Language_On_Main_Page;
import tr.com.amazon.drivermanager.DriverInterface;

@RunWith(Suite.class)
@Suite.SuiteClasses({ Changing_Language_On_Main_Page.class})
public class TestRunner implements DriverInterface {


    @BeforeClass
    public static void setUp(){
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
    }


    @AfterClass
    public static void tearDown(){
//        driverManager.quitDriver();
    }








}