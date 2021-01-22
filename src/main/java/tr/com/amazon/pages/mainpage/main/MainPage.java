package tr.com.amazon.pages.mainpage.main;

import tr.com.amazon.pages.basepage.BasePage;
import tr.com.amazon.pages.mainpage.navigationbar.NavigationBar;

public class MainPage extends BasePage {

    private final NavigationBar navBar ;

    public MainPage() {
        super();
        this.navBar = new NavigationBar();
    }

    public NavigationBar navigationBar() {
        return navBar;
    }
}
