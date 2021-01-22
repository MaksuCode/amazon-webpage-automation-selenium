package tr.com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage {

    @FindBy(how = How.ID , using = "abc")
    private WebElement element ;


    public CartPage() {
        PageFactory.initElements(driver , this);
    }

    public void setText(String str){
        element.sendKeys(str);
    }

    public WebElement getElement() {
        return element;
    }
}
