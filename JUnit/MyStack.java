package com.test.junit3;

public class MyStack
{
	private String[] elements;

	private int nextIndex;

	public MyStack()
	{
		elements = new String[100];
		nextIndex = 0;
	}

	//��ջ
	public void push(String element) throws Exception
	{
		if (100 == nextIndex)
		{
			throw new Exception("����Խ���쳣!");
		}
		elements[nextIndex++] = element;
	}

	//��ջ
	public String pop() throws Exception
	{
		if (0 == nextIndex)
		{
			throw new Exception("����Խ���쳣!");
		}
		return elements[--nextIndex];
	}

	//ɾ��ջ����n��Ԫ��
	public void delete(int n) throws Exception
	{
		if (nextIndex - n < 0)
		{
			throw new Exception("����Խ���쳣!");
		}
		nextIndex -= n;
	}
	//ȡջ��Ԫ��
	public String top() throws Exception
	{
		if (0 == nextIndex)
		{
			throw new Exception("����Խ���쳣!");
		}
		return elements[nextIndex - 1];
	}

}
