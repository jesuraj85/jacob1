package Test;

import junit.framework.*;

public class AllTests
    extends TestCase {

  public AllTests(String s) {
    super(s);
  }

  public static Test suite() {
    TestSuite suite = new TestSuite();
    suite.addTestSuite(TestMyClass1.class);
    suite.addTestSuite(TestMyClass.class);
    return suite;
  }
}
