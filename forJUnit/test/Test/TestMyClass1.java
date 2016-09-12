package Test;

import junit.framework.*;

public class TestMyClass1 extends TestCase {
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

  public void testReadFile() {
    String fileName = "file.txt";
    String expectedReturn = "abc";
    String actualReturn = myClass.readFile(fileName);
    assertEquals("return value", expectedReturn, actualReturn);
  }

  public void testReadFile1() {
    String fileName = "file.txt";
    String expectedReturn = "abcd";
    String actualReturn = myClass.readFile(fileName);
    assertEquals("return value", expectedReturn, actualReturn);
  }

  public void testReadFile2() {
    String fileName = "a.txt";
    String expectedReturn = "abc";
    String actualReturn = myClass.readFile(fileName);
    assertEquals("return value", expectedReturn, actualReturn);
  }

  public void testReadFile3() {
    String fileName = "a.txt";
    String expectedReturn = null;
    String actualReturn = myClass.readFile(fileName);
    assertEquals("return value", expectedReturn, actualReturn);
  }

}
