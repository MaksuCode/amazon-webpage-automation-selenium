package tr.com.amazon.model;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import tr.com.amazon.drivermanager.DriverInterface;

import java.io.File;

public class ScreenShotTaker implements DriverInterface {

    public static void takeScreenShot(){
        try {
            File file = ((TakesScreenshot) DriverInterface.driver).getScreenshotAs(OutputType.FILE);
            String fileFolder = "./Snap/" ;
            File f = new File(fileFolder + "jpeg");
            FileUtils.copyFile(file , new File(f.getPath()));
            System.out.println(DriverInterface.driver.getCurrentUrl());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
