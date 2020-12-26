package tr.com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tr.com.amazon.product.Product;

import java.util.List;
import java.util.Random;

public class ProductPage extends BasePage {

    private final By addToCartButton = By.id("add-to-cart-button");
    private final By productCount = new By.ByCssSelector("select#quantity");

    public WebElement getAddToCartButton() {
        return driver.findElement(addToCartButton);
    }

    public WebElement getProductCount() {
        return driver.findElement(productCount);
    }
}
