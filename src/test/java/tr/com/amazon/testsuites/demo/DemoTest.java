package tr.com.amazon.testsuites.demo;

import org.junit.jupiter.api.Test;
import tr.com.amazon.testsuites.BaseTest;

public class DemoTest extends BaseTest {


    @Test
    public void test1() throws InterruptedException {
        Thread.sleep(50);
    }

    @Test
    public void test2() throws InterruptedException {
        Thread.sleep(100);
    }


}
