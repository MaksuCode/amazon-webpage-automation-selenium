package cucumber.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import tr.com.amazon.model.Converter;
import tr.com.amazon.pages.*;
import tr.com.amazon.product.Product;
import tr.com.amazon.testrunner.TestRunner;
import tr.com.amazon.user.User;

import java.util.List;

public class StepDefinitions extends TestRunner {

    User user = new User();
    String mailAddress = user.getMailAddress();
    String password = user.getPassword();
    Converter cnv = new Converter();
    BasePage basePage = new BasePage();
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    ProductPage productPage = new ProductPage();
    ProductsPage productsPage = new ProductsPage();

    @Given("User goes to {string}")
    public void userGoesToPage(String pageName) {
        BasePage page = cnv.strToPage(pageName);
        user.goesTo(page);
    }

    @And("Clicks login button")
    public void clicksLoginButton() {
        WebElement loginButton = homePage.getLoginButton();
        user.clicks(loginButton);
    }

    @Then("User sees mail address space")
    public void userSeesMailAddressSpace() {
        WebElement mailAddressSpace = loginPage.getMailAddressSpace();
        boolean check = user.sees(mailAddressSpace);
        Assert.assertTrue("Element not seen!" , check );
    }

    @And("Clicks mail address space")
    public void clicksMailAddressSpace() {
        WebElement mailAddressSpace = loginPage.getMailAddressSpace();
        user.clicks(mailAddressSpace);
    }

    @And("User types email address")
    public void userTypesEmailAddress() {
        WebElement mailAddressSpace = loginPage.getMailAddressSpace();
        user.types(mailAddress , mailAddressSpace);
    }

    @And("Clicks keep on button")
    public void clicksKeepOnButton() {
        WebElement keepOnButton = loginPage.getKeepOnButton();
        user.clicks(keepOnButton);
    }

    @Then("User sees password blank on the page")
    public void userSeesPasswordBlankOnThePage() {
        WebElement passwordSpace = loginPage.getPasswordSpace();
        boolean check = user.sees(passwordSpace);
        Assert.assertTrue("Element not seen!" , check );
    }

    @And("User types password")
    public void userTypesPassword() {
        WebElement passwordSpace = loginPage.getPasswordSpace();
        user.types(password , passwordSpace);
    }

    @And("Clicks login submit button")
    public void clicksLoginSubmitButton() {
        WebElement loginSubmitButton = loginPage.getLoginButton();
        user.clicks(loginSubmitButton);
    }

    @Then("User sees he is on the home page")
    public void userSeesHeIsOnTheHomePage() {
        WebElement amazonIconOnHomePage = homePage.getAmazonIcon();
        boolean check = user.sees(amazonIconOnHomePage);
        Assert.assertTrue("Element not seen!" , check);
    }


    @And("User types invalid email address")
    public void userTypesInvalidEmailAddress() {
        user.types("mustafaksu5@gmail.com" , loginPage.getMailAddressSpace());
    }

    @And("User sees login error message")
    public void userSeesLoginErrorMessage() {
        WebElement loginErrorMessage = loginPage.getLoginErrorMessage();
        String loginErrorMessageStr = loginPage.getLoginErrorMessageString();
        boolean check = user.checks(loginErrorMessage , loginErrorMessageStr);
        Assert.assertTrue("Error message not seen!" , check);
    }

    @And("User types invalid password")
    public void userTypesInvalidPassword() {
        user.types("12345678" , loginPage.getPasswordSpace());
    }


    @And("User sees one of the login warning messages")
    public void userSeesOneOfTheLoginWarningMessages() {
        boolean check1 = user.sees(loginPage.getLoginWarningMessage());
        boolean check2 = user.sees(loginPage.getLoginWarningMessage2());
        boolean result = check1 || check2 ;
        Assert.assertTrue("Neither of the warning messages not seen!" , result);
    }

    @Then("Quits browser")
    public void quitsBrowser() {
        driver.quit();
        setUp();
    }

    @Given("User clicks {int} category")
    public void userClicksCategory(int categoryIndex) {
        List<WebElement> categoryElements = homePage.getMainNavBarElements();
        user.clicks(categoryElements.get(categoryIndex - 1));
    }

    @Given("User goes to product")
    public void userGoesToProduct() {
        Product product = new Product();
        driver.get(product.getProductUrl());
    }

    @Given("User clicks add to cart button")
    public void userClicksAddToCartButton() {
        WebElement addToCartButton = productPage.getAddToCartButton();
        user.clicks(addToCartButton);
    }

    @Then("User sees {string} count on the basket")
    public void userSeesCountOnTheBasket(String expectedCount) {
        String recentCartCount = homePage.getCartCount().getText();
        boolean check = user.checks(recentCartCount , expectedCount);
        Assert.assertTrue("Cart count is not correct!" , check);
    }

    @And("User clicks search box")
    public void userClicksSearchBox() {
        WebElement searchTextBox = homePage.getSearchTextBox();
        user.clicks(searchTextBox);
    }

    @And("User types {string}")
    public void userTypes(String str) {
        WebElement searchTextBox = homePage.getSearchTextBox();
        user.types(str , searchTextBox);
    }

    @And("User hits enter button")
    public void userHitsEnterButton() {
//        user.hitsKey(KeyEvent.VK_ENTER);
        user.hitsKey(Keys.ENTER , homePage.getSearchTextBox());
    }

    @Then("User sees he is on the products page")
    public void userSeesHeIsOnTheProductsPage() {
        WebElement resulSelectDropDown = productsPage.getResultSelectDropDown();
        boolean check = user.sees(resulSelectDropDown);
        Assert.assertTrue("User is not on products page!" , check);
    }

    @And("User clicks a product")
    public void userClicksAProduct() {
        WebElement productName = productsPage.getRandomProductElemet();
        user.clicks(productName);
    }

    @Then("User sees he is on the product page")
    public void userSeesHeIsOnTheProductDetailsPage() {
        WebElement addToCartButton = productPage.getAddToCartButton();
        boolean check = user.sees(addToCartButton);
        Assert.assertTrue("User is not is on product page!" , check);
    }

    @And("User sorts results as {string}")
    public void userSortsResultsAs(String sortType) {
        WebElement resultSelectDropDown = productsPage.getResultSelectDropDown();
        user.selectsByIndex(resultSelectDropDown , 0);

    }

    @And("User accepts cookies if exist")
    public void userAcceptsCookiesIfExist() {
        try {
            WebElement acceptCookiesButton = basePage.getAccepCookiesButton();
            user.clicks(acceptCookiesButton);
        }catch (Exception e){
            System.out.println("Cookies not present!");
        }
    }

    @And("User clicks cart")
    public void userClicksCart() {
        WebElement cart = homePage.getCartCount();
        user.clicks(cart);
    }

    @And("User sets {int} product quantity")
    public void userSetsProductQuantity(int count) {
        WebElement productCount = productPage.getProductCount();
        user.selectsByIndex(productCount , count-1);
    }
}
