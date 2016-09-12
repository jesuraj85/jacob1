package com.test.junit3;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * 在junit3.8中测试类必须要继承TestCase父类
 * 
 * keep the bar green to keep the code clean
 * 
 * 单元测试不是证明您是对的，而是证明您没有错误
 */
public class CalculatorTest extends TestCase
{
	/**
	 * 在junit3.8中，测试方法满足如下原则
	 * 1）public的
	 * 2）void的
	 * 3）无方法参数
	 * 4）方法名称必须以test开头
	 */
	
	public void testAdd()
	{
		Calculator cal = new Calculator();
		
		int result = cal.add(1,2);
		
		//断言: assert
		
		Assert.assertEquals(3,result);
	}
	
	public void testMinus()
	{
		Calculator cal = new Calculator();
		
		int result = cal.minus(1,2);
		
		//断言
		
		Assert.assertEquals(-1,result);
	}
	
	public void testMultiply()
	{
		Calculator cal = new Calculator();
		
		int result = cal.multiply(2,3);
		
		//断言
		
		Assert.assertEquals(6,result);
	}
	
	public void testDivide()
	{
		Calculator cal = new Calculator();
		
		int result = 0;
		
		try
		{
			result = cal.divide(6,4);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			
			Assert.fail();
		}
		
		//断言
		
		Assert.assertEquals(1,result);
	}
	
	public void testDivide2()
	{
		Throwable tx = null;
		
		try
		{
			Calculator cal = new Calculator();
			
			cal.divide(4,0);
			
			Assert.fail();
		}
		catch(Exception ex)
		{
			tx = ex;
		}
		
		Assert.assertNotNull(tx);
		
		Assert.assertEquals(Exception.class,tx.getClass());
		
		Assert.assertEquals("除数不能为零！",tx.getMessage());
	}
	
	
	
	
	
}
