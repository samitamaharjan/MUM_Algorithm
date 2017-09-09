package sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void main (String[] args) throws java.lang.Exception
    {
        int[] arr = {2, 7, 1, 3, 5, 15, 11, 58, 1};
        int[] sortedArr = insertionSort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }
    
    public static int[] insertionSort(int [] arr) {
        int j; int temp;
        
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i;
            while(j > 0 && temp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
        return arr;
    }
    
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
