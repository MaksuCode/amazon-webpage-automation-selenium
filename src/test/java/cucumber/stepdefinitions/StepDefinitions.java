package cucumber.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import tr.com.amazon.model.Converter;
import tr.com.amazon.pages.HomePage;
import tr.com.amazon.pages.LoginPage;
import tr.com.amazon.testrunner.TestRunner;
import tr.com.amazon.user.User;

public class StepDefinitions extends TestRunner {

    User user = new User();
    String mailAddress = user.getMailAddress();
    String password = user.getPassword();
    Converter cnv = new Converter();
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Given("User goes to {string}")
    public void userGoesToPage(String pageName) {
        user.goesTo(cnv.strToPage(pageName));
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
        user.clicks(loginPage.getKeepOnButton());
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


}
