package com.test.junit3;

public class Triangle 
{
	public String triangleTest(int a,int b,int c) throws Exception
	{
		String result = null;
		
		if(a <= 0 || b <= 0 || c <= 0)
		{
			throw new Exception("�����εı߳�����Ϊ�����������������룡");
		}
		
		if(a + b <= c || b + c <= a || a + c <= b)
		{
			throw new Exception("����֮�ͱ�����ڵ����ߣ����������룡");
		}
		
		if(a == b && b == c)
		{
			result = "�ȱ�������";				
		}
		else if(a == b || b == c || c == a)
		{
			
			result = "����������";
		}
		else if(a*a+b*b == c*c ||b*b + c*c == a*a || c*c + a*a == b*b)
		{
			result = "ֱ��������";
		}
		else 
		{
			result = "һ��������";
		}
		
		return result;			
	}
	
	
	

}
