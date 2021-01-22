package tr.com.amazon.pages.mainpage.navigationbar.right;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tr.com.amazon.pages.basepage.BasePage;

/**
 * Right-side component of the navigation bar next to search box.
 */
public class NavBarRightComponent extends BasePage {

    private final LanguageSelectionBox languageSelectionBox;
    private final AccountAndListsBox accountAndListsBox ;

    @FindBy(id = "nav-orders")
    private WebElement returnsAndOrdersButton;

    @FindBy(id = "nav-cart-count")
    private WebElement cartOnNavBar;

    public NavBarRightComponent() {
        super();
        this.languageSelectionBox = new LanguageSelectionBox();
        this.accountAndListsBox = new AccountAndListsBox();
    }

    public LanguageSelectionBox languageSelectionBox() {
        return languageSelectionBox;
    }

    public AccountAndListsBox accountAndListsBox() {
        return accountAndListsBox;
    }

    public WebElement returnsAndOrdersButton() {
        return returnsAndOrdersButton;
    }

    public WebElement cartOnNavBar() {
        return cartOnNavBar;
    }

    //    @FindBy(css = "div.layoutToolbarPadding")
//    private WebElement signInBox;
}
