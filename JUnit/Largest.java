package test.junit;

public class Largest 
{
	public int getLargest(int[] array) throws Exception
	{
		int result;
		if(null == array)
		{
			throw new Exception("���鳤���쳣�����������룡");
		}
		if(0 == array.length)
		{
			throw new Exception("���鳤�Ȳ���Ϊ�㣬���������룡");
		}
		if(4 < array.length)
		{
			throw new Exception("���鳤�Ȳ��ܴ���3�����������룡");
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
