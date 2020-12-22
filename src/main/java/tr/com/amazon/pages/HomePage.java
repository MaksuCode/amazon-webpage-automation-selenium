package tr.com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public By amazonIcon = By.id("nav-logo-sprites");
    private By loginButton = new By.ByCssSelector("div.layoutToolbarPadding");



    public WebElement getLoginButton() {
        return driver.findElement(loginButton);
    }

    public WebElement getAmazonIcon() {
        return driver.findElement(amazonIcon);
    }
}


