
public class heap_sort {
	  public int[] heapSort(int[] input) {
		    int len = input.length;
		    for (int k = len / 2; k > 0; k--) {
		      downHeap(input, k, len);
		    }
		    
		    do{
		      int temp = input[0];
		      input[0] = input[len - 1];
		      input[len - 1] = temp;
		      len = len - 1;
		      downHeap(input, 1, len);
		    }while (len > 1);
		    return input;
		  }

		 

		  private static void downHeap(int input[], int k, int len){
		    int temp = input[k - 1];

		    while (k <= len / 2){
		      int j = 2 * k;

		      if ( (j < len) && (input[j - 1] < input[j]) ) {
		        j++;
		      }
		      if (temp >= input[j - 1]) {
		        break;
		      }
		      else{
		        input[k - 1] = input[j - 1];
		        k = j;
		      }
		    }
		    input[k - 1] = temp;
		  } 
}
