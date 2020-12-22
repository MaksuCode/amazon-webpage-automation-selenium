package tr.com.amazon.testrunner;


import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;

@RunWith(Parameterized.class)
public class TestStarter {

    private WebDriver driver;

    @Before
    public void initialize(){

    }
}
