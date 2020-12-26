package tr.com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {

    public By amazonIcon = By.id("nav-logo-sprites");
    private final By loginButton = new By.ByCssSelector("div.layoutToolbarPadding");
    private final By loginMessage = new By.ByCssSelector("div.nav-line-1-container span.nav-line-1");
    private final By hamburgerMenu = new By.ByCssSelector("div.nav-left a i");
    private final By mainNavBar = new By.ByCssSelector("div.nav-fill div.nav-progressive-content a");
    private final By cartCount = new By.ByCssSelector("a.nav-a div span.nav-cart-count");
    private final By searchDropDownBox = By.id("searchDropdownBox");
    private final By searchTextBox = By.id("twotabsearchtextbox");
    private final By goToCartButton = By.id("nav-cart-count");


    public WebElement getLoginButton() {
        return driver.findElement(loginButton);
    }

    public WebElement getAmazonIcon() {
        return driver.findElement(amazonIcon);
    }

    public WebElement getLoginMessage() {
        return driver.findElement(loginMessage);
    }

    public WebElement getHamburgerMenu() {
        return driver.findElement(hamburgerMenu);
    }

    public List<WebElement> getMainNavBarElements() {
        return driver.findElements(mainNavBar) ;
    }

    public WebElement getCartCount() {
        return driver.findElement(cartCount);
    }

    public WebElement getsearchDropDownBox() {
        return driver.findElement(searchDropDownBox);
    }

    public WebElement getSearchTextBox() {
        return driver.findElement(searchTextBox);
    }
}


