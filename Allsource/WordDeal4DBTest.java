package com.travelsky.zhaoyb.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class WordDeal4DBTest {
	WordDeal4DB WD4DB;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		WD4DB = new WordDeal4DB();
	}

	@After
	public void tearDown() throws Exception {
		WD4DB = null;
	}

	@Test
	public void testWordFormat4DB() {
		String target = "employeeInfo";
		String expected = "employee_info";
		String actual = WD4DB.wordFormat4DB(target);
		assertEquals(expected, actual);
	}

	/**
	 * 字符中有“ ”空格
	 * */
	@Test
	public void testWordFormat4DBNull() {
		String target = "";
		String expected = "";
		String actual = WD4DB.wordFormat4DB(target);
		assertEquals(expected, actual);
	}
	
	/**
	 * 首字母大写
	 * */
	@Test
	public void testWordFormat4DBBegin() {
		String target = "EmployeeInfo";
		String expected = "employee_info";
		String actual = WD4DB.wordFormat4DB(target);
		assertEquals(expected, actual);
	}
	
	/**
	 * 多个大写字母连续
	 * */
	@Test(timeout =10)
	public void testWordFormat4DBMore() {
		String target = "employeeAInfo";
		String expected = "employee_a_info";
		String actual = WD4DB.wordFormat4DB(target);
		assertEquals(expected, actual);
	}


}
