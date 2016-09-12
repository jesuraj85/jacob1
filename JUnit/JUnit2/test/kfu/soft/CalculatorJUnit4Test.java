package kfu.soft;

//��̬����
import static org.junit.Assert.assertEquals;
//import org.junit.Assert;
import org.junit.*;

public class CalculatorJUnit4Test
{
	private Calculator cal;
	
	//�����в��Է���ִ��֮ǰִ��һ��
	@BeforeClass
	public static void initBefore()
	{
		System.out.println("initBefore!");
	}
	//	�����в��Է���ִ��֮��ִ��һ��
	@AfterClass
	public static void endAfter()
	{
		System.out.println("endAfter!");
	}
	//	��ÿ�����Է���ִ��֮ǰִ��һ��
	@Before
	public void init()
	{
		cal = new Calculator();
		System.out.println("init!");
	}
	//	��ÿ�����Է���ִ��֮��ִ��һ��
	@After
	public void end()
	{
		System.out.println("end!");
	}
	
	//�ӷ�����
	@Test
	public void myadd()
	{
		//Calculator cal = new Calculator();
		int result = cal.add(3, 4);
		assertEquals(7,result);
	}
	//��������
	@Test
	public void myminus()
	{
		//Calculator cal = new Calculator();
		int result = cal.minus(3, 4);
		assertEquals(-1,result);
	}
	//�˷�����
	@Test
	public void mymultiphy()
	{
		//Calculator cal = new Calculator();
		int result = cal.multiphy(3, 4);
		assertEquals(12,result);
	}
	//�����������ܲ���
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
	//�쳣�������
	@Test(expected = Exception.class)
	public void mydivide2() throws Exception
	{
		cal.divide(3,0);
			
	}
	
	

}
