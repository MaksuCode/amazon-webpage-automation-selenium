package tr.com.amazon.pages.signinpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tr.com.amazon.pages.basepage.BasePage;
import tr.com.amazon.pages.mainpage.main.MainPage;


public class SignInPage extends BasePage {

    @FindBy(css = "div.a-row.a-spacing-base input")
    private WebElement mailAddressSpace ;

    @FindBy(css = "span.a-button-inner input")
    private WebElement countinueButton ;

    @FindBy(id = "ap_password")
    private WebElement passwordSpace ;

    @FindBy(id = "signInSubmit")
    private WebElement signInSubmitButton ;


//
//    private final By loginErrorMessage = new By.ByCssSelector("div.a-alert-content li span");
//    private final By loginWarningMessage = new By.ByCssSelector("div.a-section div.a-box.a-alert-error");
//    private final By loginWarningMessage2 = new By.ByCssSelector("div.a-section div.a-box.a-alert-warning");

    private String loginErrorMessageString = "Bu e-posta adresiyle bir hesap bulamıyoruz";

    public SignInPage() {
        PageFactory.initElements(driver , this);
    }

    public WebElement mailAddressSpace() {
        return mailAddressSpace;
    }

    public WebElement countinueButton() {
        return countinueButton;
    }

    public WebElement passwordSpace(){
        return passwordSpace;
    }



    public void setPassword(String password){
        click(passwordSpace);
        passwordSpace.clear();
        passwordSpace.sendKeys(password);
    }

    public MainPage clickSignInButton(){
        click(signInSubmitButton);
        return new MainPage();
    }

    public void clickCountinueButton(){
        click(countinueButton);
    }

    public void setMailAddress(String email){
        click(mailAddressSpace);
        mailAddressSpace.sendKeys(email);
    }



















    //    public WebElement getLoginWarningMessage() {
//        try {
//            return driver.findElement(loginWarningMessage);
//        }catch (NoSuchElementException nee){
//            return null;
//        }
//    }
//
//    public WebElement getLoginWarningMessage2() {
//        try {
//            return driver.findElement(loginWarningMessage2);
//        }catch (NoSuchElementException nee){
//            return null;
//        }
//    }
}
