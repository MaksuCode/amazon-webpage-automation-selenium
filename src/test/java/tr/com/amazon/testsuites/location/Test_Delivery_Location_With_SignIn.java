package tr.com.amazon.testsuites.location;

import org.junit.Assert;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import tr.com.amazon.drivermanager.DriverType;
import tr.com.amazon.testsuites.BaseTest;

public class Test_Delivery_Location_With_SignIn extends BaseTest {


    @Test
    @Order(1)
    public void click_delivery_location_box(){
        locationSelectionPopUp =mainPage.navigationBar()
                .navBarLeftComponent()
                .clickDeliveryLocation();
    }

    @Test
    @Order(2)
    public void location_selection_popup_appears(){
        boolean isEnabled = locationSelectionPopUp.signInButton().isEnabled();
        Assert.assertTrue("Not ok!" , isEnabled);
    }

    @Test
    @Order(3)
    public void click_sign_in_button_on_location_popup(){
        signInPage = locationSelectionPopUp.clickSignInButton() ;
    }

    @Test
    @Order(4)
    public void see_sign_in_page(){
        boolean isEnabled = signInPage.mailAddressSpace().isEnabled();
        Assert.assertTrue("Not ok!" , isEnabled);
    }

    @Test
    @Order(5)
    public void set_mail_address(){
        signInPage.setMailAddress("mustafaksu4@gmail.com");
    }

    @Test
    @Order(6)
    public void click_countinue_button(){
        signInPage.clickCountinueButton();
    }

    @Test
    @Order(7)
    public void see_password_space(){
        boolean isEnabled = signInPage.passwordSpace().isEnabled();
        Assert.assertTrue("Not ok!" , isEnabled);
    }

    @Test
    @Order(8)
    public void set_password (){
        signInPage.setPassword("kara.OLUK54");
    }

    @Test
    @Order(9)
    public void t9_Click_sign_in_button_on_sign_in_page(){
        signInPage.clickSignInButton();
    }


}
