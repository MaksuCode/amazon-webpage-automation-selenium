package tr.com.amazon.drivermanagers;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class FirefoxDriverManager extends DriverManager{

    private GeckoDriverService geckoDriver;


    @Override
    protected void startService() {
        if (geckoDriver == null){
            try {
                geckoDriver = new GeckoDriverService.Builder()
                        .usingDriverExecutable(new File("drivers/geckodriver.exe"))
                        .usingAnyFreePort()
                        .build();
                geckoDriver.start();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void stopService() {
        if (geckoDriver != null && geckoDriver.isRunning()){
            geckoDriver.stop();
        }

    }

    @Override
    protected void createDriver() {
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("test-type");
        capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS , options);
        driver = new FirefoxDriver(geckoDriver , capabilities);

    }
}
