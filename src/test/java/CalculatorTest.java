import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    @TestRailCase(jira = "APAS-2222", caseType = "usability", priority = "critical",
            description="this is example description", preconditions = "this is example pre-conditions",
            steps = "1. example step 1; 2. example step 2", expectedResult = "this is example expected result")
    public void checkPlus() {
        Assert.assertEquals(Calculator.add(1, 2), 3);
    }

    @Test
    @TestRailCase(jira = "APAS-2222", caseType = "functional", priority = "high",
            description="this is example description", preconditions = "this is example pre-conditions",
            steps = "1. example step 1; 2. example step 2", expectedResult = "this is example expected result")
    public void checkMinus() {
        Assert.assertEquals(Calculator.subtract(3, 2), 1);
    }

    @Test
    @TestRailCase(jira = "APAS-2222", caseType = "performance", priority = "medium",
            description="this is example description", preconditions = "this is example pre-conditions",
            steps = "1. example step 1; 2. example step 2", expectedResult = "this is example expected result")
    public void checkSquare() {
        Assert.assertEquals(Calculator.square(2), 4);
    }

    @Test
    @TestRailCase(jira = "APAS-2222", caseType = "security", priority = "low",
            description="this is example description", preconditions = "this is example pre-conditions",
            steps = "1. example step 1; 2. example step 2", expectedResult = "this is example expected result")
    public void checkMultiply() {
        Assert.assertEquals(Calculator.multiply(2, 3), 6);
    }

    @Test
    @TestRailCase(jira = "APAS-2222", caseType = "accessibility", priority = "critical",
            description="this is example description", preconditions = "this is example pre-conditions",
            steps = "1. example step 1; 2. example step 2", expectedResult = "this is example expected result")
    public void checkDivide() {
        Assert.assertEquals(Calculator.divide(6, 3), 2);
    }
}
