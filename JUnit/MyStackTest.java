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
	//���Խ�ջ�ͳ�ջ����
	//����ջ��ֻ��һ��Ԫ�ص����
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
	//���Խ�ջ�ͳ�ջ����
	//����ջ��װ�������
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

	//����ջ�����ջ�����
	//�쳣���
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
		Assert.assertEquals("����Խ���쳣!", tx.getMessage());
	}

	//����ջΪ��ʱ��ջ���쳣���
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
		Assert.assertEquals("����Խ���쳣!", tx.getMessage());
	}

	//����ջ��������ʱȡջ��Ԫ�ص����
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

	//����ջΪ��ʱȡջ��Ԫ�ص��쳣���
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
		Assert.assertEquals("����Խ���쳣!", tx.getMessage());
	}

	//��������ɾ��ջ��n��Ԫ�ص����
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
	//����ɾ���쳣�������
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
		Assert.assertEquals("����Խ���쳣!", tx.getMessage());
	}

}
