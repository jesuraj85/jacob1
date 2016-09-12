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
	 * ���������
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
 * ���������Թ��캯��
 * @param expected �����������Ӧ��������һ������
 * @param target	�������ݣ���Ӧ�������ڶ�����
 * */
	public ParameterizedWordDeal4DBTest(String expected,String target){
		this.expected =expected;
		this.target =target;
	}
	
	/**
	 * ��ʼ����
	 * */
	@Test
	public void testWordFormat4DB() {
		assertEquals(expected,db.wordFormat4DB(target));
	}

}
