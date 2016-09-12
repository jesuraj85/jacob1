package com.test.junit3;

import junit.framework.Assert;
import junit.framework.TestCase;

public class MyStackTest extends TestCase
{
	private MyStack myStack;

	public void setUp()
	{
		myStack = new MyStack();
	}
	//测试进栈和出栈操作
	//测试栈中只有一个元素的情况
	public void testPush()
	{
		try
		{
			myStack.push("hello world");
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String result = null;
		try
		{
			result = myStack.pop();
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Assert.assertEquals("hello world", result);
	}
	//测试进栈和出栈操作
	//测试栈被装满的情况
	public void testPush2()
	{
		for (int i = 0; i < 100; ++i)
		{
			try
			{
				myStack.push(i + "");
			}
			catch (Exception e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		for (int i = 0; i < 100; ++i)
		{
			String result = null;
			try
			{
				result = myStack.pop();
			}
			catch (Exception e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			Assert.assertEquals((99 - i) + "", result);
		}
	}

	//测试栈满后进栈的情况
	//异常情况
	public void testPush3()
	{
		Throwable tx = null;

		try
		{
			for (int i = 0; i <= 100; ++i)
			{
				myStack.push(i + "");
			}

			Assert.fail();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			tx = e;
		}

		Assert.assertNotNull(tx);
		Assert.assertEquals(Exception.class, tx.getClass());
		Assert.assertEquals("数组越界异常!", tx.getMessage());
	}

	//测试栈为空时出栈的异常情况
	public void testPop()
	{
		Throwable tx = null;

		try
		{
			myStack.pop();
			Assert.fail();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			tx = e;
		}
		Assert.assertNotNull(tx);
		Assert.assertEquals(Exception.class, tx.getClass());
		Assert.assertEquals("数组越界异常!", tx.getMessage());
	}

	//测试栈中有数据时取栈顶元素的情况
	public void testTop()
	{
		try
		{
			myStack.push("hello world");

			String result = myStack.top();

			Assert.assertEquals("hello world", result);
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}

	//测试栈为空时取栈顶元素的异常情况
	public void testTop2()
	{
		Throwable tx = null;

		try
		{
			myStack.top();

			Assert.fail();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			tx = e;
		}
		Assert.assertNotNull(tx);
		Assert.assertEquals(Exception.class, tx.getClass());
		Assert.assertEquals("数组越界异常!", tx.getMessage());
	}

	//测试正常删除栈顶n个元素的情况
	public void testDelete()
	{
		try
		{
			for (int i = 0; i < 10; ++i)
			{
				myStack.push(i + "");
			}

			myStack.delete(10);
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
			Assert.fail();
		}
	}
	//测试删除异常的情况。
	public void testDelete2()
	{
		Throwable tx = null;

		try
		{
			for (int i = 0; i < 10; ++i)
			{
				myStack.push(i + "");
			}

			myStack.delete(11);

			myStack.push("hello world");
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
			tx = ex;
		}

		Assert.assertNotNull(tx);
		Assert.assertEquals(Exception.class, tx.getClass());
		Assert.assertEquals("数组越界异常!", tx.getMessage());
	}

}
