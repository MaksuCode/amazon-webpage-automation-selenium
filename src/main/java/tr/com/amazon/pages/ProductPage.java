package tr.com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductPage extends BasePage {

    private final By addToCartButton = By.id("add-to-cart-button");

    public WebElement getAddToCartButton() {
        return driver.findElement(addToCartButton);
    }
}
