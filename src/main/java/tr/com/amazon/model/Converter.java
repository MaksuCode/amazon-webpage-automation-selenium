package tr.com.amazon.model;

import tr.com.amazon.pages.basepage.BasePage;

public class Converter {


    public BasePage strToPage(String pageName){
        BasePage page = new BasePage();
        switch (pageName){
            case "homePage":
//                page = new HomePage();
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

    public String elementStringModifier(String elementString ,String indexString){
        int index = elementString.indexOf(indexString);
        return elementString.substring(index-1);
    }

    public int strToInt(String str){
        return Integer.parseInt(str);
    }

    public double strToDouble(String str){
        str = str.replace("," , ".");
        return Double.parseDouble(str);
    }


    public int strToStarIndex(String starCount) {
        int index;
        switch (starCount){
            case "4" :
                index = 0 ;
                break;
            case "3" :
                index = 1;
                break;
            case "2" :
                index = 2;
                break;
            case "1" :
                index = 3;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + starCount);
        }
        return index;
    }
}
