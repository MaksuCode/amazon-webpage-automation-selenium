package tr.com.amazon.pages.mainpage.menu.hmenu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tr.com.amazon.pages.basepage.BasePage;
import tr.com.amazon.pages.mainpage.menu.hmenu.DigitalContentAndDevices;
import tr.com.amazon.pages.mainpage.menu.hmenu.HelpAndSettings;
import tr.com.amazon.pages.mainpage.menu.hmenu.ProgramsAndFeatures;
import tr.com.amazon.pages.mainpage.menu.hmenu.ShopByDepartment;
import tr.com.amazon.pages.signinpage.SignInPage;

public class NavHamburgerMenu extends BasePage {

    @FindBy(id = "hmenu-customer-profile")
    private WebElement hmenuCustomerProfile;

    private DigitalContentAndDevices digitalContentAndDevices ;
    private ShopByDepartment shopByDepartment;
    private ProgramsAndFeatures programsAndFeatures ;
    private HelpAndSettings helpAndSettings ;

    public DigitalContentAndDevices digitalContentAndDevices() {
        return digitalContentAndDevices;
    }

    public ShopByDepartment shopByDepartment() {
        return shopByDepartment;
    }

    public ProgramsAndFeatures programsAndFeatures() {
        return programsAndFeatures;
    }

    public HelpAndSettings helpAndSettings() {
        return helpAndSettings;
    }

    public WebElement hmenuCustomerProfile() {
        return hmenuCustomerProfile;
    }

    public SignInPage clickHmenuCustomerProfile(){
        click(hmenuCustomerProfile);
        return new SignInPage();
    }
}
