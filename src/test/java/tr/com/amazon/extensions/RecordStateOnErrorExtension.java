package tr.com.amazon.extensions;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.LifecycleMethodExecutionExceptionHandler;

public class RecordStateOnErrorExtension implements LifecycleMethodExecutionExceptionHandler {

    @Override
    public void handleBeforeAllMethodExecutionException(ExtensionContext context, Throwable throwable) throws Throwable {
        memoryDumpForFurtherInvestigation("Failure recorded during class setup");
        throw  throwable ;
    }

    @Override
    public void handleBeforeEachMethodExecutionException(ExtensionContext context, Throwable throwable) throws Throwable {
        memoryDumpForFurtherInvestigation("Failure recorded during test setup");
        throw  throwable ;
    }

    @Override
    public void handleAfterEachMethodExecutionException(ExtensionContext context, Throwable throwable) throws Throwable {
        memoryDumpForFurtherInvestigation("Failure recorded during test cleanup");
        throw throwable ;
    }

    @Override
    public void handleAfterAllMethodExecutionException(ExtensionContext context, Throwable throwable) throws Throwable {
        memoryDumpForFurtherInvestigation("Failure recorded during class cleanup");
        throw  throwable;
    }

    private void memoryDumpForFurtherInvestigation(String str){

    }
}
