import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface TestRailCase {
    /**
     * Reference for the Test in TestRail
     * @return a {@code String} containing the Jira Story number
     */
    String jira() default "";

    /**
     * case type for the Test in TestRail
     * @return a {@code String} containing the Case Type
     * the supported case type values are: functional, performance, security, accessibility, usability
     */
    String caseType() default "functional";

    /**
     * priority for the test in TestRail
     * @return a {@code String} containing the Priority
     * the supported priority values are: critical, high, medium, low
     */
    String priority() default "medium";

    /**
     * description for the test in TestRail
     * @return a {@code String} containing the Description's text
     */
    String description() default "";

    /**
     * pre-conditions for the test in TestRail
     * @return a {@code String} containing the preconditions' text
     */
    String preconditions() default "";

    /**
     * steps for the test in TestRail
     * @return a {@code String} containing the steps' text
     */
    String steps() default "";

    /**
     * expected result for the test in TestRail
     * @return a {@code String} containing the expected results' text
     */
    String expectedResult() default "";
}
