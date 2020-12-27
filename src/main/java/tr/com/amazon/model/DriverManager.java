package tr.com.amazon.model;

import org.openqa.selenium.WebDriver;
import tr.com.amazon.testrunner.TestRunner;

public abstract class DriverManager extends TestRunner {

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
            logger.info("Driver started...");

        }
        return driver;
    }

}
