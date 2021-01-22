package tr.com.amazon.pages.mainpage.navigationbar.left;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tr.com.amazon.pages.basepage.BasePage;
import tr.com.amazon.pages.mainpage.main.MainPage;

/**
 * Left component of the navigation bar which is consisted of Amdzon Icon and Delivery Location.
 */
public class NavBarLeftComponent extends BasePage {

    @FindBy(id = "nav-logo")
    private WebElement amazonIcon;

    @FindBy(id = "nav-global-location-slot")
    private WebElement deliveryLocation ;

    /**
     * Clicks the delivery location
     * @return LocationSelectionPopUp
     */
    public LocationSelectionPopUp clickDeliveryLocation(){
        click(deliveryLocation);
        return new LocationSelectionPopUp();
    }

    /**
     * Clicks the Amazon Icon so that it directs user to main page
     * @return MainPage
     */
    public MainPage clickAmazonIcon(){
        click(amazonIcon);
        return new MainPage();
    }

    public WebElement amazonIcon() {
        return amazonIcon;
    }

    public WebElement deliveryLocation() {
        return deliveryLocation;
    }



}
