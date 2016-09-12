
public class quick {
	int pivotpoint = 0;

	public int[] quicksort(int low, int high, int[] input) {
		if (high > low) {
			partition(low, high, input);
			quicksort(low, pivotpoint - 1, input);
			quicksort(pivotpoint + 1, high, input);
		}
		
		return input;
	}
	
	public void partition(int low, int high, int[] input) {
		int i, j;
		int pivotitem;
		pivotitem = input[low];
		j = low;
		for(i = low + 1; i <= high; i++) {
			if (input[i] < pivotitem) {
				j++;
				exchange(i,j, input);
			}
		}
		pivotpoint = j;
		exchange(low, pivotpoint, input);
	}

	public void exchange(int i, int j, int[] input) {
		int temp;
		temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}
}
