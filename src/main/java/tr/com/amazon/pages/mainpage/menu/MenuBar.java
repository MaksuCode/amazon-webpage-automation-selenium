package tr.com.amazon.pages.mainpage.menu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tr.com.amazon.pages.basepage.BasePage;
import tr.com.amazon.pages.mainpage.menu.hmenu.NavHamburgerMenu;

public class MenuBar extends BasePage {

    private NavMenu navMenu;

    @FindBy(id = "nav-hamburger-menu")
    private WebElement hamburgerMenu ;

    public NavMenu navMenu() {
        return navMenu;
    }

    public WebElement hamburgerMenu() {
        return hamburgerMenu;
    }


    public NavHamburgerMenu clickHamburgerMenu(){
        click(hamburgerMenu);
        return new NavHamburgerMenu();
    }
}
