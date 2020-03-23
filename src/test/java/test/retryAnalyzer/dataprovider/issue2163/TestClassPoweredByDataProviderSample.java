package test.retryAnalyzer.dataprovider.issue2163;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestClassPoweredByDataProviderSample {

  @Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "dpNewObject")
  public void willNotStopAfter3Failures(String unused, Object[] newObject) {
    Assert.fail("Kaboom!");
  }

  @DataProvider
  public Object[][] dpNewObject() {
    return new Object[][]{
        {"test1", new Object[] {new Object()}},
    };

  }
}
