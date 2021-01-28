package tr.com.amazon.testsuites.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.openqa.selenium.WebDriver;
import tr.com.amazon.drivermanager.DriverType;
import tr.com.amazon.testsuites.BaseTest;
import java.io.IOException;

public class DemoTest extends BaseTest {


    public void test1() throws InterruptedException {
        Thread.sleep(50);

    }

    @Test
    public void test2() throws InterruptedException {
        Thread.sleep(100);
    }


}
