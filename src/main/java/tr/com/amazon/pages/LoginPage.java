package tr.com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{

    private By mailAddressSpace = new By.ByCssSelector("div.a-row.a-spacing-base input");
    private By keepOnButton = new By.ByCssSelector("span.a-button-inner input");
    private By passwordSpace = By.id("ap_password");
    private By loginButton = By.id("signInSubmit") ;

    public WebElement getMailAddressSpace() {
        return driver.findElement(mailAddressSpace) ;
    }

    public WebElement getKeepOnButton() {
        return driver.findElement(keepOnButton);
    }

    public WebElement getPasswordSpace() {
        return driver.findElement(passwordSpace);
    }

    public WebElement getLoginButton() {
        return driver.findElement(loginButton);
    }
}
