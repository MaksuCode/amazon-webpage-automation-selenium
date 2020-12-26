package tr.com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tr.com.amazon.product.Product;

import java.util.List;
import java.util.Random;

public class ProductsPage extends BasePage {

    private final By resultSelectDropDown = By.id("s-result-sort-select");
    private final By productName = new By.ByCssSelector("span.a-size-base-plus");

    public WebElement getResultSelectDropDown() {
        return driver.findElement(resultSelectDropDown);
    }

    public Product getRandomProduct(){
        Random random = new Random();
        int index = random.nextInt(getAllProducts().size());
        String productUrl = getAllProducts().get(index).getAttribute("alt");
        return new Product(productUrl);
    }

    public WebElement getRandomProductElemet(){
        int index = 4; //ThreadLocalRandom.current().nextInt(0, getAllProducts().size()+1);
        return getAllProducts().get(index);
    }

    public List<WebElement> getAllProducts() {
        return driver.findElements(productName);
    }
}
