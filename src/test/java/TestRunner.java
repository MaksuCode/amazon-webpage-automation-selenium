package tr.com.amazon.testrunner;



import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.openqa.selenium.WebDriver;
import tr.com.amazon.DriverInterface;
import tr.com.amazon.drivermanagers.DriverManager;
import tr.com.amazon.drivermanagers.DriverManagerFactory;
import tr.com.amazon.drivermanagers.DriverType;

@RunWith(Suite.class)
@Suite.SuiteClasses({Delivery_Location_Test_With_SignIn.class , Test2.class})
public class TestRunner implements DriverInterface {

    
    @BeforeClass
    public static void setUp(){
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
    }


    public static void tearDown(){
//        driverManager.quitDriver();
    }







}