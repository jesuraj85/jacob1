import junit.framework.TestCase;

public class WhiteTest extends TestCase {
	public void test1(){
		assertEquals(new WorkerPay(-5.0,3.0,2).grossPay(),0.0);
	}
	
    public void test2(){
    	assertEquals(new WorkerPay(37.0,5.6,2).grossPay(),207.2);
	}
    
    public void test3(){
    	assertEquals(new WorkerPay(50.6,10.8,2).grossPay(),603.72);
	}
	
    public void test4(){
    	assertEquals(new WorkerPay(80.5,12.0,2).grossPay(),1332.0);
	}
    
}
