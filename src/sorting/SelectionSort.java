package sorting;

import java.util.Arrays;

public class SelectionSort {
	public static void main (String[] args) throws java.lang.Exception
    {
        int[] arr = {2, 7, 1, 3, 5, 15, 11, 58, 1};
        int[] sortedArr = selectionSort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }
    
    public static int[] selectionSort(int [] arr) {
        int min_index = 0;
        //int count;
        for (int i = 0; i < arr.length - 1; i++) {
            min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                //count++;
                if (arr[j] < arr[min_index]) {
                    swap(arr, j, min_index);
                }
            }
        }
        //System.out.println("No. of comparison " + count);
        return arr;
    }
    
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}