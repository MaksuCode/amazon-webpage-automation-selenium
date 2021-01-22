package tests;

import org.junit.Test;

public class Changing_Language_On_Main_Page extends BaseTest{

    @Test
    public void step1_Select_language() {
        mainPage.navigationBar()
                .navBarRightComponent()
                .languageSelectionBox()
                .hoverOverItSelf()
                .selectLanguageByIndex(5);
    }

}
