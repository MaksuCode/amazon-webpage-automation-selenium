package tr.com.amazon.pages.basepage;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tr.com.amazon.drivermanager.DriverInterface;


public class BasePage implements DriverInterface {


    public BasePage() {
        PageFactory.initElements(driver , this);
    }

    public void click(WebElement element){
        try {
            WebDriverWait wait = new WebDriverWait(driver , 10);
            wait.until(ExpectedConditions.elementToBeClickable(element));
        }catch (Exception e){
            e.printStackTrace();
        }

        element.click();
    }

    public void wait(WebElement element){
        try {
            WebDriverWait wait = new WebDriverWait(driver , 10);
            wait.until(ExpectedConditions.elementToBeClickable(element));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
