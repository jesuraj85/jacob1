package com.test.junit3;

public class Triangle 
{
	public String triangleTest(int a,int b,int c) throws Exception
	{
		String result = null;
		
		if(a <= 0 || b <= 0 || c <= 0)
		{
			throw new Exception("三角形的边长必须为正整数，请重新输入！");
		}
		
		if(a + b <= c || b + c <= a || a + c <= b)
		{
			throw new Exception("两边之和必须大于第三边，请重新输入！");
		}
		
		if(a == b && b == c)
		{
			result = "等边三角形";				
		}
		else if(a == b || b == c || c == a)
		{
			
			result = "等腰三角形";
		}
		else if(a*a+b*b == c*c ||b*b + c*c == a*a || c*c + a*a == b*b)
		{
			result = "直角三角形";
		}
		else 
		{
			result = "一般三角形";
		}
		
		return result;			
	}
	
	
	

}
