package testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import tr.com.amazon.drivermanager.DriverInterface;
import tr.com.amazon.pages.mainpage.menu.MenuBar;

//@RunWith(Suite.class)
//@Suite.SuiteClasses({ Delivery_Location_Test_With_SignIn.class})
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


    @Test
    public void test(){
        MenuBar menuBar = new MenuBar();
        menuBar.clickHamburgerMenu();
    }








}