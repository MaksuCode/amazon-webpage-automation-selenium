package tr.com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tr.com.amazon.model.ElementLocator;
import tr.com.amazon.testrunner.TestRunner;

public class BasePage extends TestRunner {

    private final By accepCookiesButton = By.id("sp-cc-accept");
    ElementLocator elementLocator = new ElementLocator();


    public WebElement getAccepCookiesButton() {
        return driver.findElement(accepCookiesButton);
    }
}
