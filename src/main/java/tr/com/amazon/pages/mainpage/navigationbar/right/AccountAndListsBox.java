package tr.com.amazon.pages.mainpage.navigationbar.right;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import tr.com.amazon.pages.basepage.BasePage;
import tr.com.amazon.pages.signinpage.SignInPage;


public class AccountAndListsBox extends BasePage {

    @FindBy(id = "nav-link-accountList")
    private WebElement itself ;

    public AccountAndListsBox() {
        super();
    }

    public SignInPage clickItself(){
        click(itself);
        return new SignInPage();
    }

    public AccountAndListsPopUp hoverItSelf() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(itself).perform();
        Thread.sleep(10000);
        return new AccountAndListsPopUp();
    }

}
