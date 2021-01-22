package tr.com.amazon.pages.productspage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tr.com.amazon.model.Converter;
import tr.com.amazon.pages.basepage.BasePage;

import java.util.*;

public class ProductsPage extends BasePage {

    @FindBy(id = "s-result-sort-select")
    private WebElement resultSelectDropDown ;

    @FindBy(css ="span.a-size-base-plus")
    private WebElement productName ;

    @FindBy(css = "#deliveryRefinements ul > li")
    private WebElement deliveryRefinements ;

    @FindBy(css = "#departments ul li" )
    private List<WebElement> categories ;

    @FindBy(css = "#reviewsRefinements ul li" )
    private List<WebElement> reviewsRefinements;

    @FindBy(css = "#brandsRefinements div.a-checkbox" )
    private WebElement brandRefinements ;

    @FindBy(css = "#priceRefinements ul li")
    private List<WebElement> priceRefinements ;

    @FindBy(css = "span.a-price span.a-offscreen")
    private List<WebElement> productPrice ;

    @FindBy(css = "a.a-popover-trigger i.a-icon span.a-icon-alt")
    private List<WebElement> productReview ;

    Converter cnv = new Converter();

    public ProductsPage() {
        super();
    }

    public WebElement getProductName() {
        return productName;
    }

    public WebElement getDeliveryRefinements() {
        return deliveryRefinements;
    }

    public List<WebElement> getCategories() {
        return categories;
    }
//
//    public List<WebElement> getReviewsRefinements() {
//        return reviewsRefinements;
//    }

    public WebElement getBrandRefinements() {
        return brandRefinements;
    }

    public List<WebElement> getPriceRefinements() {
        return priceRefinements;
    }

    public List<WebElement> getProductPrice() {
        return productPrice;
    }

    public List<WebElement> getProductReview() {
        return productReview;
    }


//    public Product getRandomProduct(){
//        Random random = new Random();
//        int index = random.nextInt(getAllProductsList().size());
//        String productUrl = getAllProductsList().get(index).getAttribute("alt");
//        return new Product(productUrl);
//    }
//
//    public WebElement getRandomProductElemet(){
//        int index = 4; //ThreadLocalRandom.current().nextInt(0, getAllProducts().size()+1);
//        return getAllProductsList().get(index);
//    }

//    public List<WebElement> getAllProductsList() {
//        return locator.findElementListByLocator(productName , LocatorType.CSS) ;
//    }
//
//    public List<WebElement> getDeliveryOptionsList(){
//        return locator.findElementListByLocator(deliveryRefinements , LocatorType.CSS);
//    }
//
//    public List<WebElement> getCategoriesList() {
//        return locator.findElementListByLocator(categories , LocatorType.CSS) ;
//    }
//
//    private List<WebElement> getReviewsRefinementsList() {
//        return locator.findElementListByLocator(reviewsRefinements , LocatorType.CSS);
//    }

//    public WebElement getReviewsRefinements(int index){
//        return getReviewsRefinementsList().get(index);
//    }

//    public List<WebElement> getBrandRefinementsList() {
//        return locator.findElementListByLocator(brandRefinements , LocatorType.CSS);
//    }
//
//    public List<WebElement> getPriceRefinementsList() {
//        return locator.findElementListByLocator(priceRefinements , LocatorType.CSS);
//    }
//
//    public List<WebElement> getProductPriceList() {
//        return locator.findElementListByLocator(productPrice , LocatorType.CSS);
//    }
//
//    private List<WebElement> getProductReviewList() {
//        return locator.findElementListByLocator(productReview , LocatorType.CSS);
//    }

//    private List<Double> getReviewStarList(){
//        List<WebElement> list = getProductReviewList();
//        List<Double> valueList = new ArrayList<>();
//        double doubleValue;
//        String str = "";
//        for (WebElement review : list){
//            str = review.getAttribute("innerHTML");
//            doubleValue=cnv.strToDouble(str.substring(str.lastIndexOf(" ")));
//            valueList.add(doubleValue);
//        }
//        Collections.sort(valueList);
//        return valueList ;
//    }

//    public double getMinimumReviewStar(){
//        List<Double> list =  getReviewStarList();
//        return list.get(0);
//    }
}
