package kfu.soft;

import junit.framework.TestCase;
import junit.framework.Assert;

public class CalculatorTest  extends TestCase{
	
	Calculator cal;
	public void testAdd(){
		cal = new Calculator();
		
		int actual = cal.add(3, 2);//实际执行结果
		int expected = 5;//期望值
		
		Assert.assertEquals(expected, actual);
	}
	public void testMinus(){
		cal = new Calculator();
		
		Assert.assertEquals(1, cal.minus(3, 2));
	}
	public void testMultiphy(){
		cal = new Calculator();
		
		Assert.assertEquals(6, cal.multiphy(3, 2));
	}
	public void testDivide(){
		Throwable tx = null;
		cal = new Calculator();
		int actual = 0;
		try{
			actual = cal.divide(5, 0);
			Assert.fail();			
		}catch(Exception ex){
			tx = ex;
			tx.printStackTrace();
		}
		Assert.assertNotNull(tx);
		Assert.assertEquals(Exception.class, tx.getClass());
		Assert.assertEquals("除数不能为零！", tx.getMessage());
	}
	public void testDivide2(){
		cal = new Calculator();
		
		int actual = 0;
		try{
			actual = cal.divide(3, 2);
		}
		catch(Exception ex){
			Assert.fail();
			ex.printStackTrace();
		}
		//Assert.fail();
		Assert.assertEquals(1, actual);
	}

}
