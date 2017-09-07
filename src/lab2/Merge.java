package lab2;

import java.util.Arrays;

public class Merge {

	public static void main (String[] args) {
        int[] arr1 = {1, 4, 5, 8, 17};
        int[] arr2 = {2, 4, 8, 11, 13, 21, 23, 25};
        int[] arr = merge(arr1, arr2);
        System.out.println(Arrays.toString(arr));
    }
    
    public static int[] merge(int[] arr1, int[] arr2) {
        int len = arr1.length + arr2.length;
        int[] arr = new int[len];
        
        int i = 0, j = 0, pos = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr[pos] = arr1[i];
                pos++;
                i++;
            } else {
                arr[pos] = arr2[j];
                pos++;
                j++;
            }
        }
        
        while (i < arr1.length) {
            arr[pos++] = arr1[i++];
        }
        
        while (j < arr2.length){
            arr[pos++] = arr2[j++];
        }
        
        return arr;
     }
}

/*
Algorithm: merge(arr1, arr2)
    
    Input <- int arrays arr1 and arr2
    Output <- merged int array arr
    
    len <- sum of length of arrays arr1 and arr2
    arr <- new int array with length len
    i <- 0
    j <- 0
    pos <- 0
    
    while (i < arr1.length and j < arr2.length) do
        if (arr1[i] < arr2[j]) then 
            arr[pos] <- arr1[i] 
            pos <- pos + 1
            i <- i + 1
        else 
            arr[pos] <- arr2[j]
            pos <- pos + 1
            j <- j + 1
            
    while (i < arr1.length) do 
        arr[pos] <- arr1[i] 
        pos <- pos + 1
        i <- i + 1    
    
    while (j < arr2.length) do 
        arr[pos] <- arr2[j]
        pos <- pos + 1
        j <- j + 1
    
    return arr
    
*/  
