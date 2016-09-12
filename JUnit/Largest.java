package test.junit;

public class Largest 
{
	public int getLargest(int[] array) throws Exception
	{
		int result;
		if(null == array)
		{
			throw new Exception("数组长度异常，请重新输入！");
		}
		if(0 == array.length)
		{
			throw new Exception("数组长度不能为零，请重新输入！");
		}
		if(4 < array.length)
		{
			throw new Exception("数组长度不能大于3，请重新输入！");
		}
		
		result = array[0];
		for(int i = 0 ; i < array.length ; i++)
		{
			if(result < array[i])
			{
				result = array[i];
			}
		}
		
		return result;		
	}

}
