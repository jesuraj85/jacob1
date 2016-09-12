package com.travelsky.zhaoyb.junit;
/**
 * �Ҽ���Ҫ���Ե��࣬newһ��junit testcase
 *�½�һ���ļ��д��������ԵĴ��룬Ϊ�˸�Դ�����ֿ�
 * �x���Լ���Ҫ�ķ���ͬʱ��setup��teardown�ȷ���ѡȡ�Զ�����
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
	 * @BeforeClass ִֻ��һ��
	 * ��������Ϊpublic static
	 **/
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("I'm printed by @BeforeClass");
	}
	/**
	 * 
	 * @AfterClass ִֻ��һ��
	 * ��������Ϊpublic static
	 **/
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("I'm printed by @AfterClass");
	}

	@Before
/**
 * ��ʼ������	
 * @before ָ������ÿ��@test֮ǰҪ���е�
 * ��������Ϊpublic
 **/
	public void setUp() throws Exception {
		demo = new MathDemo();
		System.out.println("I'm printed by @Before");
	}
	
/**
 * ���ٷ���
 * @after ָ������ÿ��@test֮ǰҪ���е�
 * ��������Ϊpublic
  */
	@After
	public void tearDown() throws Exception {
		demo =null;
		System.out.println("I'm printed by @After");
	}

	@Test
	public void testAdd() {
		int expected = 2;
		int actualValue = demo.add(1, 1);// ��ʵֵ
		assertEquals("���������", expected, actualValue);
	}

	@Test(expected=ArithmeticException.class)//�����ܷ�ӵ������쳣��
	public void testDiv() {
		int expected = 2; // ����ֵ
		int actualValue = demo.div(2, 0);// ��ʵֵ
		assertEquals("���������", expected, actualValue);// ���Է���
	}
  @Test(timeout=1)//����div��ʱ�����ܣ�����1ms�Զ��ж�Ϊ����
  public void testDivtime()
  {
	  assertEquals( 5, demo.div(10, 2));
  }
}
