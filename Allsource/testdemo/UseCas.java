package testdemo;

public class UseCas {
	/**
	 * 被测试类
	 * 
	 */
	 
		private static int result;//存储结果
		
		//加法运算
		public void add(int n){
			result=result+n;
		}
		
		//获取结果
		public int getResult(){
			return result;
		}
		
		//清空结果
		public void clear(){
			result=0;
		}
	}


