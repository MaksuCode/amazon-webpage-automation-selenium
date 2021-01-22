package tr.com.amazon.pages.mainpage.navigationbar;

import tr.com.amazon.pages.basepage.BasePage;
import tr.com.amazon.pages.mainpage.navigationbar.down.NavBarLowerComponent;
import tr.com.amazon.pages.mainpage.navigationbar.left.NavBarLeftComponent;
import tr.com.amazon.pages.mainpage.navigationbar.right.NavBarRightComponent;
import tr.com.amazon.pages.mainpage.navigationbar.search.NavBarSearchBox;

/**
 * Navigation bar on the page. Separated into 4 main components.
 */
public class NavigationBar extends BasePage {

    private final NavBarSearchBox navBarSearchBox;
    private final NavBarLeftComponent navBarLeftComponent;
    private final NavBarRightComponent navBarRightComponent;
    private final NavBarLowerComponent navBarLowerComponent;

    public NavigationBar() {
        super();
        this.navBarSearchBox = new NavBarSearchBox();
        this.navBarLeftComponent = new NavBarLeftComponent();
        this.navBarRightComponent = new NavBarRightComponent();
        this.navBarLowerComponent = new NavBarLowerComponent();
    }

    public NavBarSearchBox navBarSearchBox() {
        return navBarSearchBox;
    }

    public NavBarLeftComponent navBarLeftComponent() {
        return navBarLeftComponent;
    }

    public NavBarRightComponent navBarRightComponent() {
        return navBarRightComponent;
    }

    public NavBarLowerComponent navBarLowerComponent() {
        return navBarLowerComponent;
    }
}
