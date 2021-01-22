package tr.com.amazon.pages.productpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import tr.com.amazon.pages.basepage.BasePage;

public class ProductPage extends BasePage {

    @FindBy(id = "add-to-cart-button")
    @CacheLookup
    private WebElement addToCartButton ;

    @FindBy(css = "select#quantity")
    @CacheLookup
    private WebElement productCount ;

    public ProductPage() {
        PageFactory.initElements(driver , this);
    }

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }

    public WebElement getProductCount() {
        return productCount;
    }



}
