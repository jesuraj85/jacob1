/**
 * 被测试类
 */
package junit_4demo;

public class Calculate {

	private static int result;//静态变量，用于存放运行结果
	
	//加法运算
	public void add(int n){
		result=result+n;
	}
	
	//减法运算
	public void subs(int n){
		result=result-n;
	}
	
	//乘法运算
	public void mult(int n){
		result=result*n;
	}
	
	//除法运算
	public void div(int n){
		result=result/n;
	}
	
	//清空结果
	public void clear(){
		result=0;
	}
	
	//返回结果
	public int getResult(){
		return result;
	}
	
}
