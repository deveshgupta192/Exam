package tapasya.ds;

import java.util.Arrays;

import org.apache.log4j.Logger;

public class BubbleSort extends AbstractSort {
	final static Logger logger = Logger.getLogger(BubbleSort.class);
	public BubbleSort(int[] array) {
		super(array);
	}
	public void sort() {
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n - i; j++) {
				if (array[j - 1] > array[j]) {
					exchangeNumbers(j - 1, j);
				}
			}
			logger.debug(Arrays.toString(array));
		}
	}
}
