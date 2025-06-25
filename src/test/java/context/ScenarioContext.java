package context;

import org.testng.asserts.SoftAssert;

public class ScenarioContext {
    public static ThreadLocal<SoftAssert> softAssert = ThreadLocal.withInitial(SoftAssert::new);
}