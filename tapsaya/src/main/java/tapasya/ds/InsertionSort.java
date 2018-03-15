package tapasya.ds;

import java.util.Arrays;

import org.apache.log4j.Logger;

public class InsertionSort extends AbstractSort {
	final static Logger logger = Logger.getLogger(BubbleSort.class);
	public InsertionSort(int[] array) {
		super(array);
	}
	@Override
	public void sort() {
		for (int j = 1; j < n; j++) {
			int key = array[j];
			int i = j - 1;
			while ((i > -1) && array[i] > key) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = key;
			logger.debug(Arrays.toString(array));
		}
	}
}
