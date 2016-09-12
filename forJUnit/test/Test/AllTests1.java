package Test;

import junit.framework.*;

public class AllTests1
    extends TestCase {

  public AllTests1(String s) {
    super(s);
  }

  public static Test suite() {
    TestSuite suite = new TestSuite();
    suite.addTestSuite(TestMyClass3.class);
    suite.addTestSuite(TestMyClass2.class);
    return suite;
  }
}
