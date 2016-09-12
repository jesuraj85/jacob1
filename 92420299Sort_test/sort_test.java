import junit.framework.TestCase;
import org.junit.Test; 


public class sort_test extends TestCase {
   int[] test = {3, 2, 1, 4, 7, 6, 5, 8, 10, 9};
   int[] sample = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
   Sort sort = new Sort();
   
   @Test
   public void test_bubble()
   {
	   int[] trial = sort.bubbleSort(test);
	   
	   for(int i = 0;i<trial.length;i++)
	   {
		 System.out.print(trial[i]);
		 assertEquals("Result",sample[i],trial[i]);
	   }
	   System.out.println();
   }
   @Test
   public void test_quick()
   {
	   int[] trial = sort.quickSort(test);
	   
	   for(int i = 0;i<trial.length;i++)
	   {
		 System.out.print(trial[i]);
		 assertEquals("Result",sample[i],trial[i]);
	   }
	   System.out.println();
   }
   @Test
   public void test_merge()
   {
	   int[] trial = sort.mergeSort(test);
	   
	   for(int i = 0;i<trial.length;i++)
	   {
		 System.out.print(trial[i]);
		 assertEquals("Result",sample[i],trial[i]);
	   }
	   System.out.println();
   }
   @Test
   public void test_heap()
   {
	   int[] trial = sort.heapSort(test);
	   
	   for(int i = 0;i<trial.length;i++)
	   {
		 System.out.print(trial[i]);
		 assertEquals("Result",sample[i],trial[i]);
	   }
   }
}
