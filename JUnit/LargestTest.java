package test.junit;

import junit.framework.*;

public class LargestTest extends TestCase 
{
	private Largest largest;
	
	public void setUp()
	{
		largest  = new Largest();
	}
	
	public void testgetlargest()
	{
		int[] arrayint = {2,6,58,-4};
		
		int result = 0;
		try 
		{
			result = largest.getLargest(arrayint);
		}
		catch (Exception e) 
		{
			
			e.printStackTrace();
			Assert.fail();
		}
		
		Assert.assertEquals(58, result);
	}
	
	public void testgetlargest2()
	{
		Throwable tx = null;
		int[] arrayint = {};		
		int result = 0;
		try 
		{
			result = largest.getLargest(arrayint);
			Assert.fail();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			tx = e;
		}
		
		Assert.assertNotNull(tx);
		Assert.assertEquals(Exception.class, tx.getClass());
		Assert.assertEquals("数组长度不能为零，请重新输入！", tx.getMessage());
	}
	
	public void testgetlargest3()
	{
		Throwable tx = null;
		int[] arrayint = null;		
		int result = 0;
		try 
		{
			result = largest.getLargest(arrayint);
			Assert.fail();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			tx = e;
		}
		
		Assert.assertNotNull(tx);
		Assert.assertEquals(Exception.class, tx.getClass());
		Assert.assertEquals("数组长度异常，请重新输入！", tx.getMessage());
	}
	
	public void testgetlargest4()
	{
		Throwable tx = null;
		int[] arrayint = {1,2,3,4,5};		
		int result = 0;
		try 
		{
			result = largest.getLargest(arrayint);
			Assert.fail();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			tx = e;
		}
		
		Assert.assertNotNull(tx);
		Assert.assertEquals(Exception.class, tx.getClass());
		Assert.assertEquals("数组长度不能大于3，请重新输入！", tx.getMessage());
	}

}
