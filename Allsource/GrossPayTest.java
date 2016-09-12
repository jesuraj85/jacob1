import junit.framework.TestCase;

public class GrossPayTest extends TestCase {
	public void test1(){
		assertEquals(new WorkerPay(-5,12.5,3).grossPay(),0.0);
	}
	
    public void test2(){
    	assertEquals(new WorkerPay(-5,-12.5,3).grossPay(),0.0);
	}
    
    public void test3(){
    	assertEquals(new WorkerPay(24.5,12.5,3).grossPay(),306.25);
	}
	
    public void test4(){
    	assertEquals(new WorkerPay(24.5,-12.5,3).grossPay(),0.0);
	}
    
    public void test5(){
    	assertEquals(new WorkerPay(56.7,12.5,3).grossPay(),813.125);
	}
	
    public void test6(){
    	assertEquals(new WorkerPay(56.7,-12.5,3).grossPay(),0.0);
	}
    
    public void test7(){
    	assertEquals(new WorkerPay(85.4,12.5,3).grossPay(),1510.0);
	}
	
    public void test8(){
    	assertEquals(new WorkerPay(85.4,-12.5,3).grossPay(),0.0);
	}
}
