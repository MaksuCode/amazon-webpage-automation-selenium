package tr.com.amazon.user;

import org.openqa.selenium.WebElement;
import tr.com.amazon.pages.BasePage;
import tr.com.amazon.testrunner.TestRunner;


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
    }

    public boolean sees(WebElement elementToBeSeen){
        boolean seenOrNot = false;
        if (elementToBeSeen.isEnabled()){
            seenOrNot = true;
        }
        return seenOrNot;
    }

    public void types(String str , WebElement typingSpace){
        typingSpace.sendKeys(str);
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public String getPassword() {
        return password;
    }

}
















