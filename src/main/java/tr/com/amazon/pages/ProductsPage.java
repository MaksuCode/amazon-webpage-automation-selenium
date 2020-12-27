package tr.com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tr.com.amazon.product.Product;

import java.util.List;
import java.util.Random;

public class ProductsPage extends BasePage {

    private final String resultSelectDropDown = "s-result-sort-select";
    private final String productName = "span.a-size-base-plus" ;
    private final String deliveryRefinements = "#deliveryRefinements ul > li" ;
    private final String categories = "#departments ul li";
    private final String reviewsRefinements = "#reviewsRefinements ul li" ;
    private final String brandRefinements = "#brandsRefinements ul li";
    private final String priceRefinements = "#priceRefinements ul li" ;


    public WebElement getResultSelectDropDown() {
        return elementLocator.findElementByLocator(resultSelectDropDown , "ID");
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
        return elementLocator.findElementListByLocator(productName , "CSS") ;
    }

    public List<WebElement> getDeliveryOptions(){
        return elementLocator.findElementListByLocator(deliveryRefinements , "CSS");
    }

    public List<WebElement> getCategories() {
        return elementLocator.findElementListByLocator(categories , "CSS") ;
    }

    public List<WebElement> getReviewsRefinements() {
        return elementLocator.findElementListByLocator(reviewsRefinements , "CSS");
    }

    public List<WebElement> getBrandRefinements() {
        return elementLocator.findElementListByLocator(brandRefinements , "CSS");
    }

    public List<WebElement> getPriceRefinements() {
        return elementLocator.findElementListByLocator(priceRefinements , "CSS");
    }
}
