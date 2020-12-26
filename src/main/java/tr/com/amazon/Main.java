package tr.com.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import tr.com.amazon.pages.HomePage;

public class Main {




    public static void main(String[] args) {

        HomePage homePage = new HomePage();
        By searchDropDownBox = By.id("searchDropdownBox");


        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com.tr");
        WebElement serchDropDown = driver.findElement(searchDropDownBox);

        Select select = new Select(serchDropDown);
        select.selectByVisibleText("Ev");

    }



}
