package tr.com.amazon.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tr.com.amazon.pages.BasePage;
import tr.com.amazon.pages.HomePage;
import tr.com.amazon.testrunner.TestRunner;

public class Converter extends TestRunner {


    public BasePage strToPage(String pageName){
        BasePage page = new BasePage();
        switch (pageName){
            case "homePage":
                page = new HomePage();
                break;
        }
        return page;
    }

    public int strToSortIndex(String sortingStr){
        int index = 0;
        switch (sortingStr){
            case "lowest price first" :
                index = 1 ;
                break;
            case "highest price first" :
                index = 2 ;
                break ;
            case "customer comments":
                index = 3 ;
                break;
            case "newest products" :
                index = 4 ;
                break;
        }
        return index;
    }





}
