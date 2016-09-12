import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestAll extends TestSuite {
	public static Test suite(){
		TestSuite suite=new TestSuite();
		suite.addTestSuite(GrossPayTest.class);
		suite.addTestSuite(FedTaxTest.class);
		suite.addTestSuite(WhiteTest.class);
		return suite;
	}
}
