/**
 * ��������
 */
package junit_4demo;

public class Calculate {

	private static int result;//��̬���������ڴ�����н��
	
	//�ӷ�����
	public void add(int n){
		result=result+n;
	}
	
	//��������
	public void subs(int n){
		result=result-n;
	}
	
	//�˷�����
	public void mult(int n){
		result=result*n;
	}
	
	//��������
	public void div(int n){
		result=result/n;
	}
	
	//��ս��
	public void clear(){
		result=0;
	}
	
	//���ؽ��
	public int getResult(){
		return result;
	}
	
}
