package tr.com.amazon.extensions;

import org.junit.jupiter.api.*;
import tr.com.amazon.model.Log;

public interface TestLifeCycleLogger  {

    Log logger = new Log();

    @BeforeAll
    default void beforeAllTests(TestInfo testInfo) {
        logger.info("#############################################################");
        logger.info(testInfo.getTestClass().get().getSimpleName() + " initated...");

    }

    @AfterAll
    default void afterAllTests(TestInfo testInfo) {
        logger.info(testInfo.getTestClass().get().getSimpleName() + " finished...");
        logger.info("#############################################################");
    }

    @BeforeEach
    default void beforeEachTest(TestInfo testInfo) {
        logger.info(String.format("About to execute [%s]",
                testInfo.getDisplayName()));
    }

    @AfterEach
    default void afterEachTest(TestInfo testInfo) {
        logger.info(String.format("Finished executing [%s]",
                testInfo.getDisplayName()));
    }

}
