package tr.com.amazon.pages.mainpage.navigationbar.search;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import tr.com.amazon.pages.basepage.BasePage;
import tr.com.amazon.pages.productspage.ProductsPage;

/**
 * Search box component on the navigation bar.
 */
public class NavBarSearchBox extends BasePage {

    @FindBy(id = "twotabsearchtextbox")
    private WebElement navSearchBox ;

    @FindBy(id = "nav-search-submit-button")
    private WebElement navSearchSubmitButton;

    @FindBy(id = "searchDropdownBox")
    private WebElement navSearchDropDownMenu ;

    public NavBarSearchBox() {
        super();
    }

    /**
     * Clicks search box , clears it and types the {search} String then clicks to submit button.
     * @param search typed String
     * @return ProductsPage
     */
    public ProductsPage searchFor(String search){
        navSearchBox.click();
        navSearchBox.clear();
        navSearchBox.sendKeys(search);
        navSearchSubmitButton.click();
        return new ProductsPage();
    }

    /**
     * Clicks search box , clears it and types the {search} String then clicks to submit button.
     * @param search typed String
     * @param index index of the drop down starting from 0{int}
     * @return
     */
    public ProductsPage searchFor(String search , int index){
        navSearchBox.click();
        navSearchBox.clear();
        navSearchBox.sendKeys(search);
        selectFromDropDownMenu(index);
        navSearchSubmitButton.click();
        return new ProductsPage();
    }

    /**
     * Select from drop down menu by index
     * @param index index of the drop down starting from 0{int}
     */
    private void selectFromDropDownMenu(int index){
        Select select = new Select(navSearchDropDownMenu);
        select.selectByIndex(index);
    }

    public WebElement getNavSearchBox() {
        return navSearchBox;
    }

    public WebElement getNavSearchSubmitButton() {
        return navSearchSubmitButton;
    }

    public WebElement getNavSearchDropDownMenu() {
        return navSearchDropDownMenu;
    }


}
