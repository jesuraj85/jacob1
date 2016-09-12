package com.travelsky.zhaoyb.junit;
/**
 * 右键需要测试的类，new一个junit testcase
 *新建一个文件夹存放这个测试的代码，为了跟源码区分开
 * 選擇自己需要的方法同时对setup、teardown等方法选取自动生成
 * @author  Zhaoyb
 **/
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MathDemoTest{
	MathDemo demo;
	
	/**
	 * 
	 * @BeforeClass 只执行一次
	 * 必须声明为public static
	 **/
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("I'm printed by @BeforeClass");
	}
	/**
	 * 
	 * @AfterClass 只执行一次
	 * 必须声明为public static
	 **/
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("I'm printed by @AfterClass");
	}

	@Before
/**
 * 初始化方法	
 * @before 指的是在每个@test之前要运行的
 * 必须声明为public
 **/
	public void setUp() throws Exception {
		demo = new MathDemo();
		System.out.println("I'm printed by @Before");
	}
	
/**
 * 销毁方法
 * @after 指的是在每个@test之前要运行的
 * 必须声明为public
  */
	@After
	public void tearDown() throws Exception {
		demo =null;
		System.out.println("I'm printed by @After");
	}

	@Test
	public void testAdd() {
		int expected = 2;
		int actualValue = demo.add(1, 1);// 真实值
		assertEquals("两个数相加", expected, actualValue);
	}

	@Test(expected=ArithmeticException.class)//测试能否接到算数异常。
	public void testDiv() {
		int expected = 2; // 期望值
		int actualValue = demo.div(2, 0);// 真实值
		assertEquals("两个数相除", expected, actualValue);// 断言方法
	}
  @Test(timeout=1)//测试div的时间性能，超过1ms自动判断为错误
  public void testDivtime()
  {
	  assertEquals( 5, demo.div(10, 2));
  }
}
