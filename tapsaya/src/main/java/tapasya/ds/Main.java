package tapasya.ds;

import java.util.Arrays;

public class Main {
	public static void main(String... args) {
		int arr[] = { 3, 60, 35, 2, 45, 320, 5 };
		System.out.println(Arrays.toString(arr));
		new QuickSort(arr).sort();
		System.out.println(Arrays.toString(arr));
	}
}
