package tr.com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import tr.com.amazon.model.Converter;
import tr.com.amazon.model.ElementLocator;
import tr.com.amazon.product.Product;

import java.util.List;
import java.util.Random;

public class ProductPage extends BasePage {

    private final String addToCartButton = "add-to-cart-button";
    private final String productCount = "select#quantity";




    public WebElement getAddToCartButton() {
        return elementLocator.findElementByLocator(addToCartButton , "ID");
    }

    public WebElement getProductCount() {
        return elementLocator.findElementByLocator(productCount ,"CSS");
    }


}
