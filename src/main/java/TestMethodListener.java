import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestMethodListener implements IInvokedMethodListener, ITestListener {
    boolean testSuccess = true;

    /* (non-Javadoc)
     * @see org.testng.IInvokedMethodListener#beforeInvocation(org.testng.IInvokedMethod, org.testng.ITestResult)
     */
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        if(method.isTestMethod() && annotationPresent(method) ) {
            testResult.setAttribute("JIRA", method.getTestMethod().getConstructorOrMethod().getMethod().getAnnotation(TestRailCase.class).jira());
            testResult.setAttribute("priority", method.getTestMethod().getConstructorOrMethod().getMethod().getAnnotation(TestRailCase.class).priority());
            testResult.setAttribute("case_type", method.getTestMethod().getConstructorOrMethod().getMethod().getAnnotation(TestRailCase.class).caseType());
            testResult.setAttribute("description", method.getTestMethod().getConstructorOrMethod().getMethod().getAnnotation(TestRailCase.class).description());
            testResult.setAttribute("preconditions", method.getTestMethod().getConstructorOrMethod().getMethod().getAnnotation(TestRailCase.class).preconditions());
            testResult.setAttribute("steps", method.getTestMethod().getConstructorOrMethod().getMethod().getAnnotation(TestRailCase.class).steps());
            testResult.setAttribute("expected_result", method.getTestMethod().getConstructorOrMethod().getMethod().getAnnotation(TestRailCase.class).expectedResult());
        }
    }

    private boolean annotationPresent(IInvokedMethod method) {
        return method.getTestMethod().getConstructorOrMethod().getMethod().isAnnotationPresent(TestRailCase.class);
    }

    /* (non-Javadoc)
     * @see org.testng.IInvokedMethodListener#afterInvocation(org.testng.IInvokedMethod, org.testng.ITestResult)
     */
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        if(method.isTestMethod()) {
            if( !testSuccess ) {
                testResult.setStatus(ITestResult.FAILURE);
            }
        }
    }

    public void onTestStart(ITestResult result) {

    }

    public void onTestSuccess(ITestResult result) {

    }

    public void onTestFailure(ITestResult result) {

    }

    public void onTestSkipped(ITestResult result) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    public void onStart(ITestContext context) {

    }

    public void onFinish(ITestContext context) {

    }

}
