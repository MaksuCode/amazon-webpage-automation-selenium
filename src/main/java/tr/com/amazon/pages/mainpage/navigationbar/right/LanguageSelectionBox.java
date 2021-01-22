package tr.com.amazon.pages.mainpage.navigationbar.right;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tr.com.amazon.pages.basepage.BasePage;

import java.util.List;

public class LanguageSelectionBox extends BasePage {

    @FindBy(id = "icp-nav-flyout")
    private WebElement itSelf;

    @FindBy(css = "#nav-flyout-icp span.nav-text i.icp-radio")
    private List<WebElement> languageRadioButtons ;


    public LanguageSelectionBox hoverOverItSelf(){
        Actions actions = new Actions(driver);
        actions.moveToElement(itSelf).perform();
        return this;
    }

    public void selectLanguageByIndex(int index){
        WebDriverWait wait = new WebDriverWait(driver , 5);
        wait.until(ExpectedConditions.visibilityOfAllElements(languageRadioButtons));
        languageRadioButtons.get(index).click();
    }


}
