/**
 * ������
 */
package testdemo;

import org.junit.*;
import static org.junit.Assert.*;
public class TestUseCase {

	private UseCas  uc=new UseCas ();
	
	@Before
	public void setUp(){
		System.out.println("��ʼ��");
		uc.clear();
	}
	
	@Test
	public void testAdd(){
		uc.add(1);
		uc.add(1);
		assertEquals(2,uc.getResult());
		System.out.println("�ӷ�����");
	}
	
	@After
	public void tearDown(){
		uc.clear();
		System.out.println("���Խ���");
	}
}
