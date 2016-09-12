import junit.framework.TestCase;

public class FedTaxTest extends TestCase {
	public void test1(){
		assertEquals(new WorkerPay(1.0,10.0,4).fedTax(),0.0);
	}
	
    public void test2(){
    	assertEquals(new WorkerPay(1.5,10.0,4).fedTax(),0.0);
	}
    
    public void test3(){
    	assertEquals(new WorkerPay(199.5,10.0,4).fedTax(),249.0);
	}
	
    public void test4(){
    	assertEquals(new WorkerPay(200.0,10.0,4).fedTax(),250.0);
	}
    
    public void test5(){
    	assertEquals(new WorkerPay(100.0,1.0,4).fedTax(),0.0);
	}
	
    public void test6(){
    	assertEquals(new WorkerPay(100.0,1.5,4).fedTax(),0.0);
	}
    
    public void test7(){
    	assertEquals(new WorkerPay(100.0,29.0,4).fedTax(),335.0);
	}
	
    public void test8(){
    	assertEquals(new WorkerPay(100.0,30.0,4).fedTax(),350.0);
	}
    
    public void test9(){
    	assertEquals(new WorkerPay(100.0,10.0,1).fedTax(),125.0);
	}
	
    public void test10(){
    	assertEquals(new WorkerPay(100.0,10.0,2).fedTax(),100.0);
	}
    
    public void test11(){
    	assertEquals(new WorkerPay(100.0,10.0,6).fedTax(),0.0);
	}
	
    public void test12(){
    	assertEquals(new WorkerPay(100.0,10.0,7).fedTax(),0.0);
	}
    
    public void test13(){
    	assertEquals(new WorkerPay(100.0,10.0,4).fedTax(),50.0);
	}
}
