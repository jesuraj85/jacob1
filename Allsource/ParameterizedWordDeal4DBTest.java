package com.travelsky.zhaoyb.junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedWordDeal4DBTest {
	private String expected;
	private String target;
	WordDeal4DB db =new WordDeal4DB();
	/**
	 * 构造参数集
	 * */
	@Parameters
	public static Collection<Object[]> words ()
	{
		return Arrays.asList(new Object[][]{
				{"employee_info","employeeInfo"},
				{"",""},
				{"employee_info","EmployeeInfo"},
				{"employee_info_a","EmployeeInfoA"},
				{"employee_a_info","EmployeeAInfo"}
		});
	}
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
/**
 * 参数化测试构造函数
 * @param expected 期望结果，对应参数集第一个参数
 * @param target	测试数据，对应参数集第二参数
 * */
	public ParameterizedWordDeal4DBTest(String expected,String target){
		this.expected =expected;
		this.target =target;
	}
	
	/**
	 * 开始测试
	 * */
	@Test
	public void testWordFormat4DB() {
		assertEquals(expected,db.wordFormat4DB(target));
	}

}
