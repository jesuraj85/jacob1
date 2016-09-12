package Test;

import junit.framework.*;

public class TestMyClass extends TestCase {
  private MyClass myClass = null;

  protected void setUp() throws Exception {
    super.setUp();
    /**@todo verify the constructors*/
    myClass = new MyClass();
  }

  protected void tearDown() throws Exception {
    myClass = null;
    super.tearDown();
  }

  public void testPrint() {
    String s = "-- test0 --";
    myClass.print(s);
    /**@todo fill in the test code*/
  }

  public void testPrint1() {
    String s = null;
    myClass.print(s);
    /**@todo fill in the test code*/
  }


}
