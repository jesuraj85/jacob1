/**
 * 测试类
 */
package junit_4demo;

import org.junit.*;
import static org.junit.Assert.*;
public class CalculateTest {

	private Calculate calculate=new Calculate();//定义被测试类对象
	
	@Before
	public void setUp(){
		System.out.println("初始化");
		calculate.clear();
	}
	
	@Test
	public void testAdd(){
		calculate.add(2);
		calculate.add(3);
		assertEquals(5,calculate.getResult());
		System.out.println("加法运算");
	}
	
	@Test
	public void testSub(){
		calculate.add(10);
		calculate.subs(2);
		assertEquals(8,calculate.getResult());
		System.out.println("减法运算");
	}
	
	@Test
	public void testMult(){
		calculate.add(2);
		calculate.mult(3);
		assertEquals(6,calculate.getResult());
		System.out.println("乘法运算");
	}
	
	@Test
	public void testDiv(){
		calculate.add(10);
		calculate.div(2);
		assertEquals(5,calculate.getResult());
		System.out.println("除法运算");
	}
	
	@After
	public void tearDown(){
		calculate.clear();
		System.out.println("测试结束\n");
	}
}
