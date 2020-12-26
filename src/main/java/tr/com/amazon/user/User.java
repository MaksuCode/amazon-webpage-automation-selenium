package tr.com.amazon.user;

import io.cucumber.java.eo.Se;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import tr.com.amazon.pages.BasePage;
import tr.com.amazon.testrunner.TestRunner;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;


public class User extends TestRunner {

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
        }
        driver.navigate().to(url);
    }

    public void clicks(WebElement elementToBeClicked){
        elementToBeClicked.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
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
    }

    public void hitsKey(int keyEvent){
        try {
            Robot robot = new Robot();
            robot.keyPress(keyEvent);
            robot.keyRelease(keyEvent);
        }catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public void hitsKey(CharSequence key , WebElement element){
        element.sendKeys(key);
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
















