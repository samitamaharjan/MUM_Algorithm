package sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 2, 7, 1, 3, 5, 15, 11, 58, 1 };
		int[] sortedArr = bubbleSort(arr);
		System.out.println(Arrays.toString(sortedArr));
	}

	public static int[] bubbleSort(int[] arr) {
		// int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				// count++;
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				}
			}
		}
		// System.out.println("No. of comparison " + count);
		return arr;
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
