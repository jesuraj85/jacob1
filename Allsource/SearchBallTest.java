import static org.junit.Assert.*;

import org.junit.Test;


public class SearchBallTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	
	}
	int a0[]={1,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3};
	int a1[]={3,1,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3};
	int a2[]={3,3,1,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3};		
	int a3[]={3,3,3,1,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3};
	int a4[]={3,3,3,3,1,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3};
	int a5[]={3,3,3,3,3,1,3,3,3,3,3,3,3,3,3,3,3,3,3,3};
	int a6[]={3,3,3,3,3,3,1,3,3,3,3,3,3,3,3,3,3,3,3,3};
	int a7[]={3,3,3,3,3,3,3,1,3,3,3,3,3,3,3,3,3,3,3,3};
	int a8[]={3,3,3,3,3,3,3,3,1,3,3,3,3,3,3,3,3,3,3,3};
	int a9[]={3,3,3,3,3,3,3,3,3,1,3,3,3,3,3,3,3,3,3,3};
    int a10[]={3,3,3,3,3,3,3,3,3,3,1,3,3,3,3,3,3,3,3,3};
	int a11[]={3,3,3,3,3,3,3,3,3,3,3,1,3,3,3,3,3,3,3,3};
	int a12[]={3,3,3,3,3,3,3,3,3,3,3,3,1,3,3,3,3,3,3,3};
	int a13[]={3,3,3,3,3,3,3,3,3,3,3,3,3,1,3,3,3,3,3,3};
	int a14[]={3,3,3,3,3,3,3,3,3,3,3,3,3,3,1,3,3,3,3,3};
	int a15[]={3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,1,3,3,3,3};
	int a16[]={3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,1,3,3,3};
	int a17[]={3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,1,3,3};
	int a18[]={3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,1,3};
	int a19[]={3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,1};
	
	public void testBeginSearch()
	{
		SearchBall SB=new SearchBall();
		SB.setBWeight(a0);
		assertEquals("1∫≈ «ºŸ«Ú",SB.BeginSearch());
		SB.setBWeight(a1);
		assertEquals("2∫≈ «ºŸ«Ú",SB.BeginSearch());
		SB.setBWeight(a2);
		assertEquals("3∫≈ «ºŸ«Ú",SB.BeginSearch());
		SB.setBWeight(a3);
		assertEquals("4∫≈ «ºŸ«Ú",SB.BeginSearch());
		SB.setBWeight(a4);
		assertEquals("5∫≈ «ºŸ«Ú",SB.BeginSearch());
		SB.setBWeight(a5);
		assertEquals("6∫≈ «ºŸ«Ú",SB.BeginSearch());
		SB.setBWeight(a6);
		assertEquals("7∫≈ «ºŸ«Ú",SB.BeginSearch());
		SB.setBWeight(a7);
		assertEquals("8∫≈ «ºŸ«Ú",SB.BeginSearch());
		SB.setBWeight(a8);
		assertEquals("9∫≈ «ºŸ«Ú",SB.BeginSearch());
		SB.setBWeight(a9);
		assertEquals("10∫≈ «ºŸ«Ú",SB.BeginSearch());
		SB.setBWeight(a10);
		assertEquals("11∫≈ «ºŸ«Ú",SB.BeginSearch());
		SB.setBWeight(a11);
		assertEquals("12∫≈ «ºŸ«Ú",SB.BeginSearch());
		SB.setBWeight(a12);
		assertEquals("13∫≈ «ºŸ«Ú",SB.BeginSearch());
		SB.setBWeight(a13);
		assertEquals("14∫≈ «ºŸ«Ú",SB.BeginSearch());
		SB.setBWeight(a14);
		assertEquals("15∫≈ «ºŸ«Ú",SB.BeginSearch());
		SB.setBWeight(a15);
		assertEquals("16∫≈ «ºŸ«Ú",SB.BeginSearch());
		SB.setBWeight(a16);
		assertEquals("17∫≈ «ºŸ«Ú",SB.BeginSearch());
		SB.setBWeight(a17);
		assertEquals("18∫≈ «ºŸ«Ú",SB.BeginSearch());
		SB.setBWeight(a18);
		assertEquals("19∫≈ «ºŸ«Ú",SB.BeginSearch());
		SB.setBWeight(a19);
		assertEquals("20∫≈ «ºŸ«Ú",SB.BeginSearch());
		
	}
	public static void main(String args[])
	{
		junit.textui.TestRunner.run(SearchBallTest.class);
	}
	
}
