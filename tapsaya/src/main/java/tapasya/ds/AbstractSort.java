package tapasya.ds;

import org.apache.log4j.Logger;

public abstract class AbstractSort {
	final static Logger logger = Logger.getLogger(AbstractSort.class);
	protected int[] array;
	protected int n;

	public AbstractSort(int[] array) {
		super();
		this.array = array;
		this.n = array.length;
	}

	protected void exchangeNumbers(int p, int q) {
		int tmp = array[p];
		array[p] = array[q];
		array[q] = tmp;
	}

	public abstract void sort();
}