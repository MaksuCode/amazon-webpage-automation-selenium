package tr.com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import sun.awt.windows.WEmbeddedFrame;

public class LoginPage extends BasePage{

    private final By mailAddressSpace = new By.ByCssSelector("div.a-row.a-spacing-base input");
    private final By keepOnButton = new By.ByCssSelector("span.a-button-inner input");
    private final By passwordSpace = By.id("ap_password");
    private final By loginButton = By.id("signInSubmit") ;
    private final By loginErrorMessage = new By.ByCssSelector("div.a-alert-content li span");
    private final By loginWarningMessage = new By.ByCssSelector("div.a-section div.a-box.a-alert-error");
    private final By loginWarningMessage2 = new By.ByCssSelector("div.a-section div.a-box.a-alert-warning");

    private String loginErrorMessageString = "Bu e-posta adresiyle bir hesap bulamıyoruz";

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

    public WebElement getLoginErrorMessage() {
        return driver.findElement(loginErrorMessage);
    }

    public String getLoginErrorMessageString() {
        return loginErrorMessageString;
    }

    public WebElement getLoginWarningMessage() {
        try {
            return driver.findElement(loginWarningMessage);
        }catch (NoSuchElementException nee){
            return null;
        }
    }

    public WebElement getLoginWarningMessage2() {
        try {
            return driver.findElement(loginWarningMessage2);
        }catch (NoSuchElementException nee){
            return null;
        }
    }
}
