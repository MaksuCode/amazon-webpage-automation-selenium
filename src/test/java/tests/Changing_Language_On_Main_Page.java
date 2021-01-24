package tests;

import org.junit.Assert;
import org.junit.Test;

public class Changing_Language_On_Main_Page extends BaseTest{

    private final String language = "DE" ;

    @Test
    public void step1_Select_language() {
        languageSelectionBox =mainPage.navigationBar()
                                      .navBarRightComponent()
                                      .languageSelectionBox()
                                      .hoverOver()
                                      .selectLanguageByLanguageCode(language);
    }

    @Test
    public void step2_See_if_language_selected(){
        boolean isSelected = languageSelectionBox.checkLanguage(language);
        Assert.assertTrue("Radio button not selected" , isSelected);
    }

}
