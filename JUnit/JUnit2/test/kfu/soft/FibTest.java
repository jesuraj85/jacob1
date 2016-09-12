package kfu.soft;

import org.junit.*;

/*测试驱动开发————敏捷开发。
 *步骤：1、通过理解程序功能，查看详细设计模块说明书。
 *        分析被测模块Cfib(int n)的功能，确定输入是n、输出是array。 
 * 2、设计测试用例——等价类法。
 * 3、编写测试方法。
 * 4、编写正常模型Cfib的代码。
 * 5、运行测试，使测试用例正常通过。——说明Cfib代码编写完成、正确。
 *    步骤1-5是开发的过程。
 * 下面的测试工作将大大简化。——体现出“敏捷”的含义。
 */
/*
 * Fib功能描述如下：
 * 1、Fib类中只有一个方法Cfib(int n),它的功能是返回斐波那契数列的前n位。
 * 2、Cfib的输入是整数n，n不能为零或负数。
 * 3、Cfib的输出是整形数组，其中放置斐波那契数列的前n位。
 * 
 * 测试用例设计如下：
 * 1、n=1。此时array[0] = 0;
 * 2、n=2.此时array[1] = 1;
 * 3、n取典型值，比如n=8或10。此时，array[n] = array[n-1]+array[n-2];
 * 4、n取0或负数，此时不能生产斐波那契数列。异常抛出。
 * 5、可选的测试用例。限定n不能太大，比如n<10000。* 
 * 
 * */

public class FibTest {
	Fib fib;
	
	//初始化。
	@Before
	public void init(){
		fib = new Fib();		
	}
	
	//测试用例1.n = 1
	@Test
	public void fibtest1(){
		int[] actualarr;
		
		actualarr = fib.Cfib(1);		
		
		Assert.assertEquals(0, actualarr[0]);		
	}
	
	//测试用例2.n = 2
	@Test
	public void fibtest2(){
		
	}
	//测试用例3.n = 8或10
	//检测运行结果时，用Assert断言数组中的最后一个元素。
	@Test
	public void fibtest3(){
		//比较整个数组时，应该逐个比较数组中的每个元素。		
		
	}
	//测试用例1.n = 0或-1
	//异常情况的测试。
	@Test
	public void fibtest4(){
		
	}
	

}
