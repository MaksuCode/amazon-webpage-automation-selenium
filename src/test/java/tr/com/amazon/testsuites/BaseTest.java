package tr.com.amazon.testsuites;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import tr.com.amazon.drivermanager.DriverInterface;
import tr.com.amazon.extensions.RecordOnErrorExtension;
import tr.com.amazon.extensions.TestLifeCycleLogger;
import tr.com.amazon.extensions.TimingExtension;
import tr.com.amazon.pages.mainpage.main.MainPage;
import tr.com.amazon.pages.mainpage.navigationbar.left.LocationSelectionPopUp;
import tr.com.amazon.pages.mainpage.navigationbar.right.LanguageSelectionBox;
import tr.com.amazon.pages.signinpage.SignInPage;


@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@ExtendWith({TimingExtension.class , RecordOnErrorExtension.class})
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public abstract class BaseTest implements DriverInterface , TestLifeCycleLogger  {

    protected MainPage mainPage = new MainPage();
    protected LocationSelectionPopUp locationSelectionPopUp = new LocationSelectionPopUp();
    protected SignInPage signInPage = new SignInPage();
    protected LanguageSelectionBox languageSelectionBox = new LanguageSelectionBox();


    @BeforeAll
    public void setUpBase( ){
        driver.get("https://www.amazon.com");
    }

    @AfterAll
    public static void tearDown(){
        driverManager.quitDriver();
    }




}
