package tr.com.amazon.pages.mainpage.navigationbar.right;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tr.com.amazon.pages.basepage.BasePage;
import tr.com.amazon.scripts.JsScripts;

import java.util.List;

public class LanguageSelectionBox extends BasePage {

    @FindBy(id = "icp-nav-flyout")
    private WebElement itSelf;

    @FindBy(css = "#nav-flyout-icp span.nav-text i.icp-radio")
    private WebElement languageRadioButtons ;

    @FindBy(css = "#nav-flyout-icp span.nav-text i.icp-radio.icp-radio-active")
    private WebElement activeLanguageRadioButton;

    private List<WebElement> getAllLanguages(){
        return driver.findElements(new By.ByCssSelector("#nav-flyout-icp span.nav-text i.icp-radio"));
    }

    public LanguageSelectionBox hoverOver(){
        Actions actions = new Actions(driver);
        actions.moveToElement(itSelf).perform();
        WebDriverWait wait = new WebDriverWait(driver , 5);
        wait.until(ExpectedConditions.visibilityOfAllElements(languageRadioButtons));
        return this;
    }

    public void selectLanguageByIndex(int index){
        getAllLanguages().get(index).click();
    }

    public LanguageSelectionBox selectLanguageByLanguageCode(String CODE){
        int index = 0;
        switch (CODE) {
            case "EN" :
                index = 0 ;
                break;
            case "ES" :
                index = 1 ;
                break;
            case "ZH" :
                index = 2 ;
                break;
            case "DE" :
                index = 3 ;
                break;
        }
        getAllLanguages().get(index).click();
        return this;
    }

    public boolean checkLanguage(String CODE) {
        hoverOver();
        WebElement parent = (WebElement) ((JavascriptExecutor) driver)
                .executeScript(JsScripts.PARENT_OF_ELEMENT.toString() , activeLanguageRadioButton);
        return getLanguageCode(parent.getText()).equals(CODE);
    }

    private String getLanguageCode(String str){
        int length = str.length();
        return str.substring(length-2 , length);
    }
}
