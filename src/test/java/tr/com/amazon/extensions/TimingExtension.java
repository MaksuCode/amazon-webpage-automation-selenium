package tr.com.amazon.extensions;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import java.lang.reflect.Method;

public class TimingExtension implements BeforeTestExecutionCallback , AfterTestExecutionCallback ,TestLifeCycleLogger {

    private static final String START_TIME = "start time";

    @Override
    public void beforeTestExecution(ExtensionContext extensionContext) throws Exception {
        getStore(extensionContext).put(START_TIME , System.currentTimeMillis());
    }

    @Override
    public void afterTestExecution(ExtensionContext extensionContext) throws Exception {
        Method testMethod = extensionContext.getRequiredTestMethod();
        long startTime = getStore(extensionContext).remove(START_TIME, long.class);
        long duration = System.currentTimeMillis() - startTime;
        logger.durationInfo(testMethod.getName() ,duration );
    }

    private ExtensionContext.Store getStore(ExtensionContext context) {
        return context.getStore(ExtensionContext.Namespace.create(getClass(), context.getRequiredTestMethod()));
    }


}
