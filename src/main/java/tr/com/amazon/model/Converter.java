package tr.com.amazon.model;

import tr.com.amazon.pages.BasePage;
import tr.com.amazon.pages.HomePage;

public class Converter {


    public BasePage strToPage(String pageName){
        BasePage page = new BasePage();
        switch (pageName){
            case "homePage":
                page = new HomePage();
                break;
        }
        return page;
    }



}
