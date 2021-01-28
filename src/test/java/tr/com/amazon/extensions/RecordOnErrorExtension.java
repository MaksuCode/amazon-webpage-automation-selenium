package tr.com.amazon.extensions;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import tr.com.amazon.model.ScreenShotTaker;

import java.lang.reflect.Method;

public class RecordOnErrorExtension implements BeforeTestExecutionCallback , AfterTestExecutionCallback , TestLifeCycleLogger{


    @Override
    public void beforeTestExecution(ExtensionContext extensionContext) throws Exception {

    }

    @Override
    public void afterTestExecution(ExtensionContext extensionContext) throws Exception {
        Method testMethod = extensionContext.getRequiredTestMethod();
        String tesClass = extensionContext.getTestClass().get().getSimpleName();
        boolean testResult = extensionContext.getExecutionException().isPresent();
        if (testResult){
            ScreenShotTaker.takeScreenShot();
            logger.error(testMethod.getName() + tesClass);
        }
    }


}
