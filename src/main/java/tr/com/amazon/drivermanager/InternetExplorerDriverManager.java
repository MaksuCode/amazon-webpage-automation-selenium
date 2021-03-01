package tr.com.amazon.drivermanager;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;

public class InternetExplorerDriverManager extends DriverManager{

    private InternetExplorerDriverService ieService ;

    @Override
    protected void startService() {
        if (ieService == null){
            try {
                ieService = new InternetExplorerDriverService.Builder()
                        .usingDriverExecutable(new File(getDriverPathName(DriverType.IEDRIVERSERVER)))
                        .usingAnyFreePort()
                        .build();
                ieService.start();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void stopService() {
        if (ieService != null && ieService.isRunning()){
            ieService.stop();
        }
    }

    @Override
    protected void createDriver() {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        InternetExplorerOptions options = new InternetExplorerOptions();
        capabilities.setCapability("se:ieOptions" , options );
        driver = new InternetExplorerDriver(ieService , capabilities);
    }
}
