package tr.com.amazon.drivermanager;

import org.openqa.selenium.WebDriver;

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

    protected String getDriverPathName(DriverType driverType){
        String osName = System.getProperty("os.name") ;
        String path = "drivers/" + driverType.name().toLowerCase() + "driver";
        if (osName.contains("WINDOWS")){
            path = path + ".exe" ;
        }
        return path ;
    }



}
