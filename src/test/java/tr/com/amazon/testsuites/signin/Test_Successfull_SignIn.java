package tr.com.amazon.testsuites.signin;

import org.junit.Assert;
import org.junit.jupiter.api.*;
import tr.com.amazon.testsuites.BaseTest;


public class Test_Successfull_SignIn extends BaseTest {

    @Test
    @Order(1)
    public void click_sign_in_box(){
        signInPage =mainPage.navigationBar()
                            .navBarRightComponent()
                            .accountAndListsBox()
                            .clickItself();
//        logger.info("Clicked to sign in box.");
    }

    @Test
    @Order(2)
    public void see_Sign_in_page(){
        boolean isEnabled = signInPage.mailAddressSpace().isEnabled();
        Assert.assertTrue("Not seen it!" , isEnabled);
//        logger.info("Checked user is on sign in page.");
    }

    @Test
    @Order(3)
    public void set_mail_address(){
        signInPage.setMailAddress("mustafaksu4@gmail.com");
//        logger.info("Set mail address.");
    }

    @Test
    @Order(4)
    public void click_countinue_button(){
        signInPage.clickCountinueButton();
//        logger.info("Clicked countinue button.");
    }

    @Test
    @Order(5)
    public void see_password_space(){
        boolean isEnabled = signInPage.passwordSpace().isEnabled();
        Assert.assertTrue("Not ok!" , isEnabled);
//        logger.info("Checked user is on the correct page.");
    }

    @Test
    @Order(6)
    public void set_password (){
        signInPage.setPassword("kara.OLUK54");
//        logger.info("Set password.");
    }

    @Test
    @Order(7)
    public void click_sign_in_button_on_sign_in_page(){
        mainPage = signInPage.clickSignInButton();
//        logger.info("Clicked sign in button");
    }

    @Test
    @Order(8)
    public void see_Amazon_icon_on_main_page(){
        boolean isSeen = mainPage.navigationBar()
                                 .navBarLeftComponent()
                                 .amazonIcon()
                                 .isDisplayed();
        Assert.assertTrue("Not on main page!" , isSeen);
//        logger.info("Checked user is on the main page.");
    }


}
