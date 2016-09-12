package kfu.soft;

//静态引用
import static org.junit.Assert.assertEquals;
//import org.junit.Assert;
import org.junit.*;

public class CalculatorJUnit4Test
{
	private Calculator cal;
	
	//在所有测试方法执行之前执行一次
	@BeforeClass
	public static void initBefore()
	{
		System.out.println("initBefore!");
	}
	//	在所有测试方法执行之后执行一次
	@AfterClass
	public static void endAfter()
	{
		System.out.println("endAfter!");
	}
	//	在每个测试方法执行之前执行一次
	@Before
	public void init()
	{
		cal = new Calculator();
		System.out.println("init!");
	}
	//	在每个测试方法执行之后执行一次
	@After
	public void end()
	{
		System.out.println("end!");
	}
	
	//加法测试
	@Test
	public void myadd()
	{
		//Calculator cal = new Calculator();
		int result = cal.add(3, 4);
		assertEquals(7,result);
	}
	//减法测试
	@Test
	public void myminus()
	{
		//Calculator cal = new Calculator();
		int result = cal.minus(3, 4);
		assertEquals(-1,result);
	}
	//乘法测试
	@Test
	public void mymultiphy()
	{
		//Calculator cal = new Calculator();
		int result = cal.multiphy(3, 4);
		assertEquals(12,result);
	}
	//正常除法功能测试
	@Test
	public void mydivide() 
	{
		//Calculator cal = new Calculator();
		int result = 0;
		try
		{
			result = cal.divide(3, 4);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		assertEquals(0,result);
	}
	//异常情况测试
	@Test(expected = Exception.class)
	public void mydivide2() throws Exception
	{
		cal.divide(3,0);
			
	}
	
	

}
