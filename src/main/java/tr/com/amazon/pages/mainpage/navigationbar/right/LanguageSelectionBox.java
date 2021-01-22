package tr.com.amazon.pages.mainpage.navigationbar.right;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import tr.com.amazon.pages.basepage.BasePage;

public class LanugageSelectionBox extends BasePage {

    @FindBy(id = "icp-nav-flyout")
    private WebElement itSelf;

    @FindAll(FindBy())

    public void hoverOverItSelf(){
        Actions actions = new Actions(driver);
        actions.moveToElement(itSelf).perform();
    }
}
