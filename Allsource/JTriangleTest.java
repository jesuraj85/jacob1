import static org.junit.Assert.*;

import org.junit.Test;


public class JTriangleTest  {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	JTriangle tr;
	public void testJudgeTriangle()
	{
		tr=new JTriangle(0,1,2);
		       assertEquals("不能组成三角形",tr.JudgeTriangle());
		tr=new JTriangle(1,0,2);
		       assertEquals("不能组成三角形",tr.JudgeTriangle());
		tr=new JTriangle(2,1,0);
		       assertEquals("不能组成三角形",tr.JudgeTriangle());
	    tr=new JTriangle(1,2,3);
		       assertEquals("不能组成三角形",tr.JudgeTriangle());
		tr=new JTriangle(1,3,2);
		       assertEquals("不能组成三角形",tr.JudgeTriangle());
		tr=new JTriangle(3,1,2);
		       assertEquals("不能组成三角形",tr.JudgeTriangle());
		tr=new JTriangle(3,4,5);
		       assertEquals("能组成一般三角形",tr.JudgeTriangle());
	    tr=new JTriangle(4,3,5);
			   assertEquals("能组成一般三角形",tr.JudgeTriangle());
		tr=new JTriangle(5,4,3);
			   assertEquals("能组成一般三角形",tr.JudgeTriangle());
		tr=new JTriangle(3,4,3);
			   assertEquals("能组成等腰三角形",tr.JudgeTriangle());
		tr=new JTriangle(4,4,5);
			   assertEquals("能组成等腰三角形",tr.JudgeTriangle());
		tr=new JTriangle(3,5,5);
			   assertEquals("能组成等腰三角形",tr.JudgeTriangle());
		tr=new JTriangle(3,3,3);
			   assertEquals("能组成等边三角形",tr.JudgeTriangle());
		tr=new JTriangle(4,4,4);
			    assertEquals("能组成等边三角形",tr.JudgeTriangle());
		tr=new JTriangle(5,5,5);
			    assertEquals("能组成等边三角形",tr.JudgeTriangle());
	}

}
