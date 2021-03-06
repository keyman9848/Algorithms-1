/**
 * Copyright 2020 jingedawang
 */
package sort;

import utils.ArrayGenerator;
import utils.ArrayPrinter;
import utils.TimeRecorder;

/**
 * <h3>Insertion sort algorithm</h3>
 */
public class InsertionSort implements Sort {

	/**
	 * Test code.
	 */
	public static void main(String[] args) {
		int[] arr = ArrayGenerator.fixedArray();
//		int[] arr = IntegerArrayGenerator.randomArray(100, 100);
		ArrayPrinter.print(arr);
		
		Sort sort = new InsertionSort();
		TimeRecorder timeRecorder = new TimeRecorder();
		timeRecorder.start();
		sort.sort(arr);
		timeRecorder.stop();
		timeRecorder.showElapsedTime();
		
		ArrayPrinter.print(arr);
	}

	/**
	 * Insertion sort.
	 * @param arr Integer array to be sorted.
	 */
	public void sort(int[] arr) {
		for (int j = 1; j < arr.length; j++) {
			int key = arr[j];
			// Insert arr[j] into the sorted sequence arr[0..j-1].
			int i = j - 1;
			while (i >= 0 && arr[i] > key) {
				arr[i + 1] = arr[i];
				i--;
			}
			arr[i + 1] = key;
		}
	}

	/**
	 * Insertion sort for double array.
	 * @param arr Double array to be sorted.
	 */
	public void sort(double[] arr) {
		for (int j = 1; j < arr.length; j++) {
			double key = arr[j];
			// Insert arr[j] into the sorted sequence arr[0..j-1].
			int i = j - 1;
			while (i >= 0 && arr[i] > key) {
				arr[i + 1] = arr[i];
				i--;
			}
			arr[i + 1] = key;
		}
	}

}