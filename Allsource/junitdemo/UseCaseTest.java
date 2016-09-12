/**
 * 测试类
 */
package junitdemo;

import junit.framework.TestCase;

public class UseCaseTest extends TestCase{
	private UseCase uc=new UseCase();
	private int num1;
	private int num2;
	
	
	//必须使用setUp()方法进行初始化
	public void setUp(){
		System.out.println("初始化");
		this.num1=2;
		this.num2=1;
	}
	//测试加法
	public void testAdd(){
		assertEquals(3,uc.add(num1, num2));//调用UseCase中的add方法
		System.out.println("加法运算--");
	}
	//测试剑法
	public void testSubs(){
		assertEquals(1,uc.subs(num1, num2));
		System.out.println("减法运算--");
	}
	
	//清空变量
	public void tearDown(){
		num1=0;
		num2=0;
		System.out.println("测试结束\n");
	}
	

}
