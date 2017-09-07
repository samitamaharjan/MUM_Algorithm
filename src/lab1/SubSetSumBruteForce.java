package lab1;

import java.util.ArrayList;
import java.util.List;

public class SubSetSumBruteForce {
	public static void main (String[] args) {
        int[] input = {1, 3, 4};
        //System.out.println(subsets(input));
        System.out.println(bruteForce(input, 7));
    }
    
	// PowerSet
    public static List<List<Integer>> subsets(int[] arr) { 
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        result.add(new ArrayList<Integer>());
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = result.size() - 1; j >= 0; j--) {
                List<Integer> newList = new ArrayList<>();
                newList.add(arr[i]);
                newList.addAll(result.get(j));
                result.add(newList);
            }
        }
        return result;
    }
    
    public static boolean bruteForce(int[] arr, int target) {
        List<List<Integer>> subsets = subsets(arr);
        for (int i = 0; i < subsets.size(); i++) {
            int sum = 0;
            List<Integer> subset = subsets.get(i);
            for (int j = 0; j < subset.size(); j++) {
                int num = subset.get(j);
                sum += num;
            }
            if (sum == target) return true;
        }
        return false;
    }
}
