package tapasya.ds;

import java.util.Arrays;

import org.apache.log4j.Logger;

public class QuickSort extends AbstractSort {
	final static Logger logger = Logger.getLogger(QuickSort.class);
	public QuickSort(int[] array) {
		super(array);
	}
	public void sort() {
		quicksort(0, n - 1);
	}
	private void quicksort(int low, int high) {
		int i = low, j = high;
		// Get the pivot element from the middle of the list
		int pivotIndex = low + (high - low) / 2;
		int pivot = array[pivotIndex];
		logger.debug("Pivot "+pivotIndex + "pivot number "+pivot );
		// Divide into two lists
		while (i <= j) {
			// If the current value from the left list is smaller than the pivot
			// element then get the next element from the left list
			while (array[i] < pivot) {
				i++;
			}
			// If the current value from the right list is larger than the pivot
			// element then get the next element from the right list
			while (array[j] > pivot) {
				j--;
			}
			// If we have found a value in the left list which is larger than
			// the pivot element and if we have found a value in the right list
			// which is smaller than the pivot element then we exchange the
			// values.
			// As we are done we can increase i and j
			if (i <= j) {
				exchangeNumbers(i, j);
				i++;
				j--;
				logger.debug(Arrays.toString(array));
			}
		}
		// Recursion
		if (low < j)
			quicksort(low, j);
		if (i < high)
			quicksort(i, high);
	}
}
