package tests;

import org.junit.Assert;
import org.junit.FixMethodOrder;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Delivery_Location_Test_With_SignIn extends BaseTest{



    @org.junit.Test
//    @Order(1)
    public void t1_Click_delivery_location_box(){
        locationSelectionPopUp =mainPage.navigationBar()
                .navBarLeftComponent()
                .clickDeliveryLocation();
    }

    @org.junit.Test
//    @Order(2)
    public void t2_Location_selection_popup_appears(){
        boolean isEnabled = locationSelectionPopUp.signInButton().isEnabled();
        Assert.assertTrue("Not ok!" , isEnabled);
    }

    @org.junit.Test
//    @Order(3)
    public void t3_Click_sign_in_button_on_location_popup(){
        signInPage = locationSelectionPopUp.clickSignInButton() ;
    }

    @org.junit.Test
//    @Order(4)
    public void t4_See_sign_in_page(){
        boolean isEnabled = signInPage.mailAddressSpace().isEnabled();
        Assert.assertTrue("Not ok!" , isEnabled);
    }

    @org.junit.Test
//    @Order(5)
    public void t5_Set_mail_address(){
        signInPage.setMailAddress("mustafaksu4@gmail.com");
    }

    @org.junit.Test
//    @Order(6)
    public void t6_Click_countinue_button(){
        signInPage.clickCountinueButton();
    }

    @org.junit.Test
//    @Order(7)
    public void t7_See_password_space(){
        boolean isEnabled = signInPage.passwordSpace().isEnabled();
        Assert.assertTrue("Not ok!" , isEnabled);
    }

    @org.junit.Test
//    @Order(8)
    public void t8_Set_password (){
        signInPage.setPassword("kara.OLUK54");
    }

    @org.junit.Test
//    @Order(9)
    public void t9_Click_sign_in_button_on_sign_in_page(){
        signInPage.clickSignInButton();
    }











}
