package tr.com.amazon.user;

import org.openqa.selenium.WebElement;
import tr.com.amazon.pages.BasePage;
import tr.com.amazon.pages.HomePage;
import tr.com.amazon.testrunner.TestRunner;

import java.sql.DriverManager;


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
        if (elementToBeSeen == null){
            return false;
        }
        if (elementToBeSeen.isEnabled()){
            seenOrNot = true;
        }
        return seenOrNot;
    }

    public boolean sees(String str){
        boolean seenOrNot = false;

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

    public String getMailAddress() {
        return mailAddress;
    }

    public String getPassword() {
        return password;
    }

}
















