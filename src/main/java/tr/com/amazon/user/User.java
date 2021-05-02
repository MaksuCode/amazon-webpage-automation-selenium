package tr.com.amazon.user;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import tr.com.amazon.drivermanager.DriverInterface;
import tr.com.amazon.model.Converter;
import tr.com.amazon.pages.basepage.BasePage;
import java.awt.*;
import java.util.concurrent.TimeUnit;

/*
Deprecated.But can be used later according to project requirements.
 */
public class User implements DriverInterface {

    BasePage basePage = new BasePage();
    Converter cnv = new Converter();
    private String mailAddress = "mustafaksu4@gmail.com";
    private String password = "kara.OLUK54";

    public User(String mailAddress , String password){
        this.mailAddress = mailAddress ;
        this.password = password ;
    }

    public User() {
    }

    public void goesTo(BasePage page){
        String url = null;
        switch (page.getClass().getSimpleName()){
            case "HomePage" :
                url = "https://www.amazon.com.tr/";
                break;
            case "LoginPage":
                url = "";
                break;
            case "ProductsPage" :
                url = "";
                break;
        }
        driver.navigate().to(url);
    }

    public void clicks(WebElement elementToBeClicked){
        try {
//            WebElement acceptCookiesButton = basePage.getAccepCookiesButton(); //todo : düzelt.
//            acceptCookiesButton.click();
//            logger.info("User accepted cookies.");
        }catch (Exception e){
//            logger.info("Cookies not present!");
        }
        String element = cnv.elementStringModifier(elementToBeClicked.toString(), ">");
        elementToBeClicked.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
//        logger.info("User clicked to element " + element);
    }


    public boolean sees(WebElement elementToBeSeen){
        boolean seenOrNot = false;
        if (elementToBeSeen == null){
            return false;
        }
        if (elementToBeSeen.isEnabled()){
            seenOrNot = true;
        }
        return seenOrNot;
    }

    public boolean checks(WebElement elementWithString ,String str){
        boolean seenOrNot = false;
        if (elementWithString.getText().equals(str)){
            seenOrNot = true;
//            logger.info("Checked the string over the element.");
        }
        return seenOrNot;
    }

    public boolean checks(String expected ,String recent ){
        boolean check = false;
        if (expected.equals(recent)){
            check = true;
        }
        return check ;
    }


    public void types(String str , WebElement typingSpace){
        typingSpace.clear();
        typingSpace.sendKeys(str);
//        logger.info("User typed '" + str + "'");
    }

    public void hitsKey(int keyEvent){
        try {
            Robot robot = new Robot();
            robot.keyPress(keyEvent);
            robot.keyRelease(keyEvent);
//            logger.info("User hit key.");
        }catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public void hitsKey(CharSequence key , WebElement element){
        element.sendKeys(key);
//        logger.info("User hit key '" +key.toString()+ "'");
    }

    public void selectsByIndex(WebElement dropDownMenu ,int index){
        Select select = new Select(dropDownMenu);
        select.selectByIndex(index);
    }

    public void selectsByText(WebElement dropDownMenu , String text){
        Select select = new Select(dropDownMenu);
        select.selectByVisibleText(text);
    }

//    public void sortsProducts(WebElement dropDown , ){
//        selectsByIndex();
//    }

    public String getMailAddress() {
        return mailAddress;
    }

    public String getPassword() {
        return password;
    }


}
















