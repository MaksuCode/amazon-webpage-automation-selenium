package tr.com.amazon.drivermanager;

import org.openqa.selenium.WebDriver;

public interface DriverInterface {

    DriverManager driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
    WebDriver driver = driverManager.getDriver();




}
