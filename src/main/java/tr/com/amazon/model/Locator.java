package tr.com.amazon.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tr.com.amazon.testrunner.TestRunner;
import java.util.List;

public class ElementLocator extends TestRunner {

    public WebElement findElementByLocator(String loc , ElementLocatorType locatorType){
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
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return element;
    }

    public List<WebElement> findElementListByLocator(String loc2 , ElementLocatorType locatorType){
        List<WebElement> elements = null;
        try {
            switch (locatorType){
                case CSS :
                    elements =driver.findElements(new By.ByCssSelector(loc2));
                    break;
                case ID :
                    elements = driver.findElements(By.id(loc2));
                    break;
                case CLASS :
                    elements = driver.findElements(By.className(loc2));
                    break;
                case XPATH: 
                    elements = driver.findElements(By.xpath(loc2));
                    break;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return elements;
    }
}
