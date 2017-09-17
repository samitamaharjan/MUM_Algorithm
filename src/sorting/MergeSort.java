package sorting;

import java.util.Arrays;
import java.util.Date;

public class MergeSort {
	//private final int INSERTION_SORT_VAL = 20;
	int[] theArray;
		
	//public sorter
	public int[] sort(int[] input){
		int n = input.length;
		int[] tempStorage = new int[n];
		theArray = input;
		mergeSort(tempStorage,0,n-1);
		return theArray;
	}	
	
	/** Merges the ranges [lowerPointer,upperPointer-1] and [upperPointer,upperBound] in place */
	private void merge(int[] tempStorage, int lowerPointer, int upperPointer, int upperBound) {
		int j = 0; //tempStorage index
		int lowerBound = lowerPointer;
		int n = upperBound - lowerBound + 1; //total number of elements to rearrange
		
		//view the range [lowerBound,upperBound] as two arrays
        //[lowerBound, mid], [mid+1,upperBound] to be merged
		int mid = upperPointer -1;  
		
		while(lowerPointer <= mid && upperPointer <= upperBound){
			if(theArray[lowerPointer] < theArray[upperPointer]){
				tempStorage[j++] = theArray[lowerPointer++];
			}
			else {
				tempStorage[j++] = theArray[upperPointer++];
			}
		}
		//left array may still have elements -- insert them into tempStorage
		while(lowerPointer <= mid) {
			tempStorage[j++] = theArray[lowerPointer++];
		}
		//right array may still have elements -- insert these into tempStorage
		while(upperPointer <= upperBound){
			tempStorage[j++] = theArray[upperPointer++];
		}
		//replace the range [lowerBound,upperBound] in theArray with 
		//the range [0,n-1] just created in tempStorage
		for(j=0; j<n; ++j) {
			theArray[lowerBound+j] = tempStorage[j];
		}		
	}	
	
	void mergeSort(int[] tempStorage, int lower, int upper) {
		if(lower==upper){
			return;
		}
		int mid = (lower+upper)/2;
			mergeSort(tempStorage,lower,mid);  //sort left half
			mergeSort(tempStorage,mid+1, upper); //sort right half
			merge(tempStorage,lower,mid+1,upper); //merge them
	}
	
	public static void main(String[] args) {
int[] arr = generateRandomNumbers(1000);
		
		long startTime = new Date().getTime();
		
		MergeSort msp = new MergeSort();
		// System.out.println(Arrays.toString(arr));
		msp.sort(arr);
		long endTime = new Date().getTime();
		long timeTaken = endTime - startTime;
		System.out.println(Arrays.toString(arr));
		System.out.println("Time taken:" + timeTaken * 1000 + "milliseconds");
	}
	
	public static int[] generateRandomNumbers(int size) {
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = (int) (Math.random() * 100);
		}
		return arr;
	}

}
