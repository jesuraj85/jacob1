/**
 * ������
 */
package junitdemo;

import junit.framework.TestCase;

public class UseCaseTest extends TestCase{
	private UseCase uc=new UseCase();
	private int num1;
	private int num2;
	
	
	//����ʹ��setUp()�������г�ʼ��
	public void setUp(){
		System.out.println("��ʼ��");
		this.num1=2;
		this.num2=1;
	}
	//���Լӷ�
	public void testAdd(){
		assertEquals(3,uc.add(num1, num2));//����UseCase�е�add����
		System.out.println("�ӷ�����--");
	}
	//���Խ���
	public void testSubs(){
		assertEquals(1,uc.subs(num1, num2));
		System.out.println("��������--");
	}
	
	//��ձ���
	public void tearDown(){
		num1=0;
		num2=0;
		System.out.println("���Խ���\n");
	}
	

}
