package tr.com.amazon.pages.mainpage.navigationbar.left;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import tr.com.amazon.pages.basepage.BasePage;
import tr.com.amazon.pages.signinpage.SignInPage;
import tr.com.amazon.pages.mainpage.main.MainPage;

/**
 * This is the pop-up which is opened after clicking to "Deliver to ..." next to Amazon Icon
 */
public class LocationSelectionPopUp extends BasePage {

    @FindBy(css = "#GLUXAddressBlock span.a-button-inner.a-button-inner")
    private WebElement signInButton;

    @FindBy(css = "#GLUXZipInputSection div input.GLUX_Full_Width")
    private WebElement zipCodeBlankSpace ;

    @FindBy(css = "#GLUXZipInputSection div.a-column.a-span-last")
    private WebElement applyButton;

    @FindBy(id = "GLUXCountryList")
    private WebElement countryDropDown;

    @FindBy(css = "div.a-popover-footer span span.a-button")
    private WebElement doneButton ;


    /**
     * Clicks sign in button
     * @return SignInPage
     */
    public SignInPage clickSignInButton(){
        click(signInButton);
        return new SignInPage();
    }

    /**
     * Fills the zip code blank space and clicks apply button
     * @param zipCode Maximum 5 length of String
     * @return LocationSelectionPopUp
     */
    public LocationSelectionPopUp fillZipCodeClickApplyButton(String zipCode){
        click(zipCodeBlankSpace);
        zipCodeBlankSpace.sendKeys(zipCode);
        click(applyButton);
        return this;
    }

    /**
     * Selects a country by index from drop down.
     * @param index -> Country index {starting from 0}
     * @return LocationSelectionPopUp
     */
    public LocationSelectionPopUp selectCountries(int index){
        Select select = new Select(countryDropDown);
        select.selectByIndex(index);
        return this ;
    }

    /**
     * Clicks Done button
     * @return MainPage
     */
    public MainPage clickDoneButton(){
        click(doneButton);
        return new MainPage();
    }

    public WebElement signInButton() {
        wait(signInButton);
        return signInButton;
    }

    public WebElement getZipCodeBlankSpace() {
        return zipCodeBlankSpace;
    }

    public WebElement getApplyButton() {
        return applyButton;
    }

    public WebElement getCountryDropDown() {
        return countryDropDown;
    }

    public WebElement getDoneButton() {
        return doneButton;
    }
}
