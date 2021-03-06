package tr.com.amazon.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tr.com.amazon.drivermanager.DriverInterface;
import java.util.List;

public class Locator implements DriverInterface {

    public WebElement findElementByLocator(String loc , LocatorType locatorType){
        WebElement element = null;
        try {
            switch (locatorType){
                case CSS :
                    element =driver.findElement(new By.ByCssSelector(loc));
                    break;
                case ID :
                    element = driver.findElement(By.id(loc));
                    break;
                case CLASS :
                    element = driver.findElement(By.className(loc));
                    break;
                case XPATH :
                    element = driver.findElement(By.xpath(loc));
                    break;
                case NAME :
                    element = driver.findElement(By.name(loc));
                    break;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return element;
    }

    public List<WebElement> findElementListByLocator(String loc , LocatorType locatorType){
        List<WebElement> elements = null;
        try {
            switch (locatorType){
                case CSS :
                    elements =driver.findElements(new By.ByCssSelector(loc));
                    break;
                case ID :
                    elements = driver.findElements(By.id(loc));
                    break;
                case CLASS :
                    elements = driver.findElements(By.className(loc));
                    break;
                case XPATH:
                    elements = driver.findElements(By.xpath(loc));
                    break;
                case NAME :
                    elements = driver.findElements(By.name(loc));
                    break;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return elements;
    }
}
