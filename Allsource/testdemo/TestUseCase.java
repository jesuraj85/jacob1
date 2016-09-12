/**
 * 测试类
 */
package testdemo;

import org.junit.*;
import static org.junit.Assert.*;
public class TestUseCase {

	private UseCas  uc=new UseCas ();
	
	@Before
	public void setUp(){
		System.out.println("初始化");
		uc.clear();
	}
	
	@Test
	public void testAdd(){
		uc.add(1);
		uc.add(1);
		assertEquals(2,uc.getResult());
		System.out.println("加法运算");
	}
	
	@After
	public void tearDown(){
		uc.clear();
		System.out.println("测试结束");
	}
}
