/**
 * ������
 */
package junit_4demo;

import org.junit.*;
import static org.junit.Assert.*;
public class CalculateTest {

	private Calculate calculate=new Calculate();//���屻���������
	
	@Before
	public void setUp(){
		System.out.println("��ʼ��");
		calculate.clear();
	}
	
	@Test
	public void testAdd(){
		calculate.add(2);
		calculate.add(3);
		assertEquals(5,calculate.getResult());
		System.out.println("�ӷ�����");
	}
	
	@Test
	public void testSub(){
		calculate.add(10);
		calculate.subs(2);
		assertEquals(8,calculate.getResult());
		System.out.println("��������");
	}
	
	@Test
	public void testMult(){
		calculate.add(2);
		calculate.mult(3);
		assertEquals(6,calculate.getResult());
		System.out.println("�˷�����");
	}
	
	@Test
	public void testDiv(){
		calculate.add(10);
		calculate.div(2);
		assertEquals(5,calculate.getResult());
		System.out.println("��������");
	}
	
	@After
	public void tearDown(){
		calculate.clear();
		System.out.println("���Խ���\n");
	}
}
