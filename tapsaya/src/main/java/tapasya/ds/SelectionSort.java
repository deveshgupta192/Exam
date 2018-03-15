package tapasya.ds;

import java.util.Arrays;

import org.apache.log4j.Logger;

public class SelectionSort extends AbstractSort {

	final static Logger logger = Logger.getLogger(SelectionSort.class);

	public SelectionSort(int[] array) {
		super(array);
	}

	@Override
	public void sort() {
		for (int i = 0; i < array.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[index]) {
					index = j;
				}
			}
			exchangeNumbers(index, i);
			logger.debug(Arrays.toString(array));
		}
	}
}
