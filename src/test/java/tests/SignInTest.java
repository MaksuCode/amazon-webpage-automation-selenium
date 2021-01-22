package tests;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SignInTest extends BaseTest {

    @Test
    public void step1_Click_sign_in_box(){
        signInPage =mainPage.navigationBar()
                            .navBarRightComponent()
                            .accountAndListsBox()
                            .clickItself();
    }

    @Test
    public void step2_See_Sign_in_page(){
        boolean isEnabled = signInPage.mailAddressSpace().isEnabled();
        Assert.assertTrue("Not seen it!" , isEnabled);
    }

    @Test
    public void step3_Set_mail_address(){
        signInPage.setMailAddress("mustafaksu4@gmail.com");
    }

    @Test
    public void step4_Click_countinue_button(){
        signInPage.clickCountinueButton();
    }

    @Test
    public void step5_See_password_space(){
        boolean isEnabled = signInPage.passwordSpace().isEnabled();
        Assert.assertTrue("Not ok!" , isEnabled);
    }

    @Test
    public void step6_Set_password (){
        signInPage.setPassword("kara.OLUK54");
    }

    @Test
    public void step7_Click_sign_in_button_on_sign_in_page(){
        mainPage = signInPage.clickSignInButton();
    }

    @Test
    public void step8_See_Amazon_icon_on_main_page(){
        boolean isSeen = mainPage.navigationBar()
                                 .navBarLeftComponent()
                                 .amazonIcon()
                                 .isDisplayed();
        Assert.assertTrue("Not on main page!" , isSeen);
    }


}
