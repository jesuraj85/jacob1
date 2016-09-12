import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TriangleTest {
Triangle tri;
	@Before
	public void setUp() throws Exception {
	}

	 

	@Test
	public void testJudgeTriangle1() {
		
		 tri=new  Triangle(0,1,2);
		 String print =tri.JudgeTriangle();
		 assertEquals("非三角形",print);
		 
	}
	@Test
	public void testJudgeTriangle2() {
		
		 tri=new  Triangle(2,0,1);  
		 String print =tri.JudgeTriangle();
		 assertEquals("非三角形",print);
		 
	}
	@Test
	public void testJudgeTriangle3() {
		
		 tri=new  Triangle(2,3,0);
		 String print =tri.JudgeTriangle();
		 assertEquals("非三角形",print);
		 
	}
	@Test
	public void testJudgeTriangle4() {
		
		 tri=new  Triangle(0,0,2);
		 String print =tri.JudgeTriangle();
		 assertEquals("非三角形",print);
		 
	}
	@Test
	public void testJudgeTriangle5() {
		
		 tri=new  Triangle(0,2,0);
		 String print =tri.JudgeTriangle();
		 assertEquals("非三角形",print);
		 
	}
	@Test
	public void testJudgeTriangle6() {
		
		 tri=new  Triangle(2,0,0);
		 String print =tri.JudgeTriangle();
		 assertEquals("非三角形",print);
		 
	}
	@Test
	public void testJudgeTriangle7() {
		
		 tri=new  Triangle(0,0,0);
		 String print =tri.JudgeTriangle();
		 assertEquals("非三角形",print);
		 
	}
	@Test
	public void testJudgeTriangle8() {
		  
		 tri=new  Triangle(1,2,3);
		 String print =tri.JudgeTriangle();
		 assertEquals("非三角形",print);
		 
	}
	@Test
	public void testJudgeTriangle9() {
		
		 tri=new  Triangle(1,3,2);
		 String print =tri.JudgeTriangle();
		 assertEquals("非三角形",print);
		 
	}
	@Test
	public void testJudgeTriangle10() {
		
		 tri=new  Triangle(3,2,1);
		 String print =tri.JudgeTriangle();
		 assertEquals("非三角形",print);
		 
	}
	@Test
	public void testJudgeTriangle11() {
		
		 tri=new  Triangle(3,3,3);
		 String print =tri.JudgeTriangle();
		 assertEquals("等边三角形",print);
		 
	}
	@Test
	public void testJudgeTriangle12() {
		
		 tri=new  Triangle(5,5,5);
		 String print =tri.JudgeTriangle();
		 assertEquals("等边三角形",print);
		 
	}
	@Test
	public void testJudgeTriangle13() {
		
		 tri=new  Triangle(2,2,3);
		 String print =tri.JudgeTriangle();
		 assertEquals("等腰三角形",print);
		 
	}
	@Test
	public void testJudgeTriangle14() {
		
		 tri=new  Triangle(2,3,2);
		 String print =tri.JudgeTriangle();
		 assertEquals("等腰三角形",print);
		 
	}
	@Test
	public void testJudgeTriangle15() {
		
		 tri=new  Triangle(3,2,2);
		 String print =tri.JudgeTriangle();
		 assertEquals("等腰三角形",print);
		 
	} 
	@Test
	public void testJudgeTriangle16() {
		
		 tri=new  Triangle(3,4,5);
		 String print =tri.JudgeTriangle();
		 assertEquals("直角三角形",print);
		 
	}
	@Test
	public void testJudgeTriangle17() {
		
		 tri=new  Triangle(3,5,4);
		 String print =tri.JudgeTriangle();
		 assertEquals("直角三角形",print);
		 
	}
	@Test
	public void testJudgeTriangle18() {
		
		 tri=new  Triangle(10,8,6);
		 String print =tri.JudgeTriangle();
		 assertEquals("直角三角形",print);
		 
	}
	@Test
	public void testJudgeTriangle19() {
		
		 tri=new  Triangle(3,5,6);
		 String print =tri.JudgeTriangle();
		 assertEquals("一般三角形",print);
		 
	}
	@Test
	public void testJudgeTriangle20() {
		
		 tri=new  Triangle(7,8,9);
		 String print =tri.JudgeTriangle();
		 assertEquals("一般三角形",print);
		 
	}
}
