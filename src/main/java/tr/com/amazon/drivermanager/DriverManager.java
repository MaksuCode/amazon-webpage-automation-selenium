package tr.com.amazon.drivermanagers;

import org.openqa.selenium.WebDriver;
import tr.com.amazon.DriverInterface;

public abstract class DriverManager implements DriverInterface {

    protected WebDriver driver;
    protected abstract void startService();
    protected abstract void stopService();
    protected abstract void createDriver();

    public void quitDriver() {
        if (null != driver) {
            driver.quit();
            driver = null;
        }
    }

    public WebDriver getDriver() {
        if (null == driver) {
            startService();
            createDriver();
        }
        return driver;
    }

}
