package tr.com.amazon.testsuites.language;

import org.junit.Assert;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import tr.com.amazon.testsuites.BaseTest;

public class Test_Changing_Language_On_Main_Page extends BaseTest {

    private final String language = "DE" ;

    @Test
    @Order(1)
    public void select_language() {
        languageSelectionBox =mainPage.navigationBar()
                                      .navBarRightComponent()
                                      .languageSelectionBox()
                                      .hoverOver()
                                      .selectLanguageByLanguageCode(language);
    }

    @Test
    @Order(2)
    public void see_if_language_selected(){
        boolean isSelected = languageSelectionBox.checkLanguage("language");
        Assert.assertTrue("Radio button not selected" , isSelected);

    }

}
