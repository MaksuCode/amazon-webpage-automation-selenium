package tests;

import org.junit.FixMethodOrder;
//import org.junit.jupiter.api.DisplayNameGeneration;
//import org.junit.jupiter.api.DisplayNameGenerator;
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.TestMethodOrder;
import org.junit.runners.MethodSorters;
import tr.com.amazon.pages.mainpage.main.MainPage;
import tr.com.amazon.pages.mainpage.navigationbar.left.LocationSelectionPopUp;
import tr.com.amazon.pages.mainpage.navigationbar.right.LanguageSelectionBox;
import tr.com.amazon.pages.signinpage.SignInPage;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BaseTest {

    MainPage mainPage = new MainPage();
    LocationSelectionPopUp locationSelectionPopUp = new LocationSelectionPopUp();
    SignInPage signInPage = new SignInPage();
    LanguageSelectionBox languageSelectionBox = new LanguageSelectionBox();
}
