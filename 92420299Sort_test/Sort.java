public class Sort
{
public int[] bubbleSort(int[] inputArray)
{
	int i,j,temp;
	for(i = 0;i<inputArray.length;i++){
		for(j=1;j<inputArray.length;j++){
			if(inputArray[j-1]>inputArray[j]){
				temp = inputArray[j-1];
				inputArray[j-1] = inputArray[j];
				inputArray[j] = temp;

			}
		}
	}
	return inputArray;
}

public int[] quickSort(int[] inputArray)
{
	quick a = new quick();
	inputArray = a.quicksort(0,inputArray.length-1,inputArray);
	return inputArray;
}
public int[] heapSort(int[] inputArray)
{
	heap_sort a = new heap_sort();
	inputArray = a.heapSort(inputArray);
	return inputArray;
}
public int[] mergeSort(int[] inputArray)
{
	merge a = new merge();
	inputArray = a.mergesort(inputArray.length,inputArray);
	return inputArray;
}
}